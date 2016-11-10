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
public class RustLang implements LangDefine {
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


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(0b[01_]+|0o[0-8_]+|0x[0-9a-fA-F_]+|[0-9_]+)([iu](8|16|32|64)|isize|usize)?|[0-9_]+([eE][0-9_]*)?(f32|f64)?";
        RULES1.IGNORE_CASE = "FALSE";

        SEQ1.text = "/**/";
        SEQ1.TYPE = "COMMENT1";

        SPAN1.TYPE = "COMMENT3";
        SPAN1.DELEGATE = "NESTED_DOC_COMMENT";

        BEGIN1.text = "/**";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT1";
        SPAN2.DELEGATE = "NESTED_COMMENT";

        BEGIN2.text = "/*";

        END2.text = "*/";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "///";
        EOL_SPAN1.TYPE = "COMMENT3";

        EOL_SPAN2.text = "//";
        EOL_SPAN2.TYPE = "COMMENT2";

        SEQ_REGEXP1.text = "br(#*)\".*?\"(\\1)";
        SEQ_REGEXP1.TYPE = "LITERAL1";

        SPAN3.NO_LINE_BREAK = "FALSE";
        SPAN3.TYPE = "LITERAL1";
        SPAN3.DELEGATE = "DOUBLEQUOTE_LITERAL";

        BEGIN3.text = "b\"";

        END3.text = "\"";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SEQ_REGEXP SEQ_REGEXP2 = new SEQ_REGEXP();
        SEQ_REGEXP2.text = "r(#*)\".*?\"(\\1)";
        SEQ_REGEXP2.TYPE = "LITERAL1";

        SPAN4.NO_LINE_BREAK = "FALSE";
        SPAN4.TYPE = "LITERAL1";
        SPAN4.DELEGATE = "DOUBLEQUOTE_LITERAL";

        BEGIN4.text = "\"";

        END4.text = "\"";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SEQ_REGEXP SEQ_REGEXP3 = new SEQ_REGEXP();
        SEQ_REGEXP3.text = "b?'(.|\\\\([\\\\'nrt0]|x[a-fA-F\\d]{2}|u\\{[a-fA-F\\d]{1,6}\\}))'";
        SEQ_REGEXP3.TYPE = "LITERAL3";

        SEQ_REGEXP4.text = "'\\w+";
        SEQ_REGEXP4.TYPE = "KEYWORD4";

        SPAN5.NO_LINE_BREAK = "FALSE";
        SPAN5.TYPE = "KEYWORD4";
        SPAN5.DELEGATE = "ATTRIBUTE";

        BEGIN5.text = "#[";

        END5.text = "]";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.NO_LINE_BREAK = "FALSE";
        SPAN6.TYPE = "KEYWORD4";
        SPAN6.DELEGATE = "ATTRIBUTE";

        BEGIN6.text = "#![";

        END6.text = "]";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        SEQ SEQ2 = new SEQ();
        SEQ2.text = "=";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "!";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = ">=";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "<=";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "+";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "-";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "/";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "::*";
        SEQ9.TYPE = "NULL";

        SEQ10.text = "*";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = ">";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "<";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "%";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = "&";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "|";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "^";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "}";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "{";
        SEQ18.TYPE = "OPERATOR";

        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        SEQ19.text = ")";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = "=";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = "(";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = ")";
        SEQ22.TYPE = "OPERATOR";

        SEQ23.text = ",";
        SEQ23.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD1", new String[]{"as", "box", "break", "const", "continue", "else", "for", "if", "in", "let", "loop", "match", "move", "mut", "ref", "return", "unsafe", "while", });
        KEYWORDS1.add("KEYWORD2", new String[]{"extern", "crate", "mod", "fn", "type", "struct", "enum", "static", "trait", "impl", "use", "super", "priv", "pub", "where", });
        KEYWORDS1.add("KEYWORD3", new String[]{"bool", "char", "f32", "f64", "i16", "i32", "i64", "i8", "isize", "str", "u16", "u32", "u64", "u8", "usize", });
        KEYWORDS1.add("KEYWORD4", new String[]{"Copy", "Send", "Sized", "Sync", "Drop", "Fn", "FnMut", "FnOnce", "drop", "Box", "Clone", "PartialEq", "PartialOrd", "Eq", "Ord", "AsRef", "AsMut", "Into", "From", "DoubleEndedIterator", "ExactSizeIterator", "Iterator", "Extend", "Option", "Some", "None", "Result", "Ok", "Err", "String", "ToString", "Vec", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, SEQ_REGEXP2, SEQ_REGEXP3, SEQ_REGEXP4, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "DOUBLEQUOTE_LITERAL";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.IGNORE_CASE = "TRUE";

        SEQ1.text = "\\\"";
        SEQ1.TYPE = "LITERAL4";

        SEQ2.text = "\\\\";
        SEQ2.TYPE = "LITERAL4";

        SEQ3.text = "\\n";
        SEQ3.TYPE = "LITERAL4";

        SEQ4.text = "\\r";
        SEQ4.TYPE = "LITERAL4";

        SEQ5.text = "\\t";
        SEQ5.TYPE = "LITERAL4";

        SEQ6.text = "\\0";
        SEQ6.TYPE = "LITERAL4";

        SEQ_REGEXP1.text = "\\\\x[a-f\\d]{2}";
        SEQ_REGEXP1.TYPE = "LITERAL4";
        SEQ_REGEXP1.HASH_CHAR = "\\x";

        SEQ_REGEXP2.text = "\\\\u\\{[a-f\\d]{1,6}\\}";
        SEQ_REGEXP2.TYPE = "LITERAL4";
        SEQ_REGEXP2.HASH_CHAR = "\\u";


        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "ATTRIBUTE";
        RULES1.DEFAULT = "KEYWORD4";
        RULES1.IGNORE_CASE = "FALSE";


        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "NESTED_DOC_COMMENT";
        RULES1.DEFAULT = "COMMENT3";

        SPAN1.TYPE = "COMMENT3";
        SPAN1.DELEGATE = "NESTED_DOC_COMMENT";

        BEGIN1.text = "/*";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    private RULES RULES5() {
        RULES RULES1 = new RULES();
        RULES1.SET = "NESTED_COMMENT";
        RULES1.DEFAULT = "COMMENT1";

        SPAN1.TYPE = "COMMENT1";
        SPAN1.DELEGATE = "NESTED_COMMENT";

        BEGIN1.text = "/*";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), RULES5(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}