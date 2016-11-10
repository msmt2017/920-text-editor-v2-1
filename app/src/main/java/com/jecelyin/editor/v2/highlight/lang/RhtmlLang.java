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
public class RhtmlLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "<!--";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "-->";
        PROPERTY2.NAME = "commentEnd";

        PROPERTY3.VALUE = "<%#";
        PROPERTY3.NAME = "commentStart";

        PROPERTY4.VALUE = "%>";
        PROPERTY4.NAME = "commentEnd";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "<%#";

        END1.text = "%>";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "MARKUP";
        SPAN2.DELEGATE = "ruby::MAIN";

        BEGIN2.text = "<%=";

        END2.text = "%>";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "MARKUP";
        SPAN3.DELEGATE = "ruby::MAIN";

        BEGIN3.text = "<%";

        END3.text = "%>";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "COMMENT1";

        BEGIN4.text = "<!--";

        END4.text = "-->";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.TYPE = "MARKUP";
        SPAN5.DELEGATE = "html::JAVASCRIPT";

        BEGIN5.text = "<SCRIPT";

        END5.text = "</SCRIPT>";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.TYPE = "MARKUP";
        SPAN6.DELEGATE = "html::CSS";

        BEGIN6.text = "<STYLE";

        END6.text = "</STYLE>";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        SPAN SPAN7 = new SPAN();
        SPAN7.TYPE = "KEYWORD2";
        SPAN7.DELEGATE = "xml::DTD-TAGS";

        BEGIN7.text = "<!";

        END7.text = ">";


        SPAN7.BEGIN = new BEGIN[] { BEGIN7, };

        SPAN SPAN8 = new SPAN();
        SPAN8.TYPE = "MARKUP";
        SPAN8.DELEGATE = "TAGS";

        BEGIN8.text = "<";

        END8.text = ">";


        SPAN8.BEGIN = new BEGIN[] { BEGIN8, };

        SPAN SPAN9 = new SPAN();
        SPAN9.NO_WORD_BREAK = "TRUE";
        SPAN9.TYPE = "LITERAL2";

        BEGIN9.text = "&";

        END9.text = ";";


        SPAN9.BEGIN = new BEGIN[] { BEGIN9, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, SPAN7, SPAN8, SPAN9, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "TAGS";
        RULES1.DEFAULT = "MARKUP";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "<!--";

        END1.text = "-->";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT1";

        BEGIN2.text = "<%#";

        END2.text = "%>";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "LITERAL1";
        SPAN3.DELEGATE = "TAGS_LITERAL";

        BEGIN3.text = "\"";

        END3.text = "\"";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "LITERAL1";
        SPAN4.DELEGATE = "TAGS_LITERAL";

        BEGIN4.text = "'";

        END4.text = "'";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";


        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "TAGS_LITERAL";
        RULES1.DEFAULT = "LITERAL1";

        SPAN1.TYPE = "MARKUP";

        BEGIN1.text = "<%";

        END1.text = "%>";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "MARKUP";

        BEGIN2.text = "<%=";

        END2.text = "%>";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}