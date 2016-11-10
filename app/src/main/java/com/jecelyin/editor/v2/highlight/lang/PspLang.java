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
public class PspLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "<!--";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "-->";
        PROPERTY2.NAME = "commentEnd";

        PROPERTY3.VALUE = "\\s*[^#]{3,}:\\s*(#.*)?";
        PROPERTY3.NAME = "indentNextLines";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "LITERAL4";
        SPAN1.DELEGATE = "DIRECTIVE";

        BEGIN1.text = "<%@";

        END1.text = "%>";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT2";

        BEGIN2.text = "<%--";

        END2.text = "--%>";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "LITERAL3";
        SPAN3.DELEGATE = "python::MAIN";

        BEGIN3.text = "<%";

        END3.text = "%>";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "MARKUP";
        SPAN4.DELEGATE = "javascript::MAIN";

        BEGIN4.text = "<script language=\"jscript\">";

        END4.text = "</script>";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.TYPE = "MARKUP";
        SPAN5.DELEGATE = "javascript::MAIN";

        BEGIN5.text = "<script language=\"javascript\">";

        END5.text = "</script>";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.TYPE = "MARKUP";
        SPAN6.DELEGATE = "javascript::MAIN";

        BEGIN6.text = "<script>";

        END6.text = "</script>";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        SPAN SPAN7 = new SPAN();
        SPAN7.TYPE = "MARKUP";

        BEGIN7.text = "<!--#";

        END7.text = "-->";


        SPAN7.BEGIN = new BEGIN[] { BEGIN7, };

        SPAN SPAN8 = new SPAN();
        SPAN8.TYPE = "COMMENT1";

        BEGIN8.text = "<!--";

        END8.text = "-->";


        SPAN8.BEGIN = new BEGIN[] { BEGIN8, };

        SPAN SPAN9 = new SPAN();
        SPAN9.TYPE = "MARKUP";
        SPAN9.DELEGATE = "css::MAIN";

        BEGIN9.text = "<STYLE>";

        END9.text = "</STYLE>";


        SPAN9.BEGIN = new BEGIN[] { BEGIN9, };

        SPAN SPAN10 = new SPAN();
        SPAN10.TYPE = "MARKUP";
        SPAN10.DELEGATE = "TAGS";

        BEGIN10.text = "<";

        END10.text = ">";


        SPAN10.BEGIN = new BEGIN[] { BEGIN10, };

        SPAN SPAN11 = new SPAN();
        SPAN11.NO_WORD_BREAK = "TRUE";
        SPAN11.TYPE = "LITERAL2";

        BEGIN11.text = "&";

        END11.text = ";";


        SPAN11.BEGIN = new BEGIN[] { BEGIN11, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, SPAN7, SPAN8, SPAN9, SPAN10, SPAN11, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "TAGS";
        RULES1.DEFAULT = "MARKUP";

        SPAN1.TYPE = "LITERAL1";
        SPAN1.ESCAPE = "\\";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL1";
        SPAN2.ESCAPE = "\\";

        BEGIN2.text = "'";

        END2.text = "'";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SPAN3.TYPE = "COMMENT2";

        BEGIN3.text = "<%--";

        END3.text = "--%>";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "LITERAL3";
        SPAN4.DELEGATE = "python::MAIN";

        BEGIN4.text = "<%";

        END4.text = "%>";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "DIRECTIVE";
        RULES1.DEFAULT = "LITERAL4";

        SPAN1.TYPE = "LITERAL1";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL1";

        BEGIN2.text = "'";

        END2.text = "'";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}