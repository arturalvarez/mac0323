/*
  Simple grep implementation in C using regex library.
*/

#include <regex.h>
#include <stdio.h>
#include "error.h"
#include "buffer.h"

static void show_usage()
{
  printf("usage: mygrep <regex> <input file>\n");
}

int main(int argc, char **argv)
{
  set_prog_name("regex");

  if (argc != 3) {
    show_usage();
    return -1;
  }

  // Open input file.
  FILE *input = fopen(argv[2], "r");

  if (!input)
    die("failed to open input file %s:", argv[2]);

  // Compile the regex.
  regex_t re;

  if (regcomp(&re, argv[1], REG_EXTENDED))
    die("error compiling regex");

  // Read each line of input and outputs those that match the regex.
  Buffer *B = buffer_create();

  while (read_line(input, B)) {
    // We remove the trailing newline, if it is there.
    if (B->data[B->i - 2] == '\n')
      B->data[B->i - 2] = 0;
    
    if (!regexec(&re, B->data, 0, NULL, 0))
      printf("%s\n", B->data);
  }

  // Clean-up.
  buffer_destroy(B);
  regfree(&re);
  fclose(input);

  return 0;
}
