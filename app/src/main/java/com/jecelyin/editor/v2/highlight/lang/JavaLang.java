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
public class JavaLang implements LangDefine {
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
        RULES1.DIGIT_RE = "(0[lL]?|[1-9]\\d{0,9}(\\d{0,9}[lL])?|0[xX]\\p{XDigit}{1,8}(\\p{XDigit}{0,8}[lL])?|0[0-7]{1,11}([0-7]{0,11}[lL])?|([0-9]+\\.[0-9]*|\\.[0-9]+)([eE][+-]?[0-9]+)?[fFdD]?|[0-9]+([eE][+-]?[0-9]+[fFdD]?|([eE][+-]?[0-9]+)?[fFdD]))";
        RULES1.IGNORE_CASE = "FALSE";

        SEQ1.text = "/**/";
        SEQ1.TYPE = "COMMENT1";

        SPAN1.TYPE = "COMMENT3";
        SPAN1.DELEGATE = "JAVADOC";

        BEGIN1.text = "/**";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT1";

        BEGIN2.text = "/*";

        END2.text = "*/";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL1";
        SPAN3.DELEGATE = "DOUBLEQUOTE_LITERAL";

        BEGIN3.text = "\"";

        END3.text = "\"";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.NO_LINE_BREAK = "TRUE";
        SPAN4.TYPE = "LITERAL3";
        SPAN4.DELEGATE = "SIMPLEQUOTE_LITERAL";

        BEGIN4.text = "'";

        END4.text = "'";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "[/][/](.*?)$";
        SEQ_REGEXP1.TYPE = "COMMENT2";

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

        SEQ_REGEXP2.text = "/(?![/])";
        SEQ_REGEXP2.TYPE = "OPERATOR";

        SEQ8.text = ".*";
        SEQ8.TYPE = "NULL";

        SEQ9.text = "*";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = ">";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "<";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "%";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "&";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = "|";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "^";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "~";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "}";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "{";
        SEQ18.TYPE = "OPERATOR";

        MARK_PREVIOUS1.text = ":";
        MARK_PREVIOUS1.AT_WHITESPACE_END = "TRUE";
        MARK_PREVIOUS1.TYPE = "LABEL";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        MARK_PREVIOUS2.text = "(";
        MARK_PREVIOUS2.TYPE = "FUNCTION";
        MARK_PREVIOUS2.MATCH_TYPE = "OPERATOR";

        SEQ19.text = ")";
        SEQ19.TYPE = "OPERATOR";

        MARK_FOLLOWING1.text = "@";
        MARK_FOLLOWING1.TYPE = "KEYWORD4";


        KEYWORDS1.add("KEYWORD1", new String[]{"assert", "break", "case", "catch", "continue", "default", "do", "else", "finally", "for", "if", "instanceof", "new", "return", "strictfp", "switch", "throw", "try", "while", });
        KEYWORDS1.add("INVALID", new String[]{"goto", "const", });
        KEYWORDS1.add("KEYWORD2", new String[]{"final", "implements", "native", "private", "protected", "public", "static", "synchronized", "throws", "transient", "volatile", "abstract", "extends", "import", "package", "enum", });
        KEYWORDS1.add("KEYWORD3", new String[]{"void", "boolean", "byte", "char", "class", "double", "float", "int", "interface", "long", "short", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, MARK_PREVIOUS2, };

        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, SEQ_REGEXP2, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "DOUBLEQUOTE_LITERAL";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.IGNORE_CASE = "TRUE";

        SEQ1.text = "\\\\";
        SEQ1.TYPE = "LITERAL4";

        SEQ2.text = "\\\"";
        SEQ2.TYPE = "LITERAL4";

        SEQ3.text = "\\n";
        SEQ3.TYPE = "LITERAL4";

        SEQ4.text = "\\r";
        SEQ4.TYPE = "LITERAL4";

        SEQ5.text = "\\t";
        SEQ5.TYPE = "LITERAL4";

        SEQ_REGEXP1.text = "\\\\u[a-f\\d]{4}";
        SEQ_REGEXP1.TYPE = "LITERAL4";
        SEQ_REGEXP1.HASH_CHAR = "\\u";


        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "SIMPLEQUOTE_LITERAL";
        RULES1.DEFAULT = "LITERAL3";
        RULES1.IGNORE_CASE = "TRUE";

        SEQ1.text = "\\\\";
        SEQ1.TYPE = "LITERAL4";

        SEQ2.text = "\\'";
        SEQ2.TYPE = "LITERAL4";

        SEQ3.text = "\\n";
        SEQ3.TYPE = "LITERAL4";

        SEQ4.text = "\\r";
        SEQ4.TYPE = "LITERAL4";

        SEQ5.text = "\\t";
        SEQ5.TYPE = "LITERAL4";

        SEQ_REGEXP1.text = "\\\\u[a-f\\d]{4}";
        SEQ_REGEXP1.TYPE = "LITERAL4";
        SEQ_REGEXP1.HASH_CHAR = "\\u";


        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, };

        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "JAVADOC";
        RULES1.DEFAULT = "COMMENT3";
        RULES1.IGNORE_CASE = "TRUE";

        SEQ1.text = "*";
        SEQ1.TYPE = "COMMENT3";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "<!--";

        END1.text = "-->";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SEQ SEQ2 = new SEQ();
        SEQ2.text = "<<";
        SEQ2.TYPE = "COMMENT3";

        SEQ3.text = "<=";
        SEQ3.TYPE = "COMMENT3";

        SEQ4.text = "<";
        SEQ4.TYPE = "COMMENT3";

        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL1";
        SPAN2.ESCAPE = "\\";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "MARKUP";
        SPAN3.DELEGATE = "xml::TAGS";

        BEGIN3.text = "<";

        END3.text = ">";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN_REGEXP SPAN_REGEXP1 = new SPAN_REGEXP();
        SPAN_REGEXP1.NO_WORD_BREAK = "FALSE";
        SPAN_REGEXP1.TYPE = "LABEL";
        SPAN_REGEXP1.DELEGATE = "JAVADOC_PARAM";
        SPAN_REGEXP1.HASH_CHAR = "{@";

        BEGIN4.text = "\\{@(link|linkplain|docRoot|code|literal)\\s";

        END4.text = "}";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN_REGEXP SPAN_REGEXP2 = new SPAN_REGEXP();
        SPAN_REGEXP2.NO_WORD_BREAK = "FALSE";
        SPAN_REGEXP2.TYPE = "LABEL";
        SPAN_REGEXP2.DELEGATE = "JAVADOC_PARAM";
        SPAN_REGEXP2.HASH_CHAR = "@version";

        BEGIN5.text = "@version\\s+\\$";

        END5.text = "$";


        SPAN_REGEXP2.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN_REGEXP SPAN_REGEXP3 = new SPAN_REGEXP();
        SPAN_REGEXP3.NO_WORD_BREAK = "FALSE";
        SPAN_REGEXP3.TYPE = "LABEL";
        SPAN_REGEXP3.DELEGATE = "JAVADOC_PARAM";
        SPAN_REGEXP3.HASH_CHAR = "@";

        BEGIN6.text = "@(?:param|throws|exception|serialField)(\\s)";

        END6.text = "$1";


        SPAN_REGEXP3.BEGIN = new BEGIN[] { BEGIN6, };

        KEYWORDS KEYWORDS1 = new KEYWORDS();

        KEYWORDS1.add("KEYWORD2", new String[]{"@category", "@example", "@exclude", "@index", "@internal", "@obsolete", "@threadsafety", "@tutorial", "@todo", });
        KEYWORDS1.add("KEYWORD4", new String[]{"@access", "@beaninfo", "@bon", "@bug", "@complexity", "@design", "@ensures", "@equivalent", "@generates", "@guard", "@hides", "@history", "@idea", "@invariant", "@modifies", "@overrides", "@post", "@pre", "@references", "@requires", "@review", "@spec", "@uses", "@values", });
        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, SPAN_REGEXP2, SPAN_REGEXP3, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES5() {
        RULES RULES1 = new RULES();
        RULES1.SET = "JAVADOC_PARAM";
        RULES1.DEFAULT = "COMMENT4";
        RULES1.IGNORE_CASE = "TRUE";

    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), RULES5(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}