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
public class SmartyLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "{*";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "*}";
        PROPERTY2.NAME = "commentEnd";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "FALSE";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "{*";

        END1.text = "*}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL3";
        SPAN2.DELEGATE = "NON_SMARTY";

        BEGIN2.text = "{LITERAL}";

        END2.text = "{/LITERAL}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "MARKUP";
        SPAN3.DELEGATE = "php::PHP";
        SPAN3.MATCH_TYPE = "FUNCTION";

        BEGIN3.text = "{PHP}";

        END3.text = "{/PHP}";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "MARKUP";
        SPAN4.DELEGATE = "SMARTY";

        BEGIN4.text = "{";

        END4.text = "}";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.TYPE = "COMMENT1";
        SPAN5.DELEGATE = "COMMENT1+SMARTY";

        BEGIN5.text = "<!--";

        END5.text = "-->";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.TYPE = "MARKUP";
        SPAN6.DELEGATE = "JAVASCRIPT_OPENTAG";

        BEGIN6.text = "<SCRIPT";

        END6.text = "</SCRIPT>";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        SPAN SPAN7 = new SPAN();
        SPAN7.TYPE = "MARKUP";
        SPAN7.DELEGATE = "CSS_OPENTAG";

        BEGIN7.text = "<STYLE";

        END7.text = "</STYLE>";


        SPAN7.BEGIN = new BEGIN[] { BEGIN7, };

        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "</?\\w+";
        SEQ_REGEXP1.TYPE = "MARKUP";
        SEQ_REGEXP1.DELEGATE = "TAGS";
        SEQ_REGEXP1.HASH_CHAR = "<";

        IMPORT1.DELEGATE = "NON_SMARTY";


        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, SPAN7, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "NON_SMARTY";
        RULES1.HIGHLIGHT_DIGITS = "FALSE";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "<!--";

        END1.text = "-->";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "KEYWORD2";
        SPAN2.DELEGATE = "xml::DTD-TAGS";

        BEGIN2.text = "<!";

        END2.text = ">";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN_REGEXP SPAN_REGEXP1 = new SPAN_REGEXP();
        SPAN_REGEXP1.TYPE = "MARKUP";
        SPAN_REGEXP1.DELEGATE = "javascript::MAIN";
        SPAN_REGEXP1.HASH_CHAR = "<SCRIPT";

        BEGIN3.text = "<SCRIPT.*?>";

        END3.text = "</SCRIPT>";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN_REGEXP SPAN_REGEXP2 = new SPAN_REGEXP();
        SPAN_REGEXP2.TYPE = "MARKUP";
        SPAN_REGEXP2.DELEGATE = "css::MAIN";
        SPAN_REGEXP2.HASH_CHAR = "<STYLE";

        BEGIN4.text = "<STYLE.*?>";

        END4.text = "</STYLE>";


        SPAN_REGEXP2.BEGIN = new BEGIN[] { BEGIN4, };

        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "</?\\w+";
        SEQ_REGEXP1.TYPE = "MARKUP";
        SEQ_REGEXP1.DELEGATE = "html::TAGS";
        SEQ_REGEXP1.HASH_CHAR = "<";

        SPAN3.NO_WORD_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL2";

        BEGIN5.text = "&";

        END5.text = ";";


        SPAN3.BEGIN = new BEGIN[] { BEGIN5, };

        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, SPAN_REGEXP2, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "TAGS";
        RULES1.DEFAULT = "MARKUP";
        RULES1.ESCAPE = "\\";

        SEQ1.text = ">";
        SEQ1.TYPE = "MARKUP";
        SEQ1.DELEGATE = "MAIN";

        SPAN_REGEXP1.AT_WORD_START = "TRUE";
        SPAN_REGEXP1.TYPE = "MARKUP";
        SPAN_REGEXP1.DELEGATE = "CSS_PROPERTIES+SMARTY";
        SPAN_REGEXP1.HASH_CHAR = "style";

        BEGIN1.text = "style\\s*=\\s*([\"'])";

        END1.text = "$1";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN1, };

        IMPORT IMPORT1 = new IMPORT();
        IMPORT1.DELEGATE = "TO_LITERAL+SMARTY";

        IMPORT2.DELEGATE = "TO_SMARTY";

        IMPORT3.DELEGATE = "INVALID_LT";

        IMPORT4.DELEGATE = "html::TAGS";


        RULES1.SEQ = new SEQ[] { SEQ1, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, };

        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "TO_LITERAL+SMARTY";

        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "LITERAL1+SMARTY";

        BEGIN1.text = "'";

        END1.text = "'";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL2";
        SPAN2.DELEGATE = "LITERAL2+SMARTY";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        IMPORT IMPORT1 = new IMPORT();
        IMPORT1.DELEGATE = "TO_SMARTY";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        return RULES1;
    }

    private RULES RULES5() {
        RULES RULES1 = new RULES();
        RULES1.SET = "LITERAL1+SMARTY";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.ESCAPE = "\\";

        IMPORT1.DELEGATE = "TO_SMARTY";


        return RULES1;
    }

    private RULES RULES6() {
        RULES RULES1 = new RULES();
        RULES1.SET = "LITERAL2+SMARTY";
        RULES1.DEFAULT = "LITERAL2";
        RULES1.ESCAPE = "\\";

        IMPORT1.DELEGATE = "TO_SMARTY";


        return RULES1;
    }

    private RULES RULES7() {
        RULES RULES1 = new RULES();
        RULES1.SET = "COMMENT1+SMARTY";
        RULES1.DEFAULT = "COMMENT1";

        IMPORT1.DELEGATE = "TO_SMARTY";


        return RULES1;
    }

    private RULES RULES8() {
        RULES RULES1 = new RULES();
        RULES1.SET = "TO_SMARTY";
        RULES1.DEFAULT = "MARKUP";

        SPAN1.TYPE = "MARKUP";
        SPAN1.DELEGATE = "SMARTY";

        BEGIN1.text = "{";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    private RULES RULES9() {
        RULES RULES1 = new RULES();
        RULES1.SET = "INVALID_LT";
        RULES1.DEFAULT = "INVALID";

        SEQ1.text = "<";
        SEQ1.TYPE = "INVALID";


        return RULES1;
    }

    private RULES RULES10() {
        RULES RULES1 = new RULES();
        RULES1.SET = "CSS_OPENTAG";
        RULES1.DEFAULT = "MARKUP";

        SEQ1.text = ">";
        SEQ1.TYPE = "MARKUP";
        SEQ1.DELEGATE = "CSS+SMARTY";

        IMPORT1.DELEGATE = "TO_LITERAL+SMARTY";


        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES11() {
        RULES RULES1 = new RULES();
        RULES1.SET = "CSS+SMARTY";
        RULES1.DEFAULT = "MARKUP";

        SPAN1.TYPE = "FUNCTION";
        SPAN1.DELEGATE = "CSS_PROPERTIES+SMARTY";

        BEGIN1.text = "{ldelim}";

        END1.text = "{rdelim}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "KEYWORD3";
        SPAN2.DELEGATE = "CSS_PROPERTIES+SMARTY";

        BEGIN2.text = "{$smarty.ldelim}";

        END2.text = "{$smarty.rdelim}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = ":";
        SEQ1.TYPE = "OPERATOR";
        SEQ1.DELEGATE = "CSS_PSEUDO";

        IMPORT1.DELEGATE = "TO_SMARTY";

        IMPORT2.DELEGATE = "css::MAIN";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES12() {
        RULES RULES1 = new RULES();
        RULES1.SET = "CSS_PROPERTIES+SMARTY";
        RULES1.ESCAPE = "\\";

        SEQ1.text = ":";
        SEQ1.TYPE = "OPERATOR";
        SEQ1.DELEGATE = "CSS_PROP_VALUE+SMARTY";

        IMPORT1.DELEGATE = "TO_SMARTY";

        IMPORT2.DELEGATE = "css::PROPERTIES";


        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES13() {
        RULES RULES1 = new RULES();
        RULES1.SET = "CSS_PROP_VALUE+SMARTY";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "-?\\d+(\\.\\d+)?(pt|pc|in|mm|cm|em|ex|px|ms|s|%|)";
        RULES1.NO_WORD_SEP = "-_%";

        SEQ1.text = ";";
        SEQ1.TYPE = "OPERATOR";
        SEQ1.DELEGATE = "CSS_PROPERTIES+SMARTY";

        SEQ2.text = "}";
        SEQ2.TYPE = "INVALID";
        SEQ2.DELEGATE = "CSS+SMARTY";

        IMPORT1.DELEGATE = "TO_SMARTY";

        IMPORT2.DELEGATE = "css::PROP_VALUE";


        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        return RULES1;
    }

    private RULES RULES14() {
        RULES RULES1 = new RULES();
        RULES1.SET = "CSS_PSEUDO";

        SEQ1.TYPE = "NULL";
        SEQ1.DELEGATE = "CSS+SMARTY";

        SEQ2.text = ",";
        SEQ2.TYPE = "OPERATOR";
        SEQ2.DELEGATE = "CSS+SMARTY";

        SPAN1.TYPE = "FUNCTION";
        SPAN1.DELEGATE = "CSS_PROPERTIES+SMARTY";

        BEGIN1.text = "{ldelim}";

        END1.text = "{rdelim}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "KEYWORD3";
        SPAN2.DELEGATE = "CSS_PROPERTIES+SMARTY";

        BEGIN2.text = "{$smarty.ldelim}";

        END2.text = "{$smarty.rdelim}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        IMPORT IMPORT1 = new IMPORT();
        IMPORT1.DELEGATE = "TO_SMARTY";

        IMPORT2.DELEGATE = "css::PSEUDO";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        return RULES1;
    }

    private RULES RULES15() {
        RULES RULES1 = new RULES();
        RULES1.SET = "JAVASCRIPT_OPENTAG";
        RULES1.DEFAULT = "MARKUP";

        SEQ1.text = ">";
        SEQ1.TYPE = "MARKUP";
        SEQ1.DELEGATE = "JAVASCRIPT";

        IMPORT1.DELEGATE = "TO_LITERAL+SMARTY";

        IMPORT2.DELEGATE = "html::TAGS";


        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES16() {
        RULES RULES1 = new RULES();
        RULES1.SET = "JAVASCRIPT";
        RULES1.DEFAULT = "MARKUP";
        RULES1.ESCAPE = "\\";

        IMPORT1.DELEGATE = "TO_LITERAL+SMARTY";

        IMPORT2.DELEGATE = "TO_SMARTY";

        IMPORT3.DELEGATE = "javascript::MAIN";


        return RULES1;
    }

    private RULES RULES17() {
        RULES RULES1 = new RULES();
        RULES1.SET = "DOUBLE_QUOTED";
        RULES1.DEFAULT = "LITERAL2";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "LITERAL2";
        SPAN1.DELEGATE = "BACK_TICKED";

        BEGIN1.text = "`";

        END1.text = "`";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        IMPORT IMPORT1 = new IMPORT();
        IMPORT1.DELEGATE = "VARIABLES";


        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    private RULES RULES18() {
        RULES RULES1 = new RULES();
        RULES1.SET = "BACK_TICKED";
        RULES1.DEFAULT = "LITERAL2";
        RULES1.IGNORE_CASE = "TRUE";

        IMPORT1.DELEGATE = "VARIABLES";

        IMPORT2.DELEGATE = "MATH_OPERATORS";


        return RULES1;
    }

    private RULES RULES19() {
        RULES RULES1 = new RULES();
        RULES1.SET = "VARIABLES";

        MARK_FOLLOWING1.text = "$";
        MARK_FOLLOWING1.TYPE = "KEYWORD3";


        return RULES1;
    }

    private RULES RULES20() {
        RULES RULES1 = new RULES();
        RULES1.SET = "MATH_OPERATORS";
        RULES1.IGNORE_CASE = "TRUE";

        SEQ1.text = ".";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "->";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "*";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "/";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "+";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "-";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "%";
        SEQ7.TYPE = "OPERATOR";


        return RULES1;
    }

    private RULES RULES21() {
        RULES RULES1 = new RULES();
        RULES1.SET = "LOGIC_OPERATORS";
        RULES1.IGNORE_CASE = "TRUE";

        SEQ1.text = "|";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ":";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "=";
        SEQ3.TYPE = "OPERATOR";


        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES22() {
        RULES RULES1 = new RULES();
        RULES1.SET = "SMARTY";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "LITERAL1";

        BEGIN1.text = "'";

        END1.text = "'";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL2";
        SPAN2.DELEGATE = "DOUBLE_QUOTED";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "KEYWORD3";

        BEGIN3.text = "#";

        END3.text = "#";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        IMPORT IMPORT1 = new IMPORT();
        IMPORT1.DELEGATE = "VARIABLES";

        IMPORT2.DELEGATE = "MATH_OPERATORS";

        IMPORT3.DELEGATE = "LOGIC_OPERATORS";


        KEYWORDS1.add("FUNCTION", new String[]{"capture", "/capture", "config_load", "foreach", "foreachelse", "/foreach", "if", "else", "elseif", "/if", "include", "include_php", "insert", "ldelim", "rdelim", "section", "sectionelse", "/section", "strip", "/strip", "assign", "counter", "cycle", "debug", "eval", "fetch", "html_checkboxes", "html_image", "html_options", "html_radios", "html_select_date", "html_select_time", "html_table", "mailto", "math", "popup", "popup_init", "textformat", "/textformat", });
        KEYWORDS1.add("KEYWORD3", new String[]{"above", "advance", "all_extra", "assign", "autostatus", "autostatuscap", "background", "below", "bgbackground", "bgcolor", "border", "caparray", "capcolor", "capicon", "caption", "captionfont", "captionsize", "center", "closecolor", "closefont", "closesize", "closetext", "day_extra", "day_format", "day_size", "delay", "delimiter", "direction", "display_days", "display_hours", "display_meridian", "display_minutes", "display_months", "display_seconds", "display_years", "end_year", "equation", "fgbackground", "fgcolor", "field_array", "field_order", "field_separator", "file", "fixx", "fixy", "format", "frame", "from", "fullhtml", "hauto", "height", "hour_extra", "inarray", "indent", "indent_char", "indent_first", "item", "key", "left", "loop", "max", "meridian_extra", "minute_extra", "minute_interval", "month_extra", "month_format", "month_size", "month_value_format", "name", "noclose", "offsetx", "offsety", "once", "options", "output", "padx", "pady", "prefix", "print", "reverse_years", "right", "scope", "script", "second_extra", "second_interval", "section", "selected", "show", "skip", "snapx", "snapy", "start", "start_year", "status", "step", "sticky", "stop", "style", "text", "textcolor", "textfont", "textsize", "time", "timeout", "trigger", "use_24_hours", "value", "values", "var", "vauto", "width", "wrap", "wrap_char", "wrap_cut", "year_as_text", "year_extra", "year_size", });
        RULES1.IMPORT = new IMPORT[] { IMPORT1, IMPORT2, IMPORT3, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), RULES5(), RULES6(), RULES7(), RULES8(), RULES9(), RULES10(), RULES11(), RULES12(), RULES13(), RULES14(), RULES15(), RULES16(), RULES17(), RULES18(), RULES19(), RULES20(), RULES21(), RULES22(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}