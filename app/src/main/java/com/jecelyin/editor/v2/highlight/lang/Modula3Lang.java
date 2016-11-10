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
public class Modula3Lang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "(*";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "*)";
        PROPERTY2.NAME = "commentEnd";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "COMMENT2";

        BEGIN1.text = "<*";

        END1.text = "*>";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT1";

        BEGIN2.text = "(*";

        END2.text = "*)";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL1";
        SPAN3.ESCAPE = "\\";

        BEGIN3.text = "\"";

        END3.text = "\"";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.NO_LINE_BREAK = "TRUE";
        SPAN4.TYPE = "LITERAL1";
        SPAN4.ESCAPE = "\\";

        BEGIN4.text = "'";

        END4.text = "'";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "^";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "@";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = ":=";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "=";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "<>";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = ">=";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "<=";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = ">";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "<";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "+";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "-";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "/";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "*";
        SEQ13.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD1", new String[]{"AND", "DO", "FROM", "NOT", "REPEAT", "UNTIL", "ANY", "ELSE", "GENERIC", "OBJECT", "RETURN", "UNTRACED", "ARRAY", "ELSIF", "IF", "OF", "REVEAL", "VALUE", "AS", "END", "IMPORT", "OR", "ROOT", "VAR", "BEGIN", "EVAL", "IN", "OVERRIDES", "SET", "WHILE", "BITS", "EXCEPT", "INTERFACE", "PROCEDURE", "THEN", "WITH", "BRANDED", "EXCEPTION", "LOCK", "RAISE", "TO", "BY", "EXIT", "LOOP", "RAISES", "TRY", "CASE", "EXPORTS", "METHODS", "READONLY", "TYPE", "CONST", "FINALLY", "MOD", "RECORD", "TYPECASE", "DIV", "FOR", "MODULE", "REF", "UNSAFE", });
        KEYWORDS1.add("KEYWORD2", new String[]{"Text", "Thread", "Word", "Real", "LongReal", "ExtendedReal", "RealFloat", "LongFloat", "ExtendedFloat", "FloatMode", });
        KEYWORDS1.add("KEYWORD3", new String[]{"Fmt", "Lex", "Pickle", "Table", });
        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, };

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