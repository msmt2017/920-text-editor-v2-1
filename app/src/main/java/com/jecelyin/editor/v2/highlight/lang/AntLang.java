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
public class AntLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "<!--";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "-->";
        PROPERTY2.NAME = "commentEnd";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();

        SPAN1.TYPE = "MARKUP";
        SPAN1.DELEGATE = "SQL";

        BEGIN1.text = "<transaction";

        END1.text = "</transaction>";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "KEYWORD3";

        BEGIN2.text = "${";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "COMMENT1";

        BEGIN3.text = "<!--";

        END3.text = "-->";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "KEYWORD2";
        SPAN4.DELEGATE = "ENTITY-TAGS";

        BEGIN4.text = "<!ENTITY";

        END4.text = ">";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.TYPE = "KEYWORD2";
        SPAN5.DELEGATE = "CDATA";

        BEGIN5.text = "<![CDATA[";

        END5.text = "]]>";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.TYPE = "KEYWORD2";
        SPAN6.DELEGATE = "DTD-TAGS";

        BEGIN6.text = "<!";

        END6.text = ">";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        SPAN SPAN7 = new SPAN();
        SPAN7.TYPE = "KEYWORD3";

        BEGIN7.text = "<?";

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
        RULES1.NO_WORD_SEP = "-_";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "<!--";

        END1.text = "-->";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL1";
        SPAN2.DELEGATE = "STRING";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "LITERAL1";
        SPAN3.DELEGATE = "STRING";

        BEGIN3.text = "'";

        END3.text = "'";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "\"";
        SEQ1.TYPE = "MARKUP";
        SEQ1.DELEGATE = "STRING";

        SEQ2.text = "/>";
        SEQ2.TYPE = "MARKUP";
        SEQ2.DELEGATE = "ant::MAIN";

        MARK_PREVIOUS1.text = ":";
        MARK_PREVIOUS1.TYPE = "LABEL";

        SEQ3.text = ":";
        SEQ3.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD1", new String[]{"target", });
        KEYWORDS1.add("INVALID", new String[]{"copydir", "copyfile", "deltree", "execOn", "javadoc2", "rename", });
        KEYWORDS1.add("KEYWORD2", new String[]{"project", });
        KEYWORDS1.add("FUNCTION", new String[]{"chmod", "checksum", "concat", "copy", "delete", "echo", "exec", "import", "input", "mkdir", "move", "patch", "tempfile", "touch", "java", "javac", "javadoc", "junit", "rmic", "signjar", "bzip2", "bunzip2", "ear", "gzip", "gunzip", "jar", "unjar", "manifest", "tar", "untar", "war", "unwar", "zip", "unzip", "ant", "antcall", "apply", "dependset", "fail", "parallel", "sequential", "sleep", "waitfor", "antstructure", "available", "condition", "cvs", "cvschangelog", "cvspass", "cvstagdiff", "get", "mail", "replace", "sql", "style", "taskdef", "tstamp", "typedef", "xslt", "assert", "call", "else", "find", "grep", "if", "new", "post", "repeat", "suite", "testcase", "unset", "var", });
        KEYWORDS1.add("KEYWORD3", new String[]{"description", "loadfile", "loadproperties", "property", "xmlproperty", });
        KEYWORDS1.add("KEYWORD4", new String[]{"fileset", "filelist", "include", "exclude", "filter", "filterchain", "path", "pathelement", "classpath", "istrue", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "DTD-TAGS";
        RULES1.DEFAULT = "KEYWORD2";
        RULES1.IGNORE_CASE = "FALSE";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "<!--";

        END1.text = "-->";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT1";

        BEGIN2.text = "--";

        END2.text = "--";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_WORD_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL2";

        BEGIN3.text = "%";

        END3.text = ";";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "LITERAL1";

        BEGIN4.text = "\"";

        END4.text = "\"";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.TYPE = "LITERAL1";

        BEGIN5.text = "'";

        END5.text = "'";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.TYPE = "KEYWORD2";
        SPAN6.DELEGATE = "MAIN";

        BEGIN6.text = "[";

        END6.text = "]";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "(";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ")";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "|";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "?";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "*";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "+";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = ",";
        SEQ7.TYPE = "OPERATOR";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "ENTITY-TAGS";
        RULES1.DEFAULT = "KEYWORD2";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "<!--";

        END1.text = "-->";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT1";

        BEGIN2.text = "--";

        END2.text = "--";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "LITERAL1";

        BEGIN3.text = "\"";

        END3.text = "\"";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "LITERAL1";

        BEGIN4.text = "'";

        END4.text = "'";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "%";
        SEQ2.TYPE = "OPERATOR";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES5() {
        RULES RULES1 = new RULES();
        RULES1.SET = "CDATA";
        RULES1.DEFAULT = "COMMENT2";

    }

    private RULES RULES6() {
        RULES RULES1 = new RULES();
        RULES1.SET = "STRING";
        RULES1.DEFAULT = "LITERAL1";

        SPAN1.TYPE = "KEYWORD3";

        BEGIN1.text = "${";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_WORD_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL2";

        BEGIN2.text = "&";

        END2.text = ";";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        KEYWORDS KEYWORDS1 = new KEYWORDS();

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES7() {
        RULES RULES1 = new RULES();
        RULES1.SET = "SQL";
        RULES1.DEFAULT = "MARKUP";

        SEQ1.text = "/>";
        SEQ1.TYPE = "MARKUP";
        SEQ1.DELEGATE = "MAIN";

        SEQ2.TYPE = "MARKUP";
        SEQ2.DELEGATE = "BACK_TO_XML";


        return RULES1;
    }

    private RULES RULES8() {
        RULES RULES1 = new RULES();
        RULES1.SET = "BACK_TO_XML";
        RULES1.DEFAULT = "MARKUP";

        SEQ1.text = ">";
        SEQ1.TYPE = "MARKUP";
        SEQ1.DELEGATE = "ant::TAGS";


        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), RULES5(), RULES6(), RULES7(), RULES8(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}