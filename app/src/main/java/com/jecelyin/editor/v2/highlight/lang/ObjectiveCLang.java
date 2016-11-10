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
public class ObjectiveCLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "/*";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "*/";
        PROPERTY2.NAME = "commentEnd";

        PROPERTY3.VALUE = "//";
        PROPERTY3.NAME = "lineComment";

        PROPERTY4.VALUE = ",+-=<>/?^&*";
        PROPERTY4.NAME = "wordBreakChars";

        PROPERTY5.VALUE = "{";
        PROPERTY5.NAME = "indentOpenBrackets";

        PROPERTY6.VALUE = "}";
        PROPERTY6.NAME = "indentCloseBrackets";

        PROPERTY7.VALUE = "(";
        PROPERTY7.NAME = "unalignedOpenBrackets";

        PROPERTY8.VALUE = ")";
        PROPERTY8.NAME = "unalignedCloseBrackets";

        PROPERTY9.VALUE = "\\s*(((if|while)\\s*\\(|else\\s*|else\\s+if\\s*\\(|for\\s*\\(.*\\))[^{;]*)";
        PROPERTY9.NAME = "indentNextLine";

        PROPERTY10.VALUE = "^.*(default:\\s*|case.*:.*)$";
        PROPERTY10.NAME = "unindentThisLine";

        PROPERTY11.VALUE = ":";
        PROPERTY11.NAME = "electricKeys";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "[0-9][0-9a-zA-Z]*";
        RULES1.IGNORE_CASE = "FALSE";

        EOL_SPAN1.text = "#";
        EOL_SPAN1.AT_WHITESPACE_END = "TRUE";
        EOL_SPAN1.TYPE = "KEYWORD2";
        EOL_SPAN1.DELEGATE = "CPP";

        IMPORT1.DELEGATE = "c::LEX";

        IMPORT2.DELEGATE = "c::CORE";

        IMPORT3.DELEGATE = "CORE";


        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "CORE";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "[0-9][0-9a-zA-Z]*";
        RULES1.IGNORE_CASE = "FALSE";


        KEYWORDS1.add("KEYWORD1", new String[]{"oneway", "in", "out", "inout", "bycopy", "byref", "self", "super", "@interface", "@implementation", "@protocol", "@end", "@private", "@protected", "@public", "@class", "@selector", "@endcode", "@defs", });
        KEYWORDS1.add("KEYWORD3", new String[]{"id", "Class", "SEL", "IMP", "BOOL", });
        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "CPP";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "[0-9][0-9a-zA-Z]*";
        RULES1.IGNORE_CASE = "FALSE";

        EOL_SPAN_REGEXP1.text = "include\\b";
        EOL_SPAN_REGEXP1.TYPE = "MARKUP";
        EOL_SPAN_REGEXP1.DELEGATE = "c::INCLUDE";
        EOL_SPAN_REGEXP1.HASH_CHAR = "include";

        EOL_SPAN_REGEXP2.text = "import\\b";
        EOL_SPAN_REGEXP2.TYPE = "MARKUP";
        EOL_SPAN_REGEXP2.DELEGATE = "c::INCLUDE";
        EOL_SPAN_REGEXP2.HASH_CHAR = "import";

        EOL_SPAN_REGEXP3.text = "define\\b";
        EOL_SPAN_REGEXP3.TYPE = "MARKUP";
        EOL_SPAN_REGEXP3.DELEGATE = "DEFINE";
        EOL_SPAN_REGEXP3.HASH_CHAR = "define";

        EOL_SPAN_REGEXP4.text = "endif\\b";
        EOL_SPAN_REGEXP4.TYPE = "MARKUP";
        EOL_SPAN_REGEXP4.DELEGATE = "c::LEX";
        EOL_SPAN_REGEXP4.HASH_CHAR = "endif";

        EOL_SPAN_REGEXP5.text = "elif\\b";
        EOL_SPAN_REGEXP5.TYPE = "MARKUP";
        EOL_SPAN_REGEXP5.DELEGATE = "c::CONDITION";
        EOL_SPAN_REGEXP5.HASH_CHAR = "elif";

        EOL_SPAN_REGEXP6.text = "if\\b";
        EOL_SPAN_REGEXP6.TYPE = "MARKUP";
        EOL_SPAN_REGEXP6.DELEGATE = "c::CONDITION";
        EOL_SPAN_REGEXP6.HASH_CHAR = "if";

        IMPORT1.DELEGATE = "c::LEX";


        RULES1.IMPORT = new IMPORT[] { IMPORT1, };

        RULES1.EOL_SPAN_REGEXP = new EOL_SPAN_REGEXP[] { EOL_SPAN_REGEXP1, EOL_SPAN_REGEXP2, EOL_SPAN_REGEXP3, EOL_SPAN_REGEXP4, EOL_SPAN_REGEXP5, EOL_SPAN_REGEXP6, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "DEFINE";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "[0-9][0-9a-zA-Z]*";
        RULES1.IGNORE_CASE = "FALSE";

        SEQ1.text = "#";
        SEQ1.TYPE = "OPERATOR";

        IMPORT1.DELEGATE = "c::LEX";

        IMPORT2.DELEGATE = "c::CORE";

        IMPORT3.DELEGATE = "CORE";


        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}