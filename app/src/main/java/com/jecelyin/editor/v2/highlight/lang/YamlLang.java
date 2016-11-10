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
public class YamlLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = ".+:$";
        PROPERTY1.NAME = "indentNextLines";

        PROPERTY2.VALUE = "[{|>";
        PROPERTY2.NAME = "indentOpenBrackets";

        PROPERTY3.VALUE = "}]";
        PROPERTY3.NAME = "indentCloseBrackets";

        PROPERTY4.VALUE = "false";
        PROPERTY4.NAME = "ignoreWhitespace";

        PROPERTY5.VALUE = "#";
        PROPERTY5.NAME = "lineComment";

        PROPERTY6.VALUE = "true";
        PROPERTY6.NAME = "noTabs";

        PROPERTY7.VALUE = "2";
        PROPERTY7.NAME = "indentSize";

        PROPERTY8.VALUE = "2";
        PROPERTY8.NAME = "tabSize";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.ESCAPE = "\\";

        SEQ1.text = "...";
        SEQ1.TYPE = "KEYWORD3";

        SEQ2.text = "---";
        SEQ2.TYPE = "KEYWORD3";

        SEQ_REGEXP1.text = "-( |$)";
        SEQ_REGEXP1.AT_WHITESPACE_END = "TRUE";
        SEQ_REGEXP1.DELEGATE = "VALUES";

        IMPORT1.DELEGATE = "NAME";


        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "NAME";

        SEQ_REGEXP1.text = "[^:\\[\\]{},'\"#]+:( |$)";
        SEQ_REGEXP1.TYPE = "KEYWORD1";
        SEQ_REGEXP1.DELEGATE = "VALUES";

        SPAN1.TYPE = "MARKUP";
        SPAN1.DELEGATE = "php::PHP";

        BEGIN1.text = "<?php";

        END1.text = "?>";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "ARRAYS";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "OPERATOR";
        SPAN1.DELEGATE = "ARRAY";

        BEGIN1.text = "{";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "FALSE";
        SPAN2.TYPE = "OPERATOR";
        SPAN2.DELEGATE = "ARRAY";

        BEGIN2.text = "[";

        END2.text = "]";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "ARRAY";

        IMPORT1.DELEGATE = "VALUES";

        SEQ1.text = ",";
        SEQ1.TYPE = "OPERATOR";


        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES5() {
        RULES RULES1 = new RULES();
        RULES1.SET = "VALUES";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";

        EOL_SPAN1.text = "#";
        EOL_SPAN1.TYPE = "COMMENT1";
        EOL_SPAN1.AT_LINE_START = "FALSE";

        IMPORT1.DELEGATE = "NAME";

        IMPORT2.DELEGATE = "ARRAYS";

        SEQ_REGEXP1.text = "\\t";
        SEQ_REGEXP1.TYPE = "INVALID";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "LITERAL1";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL1";

        BEGIN2.text = "'";

        END2.text = "'";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        KEYWORDS KEYWORDS1 = new KEYWORDS();

        RULES1.IMPORT = new IMPORT[] { IMPORT1, IMPORT2, };

        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), RULES5(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}