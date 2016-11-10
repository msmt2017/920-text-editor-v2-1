/*
 * Copyright (C) 2016 Jecelyin Peng <jecelyin@gmail.com>
 *
 * This file is part of 920 Text Editor.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jecelyin.editor.v2.highlight.lang;

import com.jecelyin.editor.v2.highlight.LangDefine;
import com.jecelyin.editor.v2.highlight.syntax.*;
/**
 * @author Jecelyin Peng <jecelyin@gmail.com>
 */
public class PerlLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "#";
        PROPERTY1.NAME = "lineComment";

        PROPERTY2.VALUE = "{";
        PROPERTY2.NAME = "indentOpenBrackets";

        PROPERTY3.VALUE = "}";
        PROPERTY3.NAME = "indentCloseBrackets";

        PROPERTY4.VALUE = "(";
        PROPERTY4.NAME = "unalignedOpenBrackets";

        PROPERTY5.VALUE = ")";
        PROPERTY5.NAME = "unalignedCloseBrackets";

        PROPERTY6.VALUE = "[^#]*\\.\\s*$";
        PROPERTY6.NAME = "indentNextLine";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "FALSE";

        EOL_SPAN1.text = "#";
        EOL_SPAN1.TYPE = "COMMENT1";

        SPAN1.TYPE = "LABEL";
        SPAN1.AT_LINE_START = "TRUE";
        SPAN1.DELEGATE = "POD";

        BEGIN1.text = "=head1";

        END1.text = "=cut";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LABEL";
        SPAN2.AT_LINE_START = "TRUE";
        SPAN2.DELEGATE = "POD";

        BEGIN2.text = "=head2";

        END2.text = "=cut";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "LABEL";
        SPAN3.AT_LINE_START = "TRUE";
        SPAN3.DELEGATE = "POD";

        BEGIN3.text = "=head3";

        END3.text = "=cut";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "LABEL";
        SPAN4.AT_LINE_START = "TRUE";
        SPAN4.DELEGATE = "POD";

        BEGIN4.text = "=head4";

        END4.text = "=cut";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.TYPE = "LABEL";
        SPAN5.AT_LINE_START = "TRUE";
        SPAN5.DELEGATE = "POD";

        BEGIN5.text = "=item";

        END5.text = "=cut";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.TYPE = "LABEL";
        SPAN6.AT_LINE_START = "TRUE";
        SPAN6.DELEGATE = "POD";

        BEGIN6.text = "=over";

        END6.text = "=cut";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        SPAN SPAN7 = new SPAN();
        SPAN7.TYPE = "LABEL";
        SPAN7.AT_LINE_START = "TRUE";
        SPAN7.DELEGATE = "POD";

        BEGIN7.text = "=back";

        END7.text = "=cut";


        SPAN7.BEGIN = new BEGIN[] { BEGIN7, };

        SPAN SPAN8 = new SPAN();
        SPAN8.TYPE = "LABEL";
        SPAN8.AT_LINE_START = "TRUE";
        SPAN8.DELEGATE = "POD";

        BEGIN8.text = "=pod";

        END8.text = "=cut";


        SPAN8.BEGIN = new BEGIN[] { BEGIN8, };

        SPAN SPAN9 = new SPAN();
        SPAN9.TYPE = "LABEL";
        SPAN9.AT_LINE_START = "TRUE";
        SPAN9.DELEGATE = "POD";

        BEGIN9.text = "=for";

        END9.text = "=cut";


        SPAN9.BEGIN = new BEGIN[] { BEGIN9, };

        SPAN SPAN10 = new SPAN();
        SPAN10.TYPE = "LABEL";
        SPAN10.AT_LINE_START = "TRUE";
        SPAN10.DELEGATE = "POD";

        BEGIN10.text = "=begin";

        END10.text = "=cut";


        SPAN10.BEGIN = new BEGIN[] { BEGIN10, };

        SPAN SPAN11 = new SPAN();
        SPAN11.TYPE = "LABEL";
        SPAN11.AT_LINE_START = "TRUE";
        SPAN11.DELEGATE = "POD";

        BEGIN11.text = "=end";

        END11.text = "=cut";


        SPAN11.BEGIN = new BEGIN[] { BEGIN11, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "*\"";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "*'";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "&\"";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "&'";
        SEQ4.TYPE = "OPERATOR";

        SPAN12.NO_LINE_BREAK = "TRUE";
        SPAN12.TYPE = "KEYWORD2";
        SPAN12.DELEGATE = "VARIABLE";

        BEGIN12.text = "${";

        END12.text = "}";


        SPAN12.BEGIN = new BEGIN[] { BEGIN12, };

        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "\\$#?((\\p{Alpha}\\w*|_\\w+)?::)*(\\p{Alpha}\\w*|_\\w+|\\d+)";
        SEQ_REGEXP1.TYPE = "KEYWORD2";
        SEQ_REGEXP1.HASH_CHAR = "$";

        SEQ_REGEXP2.text = "@((\\p{Alpha}\\w*|_\\w+)?::)*(\\p{Alpha}\\w*|_\\w+|\\d+)";
        SEQ_REGEXP2.TYPE = "KEYWORD2";
        SEQ_REGEXP2.HASH_CHAR = "@";

        SEQ_REGEXP3.text = "%((\\p{Alpha}\\w*|_\\w+)?::)*(\\p{Alpha}\\w*|_\\w+|\\d+)";
        SEQ_REGEXP3.TYPE = "KEYWORD2";
        SEQ_REGEXP3.HASH_CHAR = "%";

        SEQ_REGEXP4.text = "\\$\\$+((\\p{Alpha}\\w*|_\\w+)?::)*(\\p{Alpha}\\w*|_\\w+|\\d+)";
        SEQ_REGEXP4.TYPE = "KEYWORD4";
        SEQ_REGEXP4.HASH_CHAR = "$$";

        SEQ_REGEXP5.text = "@\\$((\\p{Alpha}\\w*|_\\w+)?::)*(\\p{Alpha}\\w*|_\\w+|\\d+)";
        SEQ_REGEXP5.TYPE = "KEYWORD4";
        SEQ_REGEXP5.HASH_CHAR = "@$";

        SEQ_REGEXP6.text = "%\\$((\\p{Alpha}\\w*|_\\w+)?::)*(\\p{Alpha}\\w*|_\\w+|\\d+)";
        SEQ_REGEXP6.TYPE = "KEYWORD4";
        SEQ_REGEXP6.HASH_CHAR = "%$";

        SEQ_REGEXP7.text = "\\*((\\p{Alpha}\\w*|_\\w+)?::)*(\\p{Alpha}\\w*|_\\w+|\\d+)";
        SEQ_REGEXP7.TYPE = "KEYWORD4";
        SEQ_REGEXP7.HASH_CHAR = "*";

        SEQ_REGEXP8.text = "\\$\\^\\p{Alpha}";
        SEQ_REGEXP8.TYPE = "KEYWORD2";
        SEQ_REGEXP8.HASH_CHAR = "$^";

        SEQ_REGEXP9.text = "\\$\\p{Punct}";
        SEQ_REGEXP9.TYPE = "KEYWORD2";
        SEQ_REGEXP9.HASH_CHAR = "$";

        SEQ_REGEXP10.text = "\\\\[@%\\$&]((\\p{Alpha}\\w*|_\\w+)?::)*(\\p{Alpha}\\w*|_\\w+|\\d+)";
        SEQ_REGEXP10.TYPE = "KEYWORD4";
        SEQ_REGEXP10.HASH_CHAR = "\\";

        SPAN13.NO_LINE_BREAK = "TRUE";
        SPAN13.TYPE = "KEYWORD4";
        SPAN13.DELEGATE = "MAIN";

        BEGIN13.text = "&{";

        END13.text = "}";


        SPAN13.BEGIN = new BEGIN[] { BEGIN13, };

        SEQ_REGEXP SEQ_REGEXP11 = new SEQ_REGEXP();
        SEQ_REGEXP11.text = "&\\$((\\p{Alpha}\\w*|_\\w+)?::)*(\\p{Alpha}\\w*|_\\w+|\\d+)";
        SEQ_REGEXP11.TYPE = "FUNCTION";
        SEQ_REGEXP11.HASH_CHAR = "&$";

        SEQ_REGEXP12.text = "&\\p{Alpha}[\\p{Alnum}_]*'\\p{Alpha}[\\p{Alnum}_]*";
        SEQ_REGEXP12.TYPE = "FUNCTION";
        SEQ_REGEXP12.HASH_CHAR = "&";

        SPAN14.TYPE = "LITERAL1";
        SPAN14.DELEGATE = "LITERAL";

        BEGIN14.text = "\"";

        END14.text = "\"";


        SPAN14.BEGIN = new BEGIN[] { BEGIN14, };

        SPAN SPAN15 = new SPAN();
        SPAN15.TYPE = "LITERAL1";
        SPAN15.DELEGATE = "APOSTR";

        BEGIN15.text = "'";

        END15.text = "'";


        SPAN15.BEGIN = new BEGIN[] { BEGIN15, };

        SEQ_REGEXP SEQ_REGEXP13 = new SEQ_REGEXP();
        SEQ_REGEXP13.text = "\\b\\w+\\b(?=\\s*=>)";
        SEQ_REGEXP13.TYPE = "LITERAL1";

        SEQ_REGEXP14.text = "-[\\p{Lower}]\\w+";
        SEQ_REGEXP14.TYPE = "LITERAL1";
        SEQ_REGEXP14.HASH_CHAR = "-";

        SEQ_REGEXP15.text = "-[\\p{Lower}]";
        SEQ_REGEXP15.TYPE = "KEYWORD3";
        SEQ_REGEXP15.HASH_CHAR = "-";

        SPAN_REGEXP1.NO_LINE_BREAK = "TRUE";
        SPAN_REGEXP1.TYPE = "OPERATOR";
        SPAN_REGEXP1.DELEGATE = "LITERAL";
        SPAN_REGEXP1.HASH_CHAR = "{";

        BEGIN16.text = "\\{(?=\\s*[\\p{Alpha}_\\-][\\p{Alnum}_]*\\s*\\})";

        END16.text = "}";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN16, };

        SPAN SPAN16 = new SPAN();
        SPAN16.NO_LINE_BREAK = "FALSE";
        SPAN16.TYPE = "OPERATOR";
        SPAN16.DELEGATE = "MAIN";

        BEGIN17.text = "{";

        END17.text = "}";


        SPAN16.BEGIN = new BEGIN[] { BEGIN17, };

        SPAN SPAN17 = new SPAN();
        SPAN17.NO_LINE_BREAK = "TRUE";
        SPAN17.TYPE = "KEYWORD4";
        SPAN17.DELEGATE = "MAIN";

        BEGIN18.text = "@{";

        END18.text = "}";


        SPAN17.BEGIN = new BEGIN[] { BEGIN18, };

        SPAN SPAN18 = new SPAN();
        SPAN18.NO_LINE_BREAK = "TRUE";
        SPAN18.TYPE = "KEYWORD4";
        SPAN18.DELEGATE = "MAIN";

        BEGIN19.text = "%{";

        END19.text = "}";


        SPAN18.BEGIN = new BEGIN[] { BEGIN19, };

        MARK_PREVIOUS MARK_PREVIOUS1 = new MARK_PREVIOUS();
        MARK_PREVIOUS1.text = ":";
        MARK_PREVIOUS1.TYPE = "LABEL";
        MARK_PREVIOUS1.AT_LINE_START = "TRUE";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        SEQ_REGEXP16.text = "__\\w+__";
        SEQ_REGEXP16.TYPE = "KEYWORD4";
        SEQ_REGEXP16.HASH_CHAR = "__";

        SPAN19.TYPE = "KEYWORD3";
        SPAN19.DELEGATE = "EXEC";

        BEGIN20.text = "`";

        END20.text = "`";


        SPAN19.BEGIN = new BEGIN[] { BEGIN20, };

        SEQ_REGEXP SEQ_REGEXP17 = new SEQ_REGEXP();
        SEQ_REGEXP17.text = "<[\\p{Punct}\\p{Alnum}_]*>";
        SEQ_REGEXP17.TYPE = "KEYWORD4";
        SEQ_REGEXP17.HASH_CHAR = "<";

        SPAN_REGEXP2.TYPE = "LITERAL2";
        SPAN_REGEXP2.DELEGATE = "LITERAL";
        SPAN_REGEXP2.HASH_CHAR = "<<";


        END21.text = "$2";
        END21.AT_LINE_START = "TRUE";


        SPAN_REGEXP2.BEGIN = new BEGIN[] { BEGIN21, };

        SPAN_REGEXP SPAN_REGEXP3 = new SPAN_REGEXP();
        SPAN_REGEXP3.TYPE = "LITERAL2";
        SPAN_REGEXP3.DELEGATE = "LITERAL";
        SPAN_REGEXP3.HASH_CHAR = "<<";


        END22.text = "$1";
        END22.AT_LINE_START = "TRUE";


        SPAN_REGEXP3.BEGIN = new BEGIN[] { BEGIN22, };

        SEQ_REGEXP SEQ_REGEXP18 = new SEQ_REGEXP();
        SEQ_REGEXP18.text = "/.*?[^\\\\]/([cgimosx]+\\b|(?=[^cgimosx])|$)(?!\\s*[\\d\\$\\@\\(\\{\\-A-Z\"'])";
        SEQ_REGEXP18.AT_WORD_START = "TRUE";
        SEQ_REGEXP18.TYPE = "MARKUP";
        SEQ_REGEXP18.HASH_CHAR = "/";

        SPAN_REGEXP4.AT_WORD_START = "TRUE";
        SPAN_REGEXP4.NO_LINE_BREAK = "FALSE";
        SPAN_REGEXP4.TYPE = "LITERAL1";
        SPAN_REGEXP4.ESCAPE = "\\";
        SPAN_REGEXP4.MATCH_TYPE = "OPERATOR";
        SPAN_REGEXP4.HASH_CHAR = "q";

        BEGIN23.text = "q[qxw]?([#/\\|!])";

        END23.text = "~1";


        SPAN_REGEXP4.BEGIN = new BEGIN[] { BEGIN23, };

        SPAN_REGEXP SPAN_REGEXP5 = new SPAN_REGEXP();
        SPAN_REGEXP5.AT_WORD_START = "TRUE";
        SPAN_REGEXP5.NO_LINE_BREAK = "FALSE";
        SPAN_REGEXP5.DELEGATE = "QUOTED_BRACKET";
        SPAN_REGEXP5.MATCH_TYPE = "OPERATOR";
        SPAN_REGEXP5.HASH_CHAR = "q";

        BEGIN24.text = "q[qxw]?(\\[)";

        END24.text = "~1";


        SPAN_REGEXP5.BEGIN = new BEGIN[] { BEGIN24, };

        SPAN_REGEXP SPAN_REGEXP6 = new SPAN_REGEXP();
        SPAN_REGEXP6.AT_WORD_START = "TRUE";
        SPAN_REGEXP6.NO_LINE_BREAK = "FALSE";
        SPAN_REGEXP6.DELEGATE = "QUOTED_BRACE";
        SPAN_REGEXP6.MATCH_TYPE = "OPERATOR";
        SPAN_REGEXP6.HASH_CHAR = "q";

        BEGIN25.text = "q[qxw]?(\\{)";

        END25.text = "~1";


        SPAN_REGEXP6.BEGIN = new BEGIN[] { BEGIN25, };

        SPAN_REGEXP SPAN_REGEXP7 = new SPAN_REGEXP();
        SPAN_REGEXP7.AT_WORD_START = "TRUE";
        SPAN_REGEXP7.NO_LINE_BREAK = "FALSE";
        SPAN_REGEXP7.DELEGATE = "QUOTED_PAREN";
        SPAN_REGEXP7.MATCH_TYPE = "OPERATOR";
        SPAN_REGEXP7.HASH_CHAR = "q";

        BEGIN26.text = "q[qxw]?(\\()";

        END26.text = "~1";


        SPAN_REGEXP7.BEGIN = new BEGIN[] { BEGIN26, };

        SPAN_REGEXP SPAN_REGEXP8 = new SPAN_REGEXP();
        SPAN_REGEXP8.AT_WORD_START = "TRUE";
        SPAN_REGEXP8.NO_LINE_BREAK = "FALSE";
        SPAN_REGEXP8.TYPE = "LITERAL1";
        SPAN_REGEXP8.ESCAPE = "\\";
        SPAN_REGEXP8.MATCH_TYPE = "OPERATOR";
        SPAN_REGEXP8.HASH_CHAR = "q";

        BEGIN27.text = "qr([#/\\|!])";

        END27.text = "~1";


        SPAN_REGEXP8.BEGIN = new BEGIN[] { BEGIN27, };

        SPAN_REGEXP SPAN_REGEXP9 = new SPAN_REGEXP();
        SPAN_REGEXP9.AT_WORD_START = "TRUE";
        SPAN_REGEXP9.NO_LINE_BREAK = "FALSE";
        SPAN_REGEXP9.DELEGATE = "QUOTED_BRACKET";
        SPAN_REGEXP9.MATCH_TYPE = "OPERATOR";
        SPAN_REGEXP9.HASH_CHAR = "q";

        BEGIN28.text = "qr(\\[)";

        END28.text = "~1";


        SPAN_REGEXP9.BEGIN = new BEGIN[] { BEGIN28, };

        SPAN_REGEXP SPAN_REGEXP10 = new SPAN_REGEXP();
        SPAN_REGEXP10.AT_WORD_START = "TRUE";
        SPAN_REGEXP10.NO_LINE_BREAK = "FALSE";
        SPAN_REGEXP10.DELEGATE = "QUOTED_BRACE";
        SPAN_REGEXP10.MATCH_TYPE = "OPERATOR";
        SPAN_REGEXP10.HASH_CHAR = "q";

        BEGIN29.text = "qr(\\{)";

        END29.text = "~1";


        SPAN_REGEXP10.BEGIN = new BEGIN[] { BEGIN29, };

        SPAN_REGEXP SPAN_REGEXP11 = new SPAN_REGEXP();
        SPAN_REGEXP11.AT_WORD_START = "TRUE";
        SPAN_REGEXP11.NO_LINE_BREAK = "FALSE";
        SPAN_REGEXP11.DELEGATE = "QUOTED_PAREN";
        SPAN_REGEXP11.ESCAPE = "\\";
        SPAN_REGEXP11.MATCH_TYPE = "OPERATOR";
        SPAN_REGEXP11.HASH_CHAR = "q";

        BEGIN30.text = "qr(\\()";

        END30.text = "~1";


        SPAN_REGEXP11.BEGIN = new BEGIN[] { BEGIN30, };

        SEQ_REGEXP SEQ_REGEXP19 = new SEQ_REGEXP();
        SEQ_REGEXP19.text = "tr\\s*\\{.*?[^\\\\]\\}\\s*\\{(?:.*?[^\\\\])*?\\}[cds]*";
        SEQ_REGEXP19.AT_WORD_START = "TRUE";
        SEQ_REGEXP19.TYPE = "MARKUP";
        SEQ_REGEXP19.HASH_CHAR = "tr";

        SEQ_REGEXP20.text = "tr([^\\p{Alnum}\\p{Space}\\}])(?:.*?)\\1(?:.*?)\\1[cds]*";
        SEQ_REGEXP20.AT_WORD_START = "TRUE";
        SEQ_REGEXP20.TYPE = "MARKUP";
        SEQ_REGEXP20.HASH_CHAR = "tr";

        SEQ_REGEXP21.text = "y\\s*\\{.*?[^\\\\]\\}\\s*\\{(?:.*?[^\\\\])*?\\}[cds]*";
        SEQ_REGEXP21.AT_WORD_START = "TRUE";
        SEQ_REGEXP21.TYPE = "MARKUP";
        SEQ_REGEXP21.HASH_CHAR = "y";

        SEQ_REGEXP22.text = "y([^\\p{Alnum}\\p{Space}\\}_])(?:.*?)\\1(?:.*?)\\1[cds]*";
        SEQ_REGEXP22.AT_WORD_START = "TRUE";
        SEQ_REGEXP22.TYPE = "MARKUP";
        SEQ_REGEXP22.HASH_CHAR = "y";

        SEQ_REGEXP23.text = "m\\s*\\{.*?[^\\\\]\\}[cgimosx]*";
        SEQ_REGEXP23.AT_WORD_START = "TRUE";
        SEQ_REGEXP23.TYPE = "MARKUP";
        SEQ_REGEXP23.HASH_CHAR = "m";

        SEQ_REGEXP24.text = "m([^\\p{Alnum}\\p{Space}\\}])(?:.*?[^\\\\])\\1[cgimosx]*";
        SEQ_REGEXP24.AT_WORD_START = "TRUE";
        SEQ_REGEXP24.TYPE = "MARKUP";
        SEQ_REGEXP24.HASH_CHAR = "m";

        SEQ_REGEXP25.text = "s\\s*\\{.*?\\}\\s*\\{.*?\\}[egimosx]*";
        SEQ_REGEXP25.AT_WORD_START = "TRUE";
        SEQ_REGEXP25.TYPE = "MARKUP";
        SEQ_REGEXP25.HASH_CHAR = "s";

        SEQ_REGEXP26.text = "s([^\\p{Alnum}\\p{Space}\\}])(?:.*?)\\1(?:.*?)\\1[egimosx]*";
        SEQ_REGEXP26.AT_WORD_START = "TRUE";
        SEQ_REGEXP26.TYPE = "MARKUP";
        SEQ_REGEXP26.HASH_CHAR = "s";

        SEQ5.text = "||";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "//";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "&&";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "!=";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "<=>";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "->";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "=>";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "==";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "=~";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = "!~";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "~~";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "+=";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "-=";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "/=";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = "*=";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = ".=";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = "%=";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = "&=";
        SEQ22.TYPE = "OPERATOR";

        SEQ23.text = "|=";
        SEQ23.TYPE = "OPERATOR";

        SEQ24.text = "**=";
        SEQ24.TYPE = "OPERATOR";

        SEQ25.text = "<<=";
        SEQ25.TYPE = "OPERATOR";

        SEQ26.text = ">>=";
        SEQ26.TYPE = "OPERATOR";

        SEQ27.text = "&&=";
        SEQ27.TYPE = "OPERATOR";

        SEQ28.text = "||=";
        SEQ28.TYPE = "OPERATOR";

        SEQ29.text = "^=";
        SEQ29.TYPE = "OPERATOR";

        SEQ30.text = "x=";
        SEQ30.TYPE = "OPERATOR";

        SEQ31.text = ">=";
        SEQ31.TYPE = "OPERATOR";

        SEQ32.text = "<=";
        SEQ32.TYPE = "OPERATOR";

        SEQ33.text = ">";
        SEQ33.TYPE = "OPERATOR";

        SEQ34.text = "<";
        SEQ34.TYPE = "OPERATOR";

        SEQ35.text = "|";
        SEQ35.TYPE = "OPERATOR";

        SEQ36.text = "&";
        SEQ36.TYPE = "OPERATOR";

        SEQ37.text = "!";
        SEQ37.TYPE = "OPERATOR";

        SEQ38.text = "=";
        SEQ38.TYPE = "OPERATOR";

        SEQ39.text = "!";
        SEQ39.TYPE = "OPERATOR";

        SEQ40.text = "+";
        SEQ40.TYPE = "OPERATOR";

        SEQ41.text = "-";
        SEQ41.TYPE = "OPERATOR";

        SEQ42.text = "/";
        SEQ42.TYPE = "OPERATOR";

        SEQ43.text = "**";
        SEQ43.TYPE = "OPERATOR";

        SEQ44.text = "*";
        SEQ44.TYPE = "OPERATOR";

        SEQ45.text = "^";
        SEQ45.TYPE = "OPERATOR";

        SEQ46.text = "~";
        SEQ46.TYPE = "OPERATOR";

        SEQ47.text = "{";
        SEQ47.TYPE = "OPERATOR";

        SEQ48.text = "}";
        SEQ48.TYPE = "OPERATOR";

        SEQ49.text = "?";
        SEQ49.TYPE = "OPERATOR";

        SEQ50.text = ":";
        SEQ50.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD1", new String[]{"new", "if", "until", "while", "elsif", "else", "unless", "for", "foreach", "BEGIN", "END", "caller", "continue", "die", "do", "dump", "eval", "exit", "goto", "last", "next", "redo", "return", "wantarray", "break", "default", "given", "when", "local", "my", "our", "package", "state", "use", "import", "no", "require", });
        KEYWORDS1.add("FUNCTION", new String[]{"sub", });
        KEYWORDS1.add("KEYWORD3", new String[]{"chomp", "chop", "chr", "crypt", "hex", "index", "lc", "lcfirst", "length", "oct", "ord", "pack", "reverse", "rindex", "sprintf", "substr", "uc", "ucfirst", "pos", "quotemeta", "split", "study", "abs", "atan2", "cos", "exp", "int", "log", "rand", "sin", "sqrt", "srand", "pop", "push", "shift", "splice", "unshift", "grep", "join", "map", "sort", "unpack", "delete", "each", "exists", "keys", "values", "binmode", "close", "closedir", "dbmclose", "dbmopen", "eof", "fileno", "flock", "format", "getc", "print", "printf", "read", "readdir", "rewinddir", "say", "seek", "seekdir", "select", "syscall", "sysread", "sysseek", "syswrite", "tell", "telldir", "truncate", "warn", "write", "vec", "chdir", "chmod", "chown", "chroot", "fcntl", "glob", "ioctl", "link", "lstat", "mkdir", "open", "opendir", "readlink", "rename", "rmdir", "stat", "symlink", "umask", "unlink", "utime", "defined", "formline", "reset", "scalar", "undef", "alarm", "exec", "fork", "getpgrp", "getppid", "getpriority", "kill", "pipe", "setpgrp", "setpriority", "sleep", "system", "times", "wait", "waitpid", "bless", "ref", "tie", "tied", "untie", "accept", "bind", "connect", "getpeername", "getsockname", "getsockopt", "listen", "recv", "send", "setsockopt", "shutdown", "socket", "socketpair", "msgctl", "msgget", "msgrcv", "msgsnd", "semctl", "semget", "semop", "shmctl", "shmget", "shmread", "shmwrite", "endgrent", "endhostent", "endnetent", "endpwent", "getgrent", "getgrgid", "getgrnam", "getlogin", "getpwent", "getpwnam", "getpwuid", "setgrent", "setpwent", "endprotoent", "endservent", "gethostbyaddr", "gethostbyname", "gethostent", "getnetbyaddr", "getnetbyname", "getnetent", "getprotobyname", "getprotobynumber", "getprotoent", "getservbyname", "getservbyport", "getservent", "sethostent", "setnetent", "setprotoent", "setservent", "gmtime", "localtime", "time", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, SEQ_REGEXP2, SEQ_REGEXP3, SEQ_REGEXP4, SEQ_REGEXP5, SEQ_REGEXP6, SEQ_REGEXP7, SEQ_REGEXP8, SEQ_REGEXP9, SEQ_REGEXP10, SEQ_REGEXP11, SEQ_REGEXP12, SEQ_REGEXP13, SEQ_REGEXP14, SEQ_REGEXP15, SEQ_REGEXP16, SEQ_REGEXP17, SEQ_REGEXP18, SEQ_REGEXP19, SEQ_REGEXP20, SEQ_REGEXP21, SEQ_REGEXP22, SEQ_REGEXP23, SEQ_REGEXP24, SEQ_REGEXP25, SEQ_REGEXP26, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, SPAN7, SPAN8, SPAN9, SPAN10, SPAN11, SPAN12, SPAN13, SPAN14, SPAN15, SPAN16, SPAN17, SPAN18, SPAN19, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, SEQ26, SEQ27, SEQ28, SEQ29, SEQ30, SEQ31, SEQ32, SEQ33, SEQ34, SEQ35, SEQ36, SEQ37, SEQ38, SEQ39, SEQ40, SEQ41, SEQ42, SEQ43, SEQ44, SEQ45, SEQ46, SEQ47, SEQ48, SEQ49, SEQ50, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, SPAN_REGEXP2, SPAN_REGEXP3, SPAN_REGEXP4, SPAN_REGEXP5, SPAN_REGEXP6, SPAN_REGEXP7, SPAN_REGEXP8, SPAN_REGEXP9, SPAN_REGEXP10, SPAN_REGEXP11, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "POD";
        RULES1.DEFAULT = "COMMENT2";

        MARK_FOLLOWING1.text = "=";
        MARK_FOLLOWING1.TYPE = "LABEL";
        MARK_FOLLOWING1.AT_LINE_START = "TRUE";


        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "LITERAL";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.ESCAPE = "\\";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "KEYWORD2";
        SPAN1.DELEGATE = "VARIABLE";

        BEGIN1.text = "${";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "KEYWORD2";
        SPAN2.DELEGATE = "VARIABLE";

        BEGIN2.text = "->{";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "\\$#?((\\p{Alpha}\\w*|_\\w+)?::)*(\\p{Alpha}\\w*|_\\w+|\\d+)";
        SEQ_REGEXP1.TYPE = "KEYWORD2";
        SEQ_REGEXP1.HASH_CHAR = "$";

        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "KEYWORD2";
        SPAN3.DELEGATE = "VARIABLE";

        BEGIN3.text = "@{";

        END3.text = "}";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        MARK_FOLLOWING MARK_FOLLOWING1 = new MARK_FOLLOWING();
        MARK_FOLLOWING1.text = "@";
        MARK_FOLLOWING1.TYPE = "KEYWORD2";

        SPAN4.NO_LINE_BREAK = "TRUE";
        SPAN4.TYPE = "KEYWORD2";
        SPAN4.DELEGATE = "VARIABLE";

        BEGIN4.text = "%{";

        END4.text = "}";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        MARK_FOLLOWING MARK_FOLLOWING2 = new MARK_FOLLOWING();
        MARK_FOLLOWING2.text = "%";
        MARK_FOLLOWING2.TYPE = "KEYWORD2";

        SEQ1.text = "|";
        SEQ1.TYPE = "LITERAL1";

        SEQ2.text = "&";
        SEQ2.TYPE = "LITERAL1";

        SEQ3.text = "!";
        SEQ3.TYPE = "LITERAL1";

        SEQ4.text = ">";
        SEQ4.TYPE = "LITERAL1";

        SEQ5.text = "<";
        SEQ5.TYPE = "LITERAL1";

        SEQ6.text = ")";
        SEQ6.TYPE = "LITERAL1";

        SEQ7.text = "(";
        SEQ7.TYPE = "LITERAL1";

        SEQ8.text = "=";
        SEQ8.TYPE = "LITERAL1";

        SEQ9.text = "!";
        SEQ9.TYPE = "LITERAL1";

        SEQ10.text = "+";
        SEQ10.TYPE = "LITERAL1";

        SEQ11.text = "-";
        SEQ11.TYPE = "LITERAL1";

        SEQ12.text = "/";
        SEQ12.TYPE = "LITERAL1";

        SEQ13.text = "*";
        SEQ13.TYPE = "LITERAL1";

        SEQ14.text = "^";
        SEQ14.TYPE = "LITERAL1";

        SEQ15.text = "~";
        SEQ15.TYPE = "LITERAL1";

        SEQ16.text = "}";
        SEQ16.TYPE = "LITERAL1";

        SEQ17.text = "{";
        SEQ17.TYPE = "LITERAL1";

        SEQ18.text = ".";
        SEQ18.TYPE = "LITERAL1";

        SEQ19.text = ",";
        SEQ19.TYPE = "LITERAL1";

        SEQ20.text = ";";
        SEQ20.TYPE = "LITERAL1";

        SEQ21.text = "]";
        SEQ21.TYPE = "LITERAL1";

        SEQ22.text = "[";
        SEQ22.TYPE = "LITERAL1";

        SEQ23.text = "?";
        SEQ23.TYPE = "LITERAL1";

        SEQ24.text = ":";
        SEQ24.TYPE = "LITERAL1";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, MARK_FOLLOWING2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, };

        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "APOSTR";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.ESCAPE = "\\";

        SEQ_REGEXP1.text = "%\\d*\\.?\\d*[dfis]";
        SEQ_REGEXP1.TYPE = "LITERAL4";
        SEQ_REGEXP1.HASH_CHAR = "%";


        return RULES1;
    }

    private RULES RULES5() {
        RULES RULES1 = new RULES();
        RULES1.SET = "EXEC";
        RULES1.DEFAULT = "KEYWORD3";
        RULES1.ESCAPE = "\\";

        EOL_SPAN1.text = "#";
        EOL_SPAN1.TYPE = "COMMENT1";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "KEYWORD2";

        BEGIN1.text = "${";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        MARK_FOLLOWING MARK_FOLLOWING1 = new MARK_FOLLOWING();
        MARK_FOLLOWING1.text = "$#";
        MARK_FOLLOWING1.TYPE = "KEYWORD2";

        MARK_FOLLOWING2.text = "$";
        MARK_FOLLOWING2.TYPE = "KEYWORD2";

        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "KEYWORD2";

        BEGIN2.text = "@{";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        MARK_FOLLOWING MARK_FOLLOWING3 = new MARK_FOLLOWING();
        MARK_FOLLOWING3.text = "@";
        MARK_FOLLOWING3.TYPE = "KEYWORD2";

        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "KEYWORD2";

        BEGIN3.text = "%{";

        END3.text = "}";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        MARK_FOLLOWING MARK_FOLLOWING4 = new MARK_FOLLOWING();
        MARK_FOLLOWING4.text = "%";
        MARK_FOLLOWING4.TYPE = "KEYWORD2";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, MARK_FOLLOWING2, MARK_FOLLOWING3, MARK_FOLLOWING4, };

        return RULES1;
    }

    private RULES RULES6() {
        RULES RULES1 = new RULES();
        RULES1.SET = "VARIABLE";
        RULES1.DEFAULT = "KEYWORD2";
        RULES1.ESCAPE = "\\";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "KEYWORD2";
        SPAN1.DELEGATE = "VARIABLE";

        BEGIN1.text = "{";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "->";
        SEQ1.TYPE = "OPERATOR";


        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES7() {
        RULES RULES1 = new RULES();
        RULES1.SET = "QUOTED_BRACKET";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.ESCAPE = "\\";

        SPAN1.HASH_CHARS = "[";
        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "QUOTED_BRACKET";
        SPAN1.MATCH_TYPE = "OPERATOR";

        BEGIN1.text = "[";

        END1.text = "]";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    private RULES RULES8() {
        RULES RULES1 = new RULES();
        RULES1.SET = "QUOTED_BRACE";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.ESCAPE = "\\";

        SPAN1.HASH_CHARS = "{";
        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "QUOTED_BRACE";
        SPAN1.MATCH_TYPE = "OPERATOR";

        BEGIN1.text = "{";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    private RULES RULES9() {
        RULES RULES1 = new RULES();
        RULES1.SET = "QUOTED_PAREN";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.ESCAPE = "\\";

        SPAN1.HASH_CHARS = "(";
        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "QUOTED_PAREN";
        SPAN1.MATCH_TYPE = "OPERATOR";

        BEGIN1.text = "(";

        END1.text = ")";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), RULES5(), RULES6(), RULES7(), RULES8(), RULES9(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}