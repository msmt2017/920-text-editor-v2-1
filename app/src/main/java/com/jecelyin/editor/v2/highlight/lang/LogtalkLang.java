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
public class LogtalkLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "%";
        PROPERTY1.NAME = "lineComment";

        PROPERTY2.VALUE = "/*";
        PROPERTY2.NAME = "commentStart";

        PROPERTY3.VALUE = "*/";
        PROPERTY3.NAME = "commentEnd";

        PROPERTY4.VALUE = "4";
        PROPERTY4.NAME = "tabSize";

        PROPERTY5.VALUE = "4";
        PROPERTY5.NAME = "indentSize";

        PROPERTY6.VALUE = "((^\\s*:-\\s(object|protocol|category)\\(.*,$)|.*\\s:-$)";
        PROPERTY6.NAME = "indentNextLine";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.SET = "MAIN";
        RULES1.IGNORE_CASE = "FALSE";

        EOL_SPAN1.text = "%";
        EOL_SPAN1.TYPE = "COMMENT1";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "/*";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "^\\s*:-\\s(category|object|protocol)(?=[(])";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "KEYWORD1";

        SEQ_REGEXP2.text = "^\\s*:-\\send_(category|object|protocol)(?=[.])";
        SEQ_REGEXP2.AT_WORD_START = "TRUE";
        SEQ_REGEXP2.TYPE = "KEYWORD1";

        SEQ_REGEXP3.text = "^\\s*:-\\smodule(?=[(])";
        SEQ_REGEXP3.AT_WORD_START = "TRUE";
        SEQ_REGEXP3.TYPE = "KEYWORD1";

        SEQ_REGEXP4.text = "^\\s*:-\\sp(ublic|r(otected|ivate))(?=[(])";
        SEQ_REGEXP4.AT_WORD_START = "TRUE";
        SEQ_REGEXP4.TYPE = "KEYWORD1";

        SEQ_REGEXP5.text = "^\\s*:-\\s(el)?if(?=[(])";
        SEQ_REGEXP5.AT_WORD_START = "TRUE";
        SEQ_REGEXP5.TYPE = "KEYWORD1";

        SEQ_REGEXP6.text = "^\\s*:-\\se(lse|ndif)(?=[.])";
        SEQ_REGEXP6.AT_WORD_START = "TRUE";
        SEQ_REGEXP6.TYPE = "KEYWORD1";

        SEQ_REGEXP7.text = "^\\s*:-\\se(n(coding|sure_loaded)|xport)(?=[(])";
        SEQ_REGEXP7.AT_WORD_START = "TRUE";
        SEQ_REGEXP7.TYPE = "KEYWORD1";

        SEQ_REGEXP8.text = "^\\s*:-\\sin(fo|itialization)(?=[(])";
        SEQ_REGEXP8.AT_WORD_START = "TRUE";
        SEQ_REGEXP8.TYPE = "KEYWORD1";

        SEQ_REGEXP9.text = "^\\s*:-\\s(dynamic|synchronized|threaded)(?=[.])";
        SEQ_REGEXP9.AT_WORD_START = "TRUE";
        SEQ_REGEXP9.TYPE = "KEYWORD1";

        SEQ_REGEXP10.text = "^\\s*:-\\s(alias|d(ynamic|iscontiguous)|m(eta_predicate|ode|ultifile)|s(et_(logtalk|prolog)_flag|ynchronized))(?=[(])";
        SEQ_REGEXP10.AT_WORD_START = "TRUE";
        SEQ_REGEXP10.TYPE = "KEYWORD1";

        SEQ_REGEXP11.text = "^\\s*:-\\sop(?=[(])";
        SEQ_REGEXP11.AT_WORD_START = "TRUE";
        SEQ_REGEXP11.TYPE = "KEYWORD1";

        SEQ_REGEXP12.text = "^\\s*:-\\s(calls|reexport|use(s|_module))(?=[(])";
        SEQ_REGEXP12.AT_WORD_START = "TRUE";
        SEQ_REGEXP12.TYPE = "KEYWORD1";

        SEQ_REGEXP13.text = "(complements|extends|i(nstantiates|mp(lements|orts))|specializes)(?=[(])";
        SEQ_REGEXP13.AT_WORD_START = "TRUE";
        SEQ_REGEXP13.TYPE = "KEYWORD1";

        SEQ_REGEXP14.text = "\\b(after|before)(?=[(])";
        SEQ_REGEXP14.AT_WORD_START = "TRUE";
        SEQ_REGEXP14.TYPE = "KEYWORD2";

        SEQ_REGEXP15.text = "\\b(parameter|this|se(lf|nder))(?=[(])";
        SEQ_REGEXP15.AT_WORD_START = "TRUE";
        SEQ_REGEXP15.TYPE = "KEYWORD2";

        SEQ_REGEXP16.text = "\\b(current_predicate|predicate_property)(?=[(])";
        SEQ_REGEXP16.AT_WORD_START = "TRUE";
        SEQ_REGEXP16.TYPE = "KEYWORD2";

        SEQ_REGEXP17.text = "\\b(expand_(goal|term)|(goal|term)_expansion|phrase)(?=[(])";
        SEQ_REGEXP17.AT_WORD_START = "TRUE";
        SEQ_REGEXP17.TYPE = "KEYWORD2";

        SEQ_REGEXP18.text = "\\b(abolish|c(reate|urrent))_(object|protocol|category)(?=[(])";
        SEQ_REGEXP18.AT_WORD_START = "TRUE";
        SEQ_REGEXP18.TYPE = "KEYWORD2";

        SEQ_REGEXP19.text = "\\b(object|protocol|category)_property(?=[(])";
        SEQ_REGEXP19.AT_WORD_START = "TRUE";
        SEQ_REGEXP19.TYPE = "KEYWORD2";

        SEQ_REGEXP20.text = "\\bcomplements_object(?=[(])";
        SEQ_REGEXP20.AT_WORD_START = "TRUE";
        SEQ_REGEXP20.TYPE = "KEYWORD2";

        SEQ_REGEXP21.text = "\\bextends_(object|protocol|category)(?=[(])";
        SEQ_REGEXP21.AT_WORD_START = "TRUE";
        SEQ_REGEXP21.TYPE = "KEYWORD2";

        SEQ_REGEXP22.text = "\\bimp(lements_protocol|orts_category)(?=[(])";
        SEQ_REGEXP22.AT_WORD_START = "TRUE";
        SEQ_REGEXP22.TYPE = "KEYWORD2";

        SEQ_REGEXP23.text = "\\b(instantiat|specializ)es_class(?=[(])";
        SEQ_REGEXP23.AT_WORD_START = "TRUE";
        SEQ_REGEXP23.TYPE = "KEYWORD2";

        SEQ_REGEXP24.text = "\\b(current_event|(abolish|define)_events)(?=[(])";
        SEQ_REGEXP24.AT_WORD_START = "TRUE";
        SEQ_REGEXP24.TYPE = "KEYWORD2";

        SEQ_REGEXP25.text = "\\b(current|set)_logtalk_flag(?=[(])";
        SEQ_REGEXP25.AT_WORD_START = "TRUE";
        SEQ_REGEXP25.TYPE = "KEYWORD2";

        SEQ_REGEXP26.text = "\\blogtalk_(compile|l(ibrary_path|oad))(?=[(])";
        SEQ_REGEXP26.AT_WORD_START = "TRUE";
        SEQ_REGEXP26.TYPE = "KEYWORD2";

        SEQ_REGEXP27.text = "\\b(clause|retract(all)?)(?=[(])";
        SEQ_REGEXP27.AT_WORD_START = "TRUE";
        SEQ_REGEXP27.TYPE = "KEYWORD2";

        SEQ_REGEXP28.text = "\\ba(bolish|ssert(a|z))(?=[(])";
        SEQ_REGEXP28.AT_WORD_START = "TRUE";
        SEQ_REGEXP28.TYPE = "KEYWORD2";

        SEQ_REGEXP29.text = "\\b(ca(ll|tch)|throw)(?=[(])";
        SEQ_REGEXP29.AT_WORD_START = "TRUE";
        SEQ_REGEXP29.TYPE = "KEYWORD2";

        SEQ_REGEXP30.text = "\\b(fail|true)\\b";
        SEQ_REGEXP30.AT_WORD_START = "TRUE";
        SEQ_REGEXP30.TYPE = "KEYWORD2";

        SEQ_REGEXP31.text = "\\b((bag|set)of|f(ind|or)all)(?=[(])";
        SEQ_REGEXP31.AT_WORD_START = "TRUE";
        SEQ_REGEXP31.TYPE = "KEYWORD2";

        SEQ_REGEXP32.text = "\\bthreaded(_(call|once|ignore|exit|peek|wait|notify))?(?=[(])";
        SEQ_REGEXP32.AT_WORD_START = "TRUE";
        SEQ_REGEXP32.TYPE = "KEYWORD2";

        SEQ_REGEXP33.text = "\\bunify_with_occurs_check(?=[(])";
        SEQ_REGEXP33.AT_WORD_START = "TRUE";
        SEQ_REGEXP33.TYPE = "KEYWORD2";

        SEQ_REGEXP34.text = "\\b(functor|arg|copy_term)(?=[(])";
        SEQ_REGEXP34.AT_WORD_START = "TRUE";
        SEQ_REGEXP34.TYPE = "KEYWORD2";

        SEQ_REGEXP35.text = "\\b(rem|mod|abs|sign)(?=[(])";
        SEQ_REGEXP35.AT_WORD_START = "TRUE";
        SEQ_REGEXP35.TYPE = "KEYWORD2";

        SEQ_REGEXP36.text = "\\bfloat(_(integer|fractional)_part)?(?=[(])";
        SEQ_REGEXP36.AT_WORD_START = "TRUE";
        SEQ_REGEXP36.TYPE = "KEYWORD2";

        SEQ_REGEXP37.text = "\\b(floor|truncate|round|ceiling)(?=[(])";
        SEQ_REGEXP37.AT_WORD_START = "TRUE";
        SEQ_REGEXP37.TYPE = "KEYWORD2";

        SEQ_REGEXP38.text = "\\b(cos|atan|exp|log|s(in|qrt))(?=[(])";
        SEQ_REGEXP38.AT_WORD_START = "TRUE";
        SEQ_REGEXP38.TYPE = "KEYWORD2";

        SEQ_REGEXP39.text = "\\b(var|atom(ic)?|integer|float|compound|n(onvar|umber))(?=[(])";
        SEQ_REGEXP39.AT_WORD_START = "TRUE";
        SEQ_REGEXP39.TYPE = "KEYWORD2";

        SEQ_REGEXP40.text = "\\b(current|set)_(in|out)put(?=[(])";
        SEQ_REGEXP40.AT_WORD_START = "TRUE";
        SEQ_REGEXP40.TYPE = "KEYWORD2";

        SEQ_REGEXP41.text = "\\b(open|close)(?=[(])";
        SEQ_REGEXP41.AT_WORD_START = "TRUE";
        SEQ_REGEXP41.TYPE = "KEYWORD2";

        SEQ_REGEXP42.text = "\\bflush_output(?=[(])";
        SEQ_REGEXP42.AT_WORD_START = "TRUE";
        SEQ_REGEXP42.TYPE = "KEYWORD2";

        SEQ_REGEXP43.text = "\\b(flush_output|at_end_of_stream)\\b";
        SEQ_REGEXP43.AT_WORD_START = "TRUE";
        SEQ_REGEXP43.TYPE = "KEYWORD2";

        SEQ_REGEXP44.text = "\\b(stream_property|at_end_of_stream|set_stream_position)(?=[(])";
        SEQ_REGEXP44.AT_WORD_START = "TRUE";
        SEQ_REGEXP44.TYPE = "KEYWORD2";

        SEQ_REGEXP45.text = "\\b(nl|(get|peek|put)_(byte|c(har|ode)))(?=[(])";
        SEQ_REGEXP45.AT_WORD_START = "TRUE";
        SEQ_REGEXP45.TYPE = "KEYWORD2";

        SEQ_REGEXP46.text = "\\bnl\\b";
        SEQ_REGEXP46.AT_WORD_START = "TRUE";
        SEQ_REGEXP46.TYPE = "KEYWORD2";

        SEQ_REGEXP47.text = "\\bread(_term)?(?=[(])";
        SEQ_REGEXP47.AT_WORD_START = "TRUE";
        SEQ_REGEXP47.TYPE = "KEYWORD2";

        SEQ_REGEXP48.text = "\\bwrite(q|_(canonical|term))?(?=[(])";
        SEQ_REGEXP48.AT_WORD_START = "TRUE";
        SEQ_REGEXP48.TYPE = "KEYWORD2";

        SEQ_REGEXP49.text = "\\b(current_)?op(?=[(])";
        SEQ_REGEXP49.AT_WORD_START = "TRUE";
        SEQ_REGEXP49.TYPE = "KEYWORD2";

        SEQ_REGEXP50.text = "\\b(current_)?char_conversion(?=[(])";
        SEQ_REGEXP50.AT_WORD_START = "TRUE";
        SEQ_REGEXP50.TYPE = "KEYWORD2";

        SEQ_REGEXP51.text = "\\batom_(length|c(hars|o(ncat|des)))(?=[(])";
        SEQ_REGEXP51.AT_WORD_START = "TRUE";
        SEQ_REGEXP51.TYPE = "KEYWORD2";

        SEQ_REGEXP52.text = "\\b(char_code|sub_atom)(?=[(])";
        SEQ_REGEXP52.AT_WORD_START = "TRUE";
        SEQ_REGEXP52.TYPE = "KEYWORD2";

        SEQ_REGEXP53.text = "\\bnumber_c(hars|odes)(?=[(])";
        SEQ_REGEXP53.AT_WORD_START = "TRUE";
        SEQ_REGEXP53.TYPE = "KEYWORD2";

        SEQ_REGEXP54.text = "\\b(set|current)_prolog_flag(?=[(])";
        SEQ_REGEXP54.AT_WORD_START = "TRUE";
        SEQ_REGEXP54.TYPE = "KEYWORD2";

        SEQ_REGEXP55.text = "\\bhalt\\b";
        SEQ_REGEXP55.AT_WORD_START = "TRUE";
        SEQ_REGEXP55.TYPE = "KEYWORD2";

        SEQ_REGEXP56.text = "\\bhalt(?=[(])";
        SEQ_REGEXP56.AT_WORD_START = "TRUE";
        SEQ_REGEXP56.TYPE = "KEYWORD2";

        SEQ_REGEXP57.text = "\\bonce(?=[(])";
        SEQ_REGEXP57.AT_WORD_START = "TRUE";
        SEQ_REGEXP57.TYPE = "KEYWORD2";

        SEQ_REGEXP58.text = "\\brepeat\\b";
        SEQ_REGEXP58.AT_WORD_START = "TRUE";
        SEQ_REGEXP58.TYPE = "KEYWORD2";

        SEQ_REGEXP59.text = "[_A-Z]+[a-zA-Z0-9]*";
        SEQ_REGEXP59.HASH_CHARS = "_ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        SEQ_REGEXP59.AT_WORD_START = "TRUE";
        SEQ_REGEXP59.TYPE = "MARKUP";

        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL1";

        BEGIN2.text = "'";

        END2.text = "'";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL1";

        BEGIN3.text = "\"";

        END3.text = "\"";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "OPERATOR";
        SPAN4.DELEGATE = "MAIN";

        BEGIN4.text = "{";

        END4.text = "}";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SEQ_REGEXP SEQ_REGEXP60 = new SEQ_REGEXP();
        SEQ_REGEXP60.text = "0'.";
        SEQ_REGEXP60.AT_WORD_START = "TRUE";
        SEQ_REGEXP60.TYPE = "DIGIT";
        SEQ_REGEXP60.HASH_CHAR = "0";

        SEQ_REGEXP61.text = "0b[0-1]+";
        SEQ_REGEXP61.AT_WORD_START = "TRUE";
        SEQ_REGEXP61.TYPE = "DIGIT";
        SEQ_REGEXP61.HASH_CHAR = "0";

        SEQ_REGEXP62.text = "0o[0-7]+";
        SEQ_REGEXP62.AT_WORD_START = "TRUE";
        SEQ_REGEXP62.TYPE = "DIGIT";
        SEQ_REGEXP62.HASH_CHAR = "0";

        SEQ_REGEXP63.text = "0x\\p{XDigit}+";
        SEQ_REGEXP63.AT_WORD_START = "TRUE";
        SEQ_REGEXP63.TYPE = "DIGIT";
        SEQ_REGEXP63.HASH_CHAR = "0";

        SEQ_REGEXP64.text = "\\d+(\\.\\d+)?([eE]([-+])?\\d+)?";
        SEQ_REGEXP64.AT_WORD_START = "TRUE";
        SEQ_REGEXP64.TYPE = "DIGIT";

        SEQ1.text = "::";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "^^";
        SEQ2.TYPE = "OPERATOR";

        SEQ_REGEXP65.text = ":(?![:-])";
        SEQ_REGEXP65.TYPE = "OPERATOR";

        SEQ3.text = "!";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = ",";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = ";";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "-->";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "->";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "=";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "\\=";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "@=<";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "==";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "\\==";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "@<";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = "@>";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "@>=";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "=..";
        SEQ16.TYPE = "OPERATOR";

        SEQ_REGEXP66.text = "\\bis\\b";
        SEQ_REGEXP66.AT_WORD_START = "TRUE";
        SEQ_REGEXP66.TYPE = "OPERATOR";

        SEQ17.text = "=:=";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "=\\=";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = "<";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = "=<";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = ">";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = ">=";
        SEQ22.TYPE = "OPERATOR";

        SEQ23.text = "\\+";
        SEQ23.TYPE = "OPERATOR";

        SEQ24.text = "+";
        SEQ24.TYPE = "OPERATOR";

        SEQ25.text = "-";
        SEQ25.TYPE = "OPERATOR";

        SEQ26.text = "*";
        SEQ26.TYPE = "OPERATOR";

        SEQ27.text = "//";
        SEQ27.TYPE = "OPERATOR";

        SEQ28.text = "/";
        SEQ28.TYPE = "OPERATOR";

        SEQ29.text = "**";
        SEQ29.TYPE = "OPERATOR";

        SEQ30.text = ">>";
        SEQ30.TYPE = "OPERATOR";

        SEQ31.text = "<<";
        SEQ31.TYPE = "OPERATOR";

        SEQ32.text = "/\\";
        SEQ32.TYPE = "OPERATOR";

        SEQ33.text = "\\/";
        SEQ33.TYPE = "OPERATOR";

        SEQ34.text = "\\";
        SEQ34.TYPE = "OPERATOR";

        SEQ35.text = ".";
        SEQ35.TYPE = "OPERATOR";

        SEQ_REGEXP67.text = "\\s:-($|\\s)";
        SEQ_REGEXP67.TYPE = "OPERATOR";

        SEQ36.text = "+";
        SEQ36.TYPE = "OPERATOR";

        SEQ37.text = "-";
        SEQ37.TYPE = "OPERATOR";

        SEQ38.text = "?";
        SEQ38.TYPE = "OPERATOR";

        SEQ39.text = "@";
        SEQ39.TYPE = "OPERATOR";

        SEQ40.text = "^";
        SEQ40.TYPE = "OPERATOR";


        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, SEQ_REGEXP2, SEQ_REGEXP3, SEQ_REGEXP4, SEQ_REGEXP5, SEQ_REGEXP6, SEQ_REGEXP7, SEQ_REGEXP8, SEQ_REGEXP9, SEQ_REGEXP10, SEQ_REGEXP11, SEQ_REGEXP12, SEQ_REGEXP13, SEQ_REGEXP14, SEQ_REGEXP15, SEQ_REGEXP16, SEQ_REGEXP17, SEQ_REGEXP18, SEQ_REGEXP19, SEQ_REGEXP20, SEQ_REGEXP21, SEQ_REGEXP22, SEQ_REGEXP23, SEQ_REGEXP24, SEQ_REGEXP25, SEQ_REGEXP26, SEQ_REGEXP27, SEQ_REGEXP28, SEQ_REGEXP29, SEQ_REGEXP30, SEQ_REGEXP31, SEQ_REGEXP32, SEQ_REGEXP33, SEQ_REGEXP34, SEQ_REGEXP35, SEQ_REGEXP36, SEQ_REGEXP37, SEQ_REGEXP38, SEQ_REGEXP39, SEQ_REGEXP40, SEQ_REGEXP41, SEQ_REGEXP42, SEQ_REGEXP43, SEQ_REGEXP44, SEQ_REGEXP45, SEQ_REGEXP46, SEQ_REGEXP47, SEQ_REGEXP48, SEQ_REGEXP49, SEQ_REGEXP50, SEQ_REGEXP51, SEQ_REGEXP52, SEQ_REGEXP53, SEQ_REGEXP54, SEQ_REGEXP55, SEQ_REGEXP56, SEQ_REGEXP57, SEQ_REGEXP58, SEQ_REGEXP59, SEQ_REGEXP60, SEQ_REGEXP61, SEQ_REGEXP62, SEQ_REGEXP63, SEQ_REGEXP64, SEQ_REGEXP65, SEQ_REGEXP66, SEQ_REGEXP67, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, SEQ26, SEQ27, SEQ28, SEQ29, SEQ30, SEQ31, SEQ32, SEQ33, SEQ34, SEQ35, SEQ36, SEQ37, SEQ38, SEQ39, SEQ40, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}