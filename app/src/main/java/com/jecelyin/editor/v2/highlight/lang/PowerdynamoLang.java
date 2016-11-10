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
public class PowerdynamoLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "{";
        PROPERTY1.NAME = "indentOpenBrackets";

        PROPERTY2.VALUE = "}";
        PROPERTY2.NAME = "indentCloseBrackets";

        PROPERTY3.VALUE = " @ %^*()+=|\\{}[]:;,.?$&";
        PROPERTY3.NAME = "wordBreakChars";

        PROPERTY4.VALUE = "<!--";
        PROPERTY4.NAME = "commentStart";

        PROPERTY5.VALUE = "-->";
        PROPERTY5.NAME = "commentEnd";

        PROPERTY6.VALUE = "//";
        PROPERTY6.NAME = "lineComment";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "LABEL";
        SPAN1.DELEGATE = "powerdynamo-script";

        BEGIN1.text = "<!--script";

        END1.text = "-->";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LABEL";
        SPAN2.DELEGATE = "powerdynamo-tag-data";

        BEGIN2.text = "<!--data";

        END2.text = "-->";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "LABEL";
        SPAN3.DELEGATE = "powerdynamo-tag-document";

        BEGIN3.text = "<!--document";

        END3.text = "-->";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "LABEL";
        SPAN4.DELEGATE = "powerdynamo-script";

        BEGIN4.text = "<!--evaluate";

        END4.text = "-->";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.TYPE = "LABEL";
        SPAN5.DELEGATE = "powerdynamo-script";

        BEGIN5.text = "<!--execute";

        END5.text = "-->";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.TYPE = "LABEL";
        SPAN6.DELEGATE = "powerdynamo-tag-general";

        BEGIN6.text = "<!--formatting";

        END6.text = "-->";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        SPAN SPAN7 = new SPAN();
        SPAN7.TYPE = "LABEL";
        SPAN7.DELEGATE = "powerdynamo-tag-general";

        BEGIN7.text = "<!--/formatting";

        END7.text = "-->";


        SPAN7.BEGIN = new BEGIN[] { BEGIN7, };

        SPAN SPAN8 = new SPAN();
        SPAN8.TYPE = "LABEL";
        SPAN8.DELEGATE = "powerdynamo-tag-general";

        BEGIN8.text = "<!--include";

        END8.text = "-->";


        SPAN8.BEGIN = new BEGIN[] { BEGIN8, };

        SPAN SPAN9 = new SPAN();
        SPAN9.TYPE = "LABEL";
        SPAN9.DELEGATE = "powerdynamo-tag-general";

        BEGIN9.text = "<!--label";

        END9.text = "-->";


        SPAN9.BEGIN = new BEGIN[] { BEGIN9, };

        SPAN SPAN10 = new SPAN();
        SPAN10.TYPE = "LABEL";
        SPAN10.DELEGATE = "transact-sql::MAIN";

        BEGIN10.text = "<!--sql";

        END10.text = "-->";


        SPAN10.BEGIN = new BEGIN[] { BEGIN10, };

        SPAN SPAN11 = new SPAN();
        SPAN11.TYPE = "LABEL";
        SPAN11.DELEGATE = "powerdynamo-tag-general";

        BEGIN11.text = "<!--sql_error_code";

        END11.text = "-->";


        SPAN11.BEGIN = new BEGIN[] { BEGIN11, };

        SPAN SPAN12 = new SPAN();
        SPAN12.TYPE = "LABEL";
        SPAN12.DELEGATE = "powerdynamo-tag-general";

        BEGIN12.text = "<!--sql_error_info";

        END12.text = "-->";


        SPAN12.BEGIN = new BEGIN[] { BEGIN12, };

        SPAN SPAN13 = new SPAN();
        SPAN13.TYPE = "LABEL";
        SPAN13.DELEGATE = "powerdynamo-tag-general";

        BEGIN13.text = "<!--sql_state";

        END13.text = "-->";


        SPAN13.BEGIN = new BEGIN[] { BEGIN13, };

        SPAN SPAN14 = new SPAN();
        SPAN14.TYPE = "LABEL";
        SPAN14.DELEGATE = "powerdynamo-tag-general";

        BEGIN14.text = "<!--sql_on_no_error";

        END14.text = "-->";


        SPAN14.BEGIN = new BEGIN[] { BEGIN14, };

        SPAN SPAN15 = new SPAN();
        SPAN15.TYPE = "LABEL";
        SPAN15.DELEGATE = "powerdynamo-tag-general";

        BEGIN15.text = "<!--/sql_on_no_error";

        END15.text = "-->";


        SPAN15.BEGIN = new BEGIN[] { BEGIN15, };

        SPAN SPAN16 = new SPAN();
        SPAN16.TYPE = "LABEL";
        SPAN16.DELEGATE = "powerdynamo-tag-general";

        BEGIN16.text = "<!--sql_on_error";

        END16.text = "-->";


        SPAN16.BEGIN = new BEGIN[] { BEGIN16, };

        SPAN SPAN17 = new SPAN();
        SPAN17.TYPE = "LABEL";
        SPAN17.DELEGATE = "powerdynamo-tag-general";

        BEGIN17.text = "<!--/sql_on_error";

        END17.text = "-->";


        SPAN17.BEGIN = new BEGIN[] { BEGIN17, };

        SPAN SPAN18 = new SPAN();
        SPAN18.TYPE = "LABEL";
        SPAN18.DELEGATE = "powerdynamo-tag-general";

        BEGIN18.text = "<!--sql_on_no_rows";

        END18.text = "-->";


        SPAN18.BEGIN = new BEGIN[] { BEGIN18, };

        SPAN SPAN19 = new SPAN();
        SPAN19.TYPE = "LABEL";
        SPAN19.DELEGATE = "powerdynamo-tag-general";

        BEGIN19.text = "<!--/sql_on_no_rows";

        END19.text = "-->";


        SPAN19.BEGIN = new BEGIN[] { BEGIN19, };

        SPAN SPAN20 = new SPAN();
        SPAN20.TYPE = "LABEL";
        SPAN20.DELEGATE = "powerdynamo-tag-general";

        BEGIN20.text = "<!--sql_on_rows";

        END20.text = "-->";


        SPAN20.BEGIN = new BEGIN[] { BEGIN20, };

        SPAN SPAN21 = new SPAN();
        SPAN21.TYPE = "LABEL";
        SPAN21.DELEGATE = "powerdynamo-tag-general";

        BEGIN21.text = "<!--/sql_on_rows";

        END21.text = "-->";


        SPAN21.BEGIN = new BEGIN[] { BEGIN21, };

        SPAN SPAN22 = new SPAN();
        SPAN22.TYPE = "COMMENT1";

        BEGIN22.text = "<!--";

        END22.text = "-->";


        SPAN22.BEGIN = new BEGIN[] { BEGIN22, };

        SPAN SPAN23 = new SPAN();
        SPAN23.TYPE = "MARKUP";
        SPAN23.DELEGATE = "html::JAVASCRIPT";

        BEGIN23.text = "<SCRIPT";

        END23.text = "</SCRIPT>";


        SPAN23.BEGIN = new BEGIN[] { BEGIN23, };

        SPAN SPAN24 = new SPAN();
        SPAN24.TYPE = "MARKUP";
        SPAN24.DELEGATE = "html::CSS";

        BEGIN24.text = "<STYLE";

        END24.text = "</STYLE>";


        SPAN24.BEGIN = new BEGIN[] { BEGIN24, };

        SPAN SPAN25 = new SPAN();
        SPAN25.TYPE = "KEYWORD2";
        SPAN25.DELEGATE = "xml::DTD-TAGS";

        BEGIN25.text = "<!";

        END25.text = ">";


        SPAN25.BEGIN = new BEGIN[] { BEGIN25, };

        SPAN SPAN26 = new SPAN();
        SPAN26.TYPE = "MARKUP";
        SPAN26.DELEGATE = "TAGS";

        BEGIN26.text = "<";

        END26.text = ">";


        SPAN26.BEGIN = new BEGIN[] { BEGIN26, };

        SPAN SPAN27 = new SPAN();
        SPAN27.NO_WORD_BREAK = "TRUE";
        SPAN27.TYPE = "LITERAL2";

        BEGIN27.text = "&";

        END27.text = ";";


        SPAN27.BEGIN = new BEGIN[] { BEGIN27, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, SPAN7, SPAN8, SPAN9, SPAN10, SPAN11, SPAN12, SPAN13, SPAN14, SPAN15, SPAN16, SPAN17, SPAN18, SPAN19, SPAN20, SPAN21, SPAN22, SPAN23, SPAN24, SPAN25, SPAN26, SPAN27, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "TAGS";
        RULES1.DEFAULT = "MARKUP";

        SPAN1.TYPE = "LABEL";
        SPAN1.DELEGATE = "powerdynamo-script";

        BEGIN1.text = "<!--script";

        END1.text = "--?>";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL1";
        SPAN2.DELEGATE = "TAGS_LITERAL";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "LITERAL1";
        SPAN3.DELEGATE = "TAGS_LITERAL";

        BEGIN3.text = "'";

        END3.text = "'";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

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

        SPAN1.TYPE = "LABEL";
        SPAN1.DELEGATE = "powerdynamo-script";

        BEGIN1.text = "<!--script";

        END1.text = "?-->";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "powerdynamo-script";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "/*";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL1";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "LITERAL1";

        BEGIN3.text = "'";

        END3.text = "'";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "//";
        EOL_SPAN1.TYPE = "COMMENT1";

        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "!";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = ">=";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "<=";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "=";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "+";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "-";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "/";
        SEQ8.TYPE = "OPERATOR";

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

        SEQ17.text = ".";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "}";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = "{";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = ",";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = ";";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = "]";
        SEQ22.TYPE = "OPERATOR";

        SEQ23.text = "[";
        SEQ23.TYPE = "OPERATOR";

        SEQ24.text = "?";
        SEQ24.TYPE = "OPERATOR";

        SEQ25.text = "@";
        SEQ25.TYPE = "OPERATOR";

        SEQ26.text = ":";
        SEQ26.TYPE = "OPERATOR";

        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        SEQ27.text = ")";
        SEQ27.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD2", new String[]{"", "document", "connection", "file", "query", "session", "site", "system", "typeof", });
        KEYWORDS1.add("KEYWORD3", new String[]{"AskQuestion", "autoCommit", "Close", "Commit", "Connect", "CreateConnection", "CreateDocument", "CreatePropertySheet", "CreateQuery", "CreateWizard", "cachedOutputTimeOut", "charAt", "connected", "connection", "connectionId", "connectionName", "connectionType", "connectParameters", "contentType", "DeleteConnection", "DeleteDocument", "Disconnect", "database", "dataSource", "dataSourceList", "description", "Exec", "Execute", "ExportTo", "eof", "errorNumber", "errorString", "GetColumnCount", "GetColumnIndex", "GetColumnLabel", "GetConnection", "GetConnectionIdList", "GetConnectionNameList", "GetCWD", "GetDirectory", "GetDocument", "GetEmpty", "GetEnv", "GetErrorCode", "GetErrorInfo", "GetEventList", "GetFilePtr", "GetGenerated", "GetRootDocument", "GetRowCount", "GetServerVariable", "GetState", "GetSupportedMoves", "GetValue", "ImportFrom", "Include", "id", "indexOf", "lastIndexOf", "lastModified", "length", "location", "Move", "MoveFirst", "MoveLast", "MoveNext", "MovePrevious", "MoveRelative", "mode", "name", "OnEvent", "Open", "Opened", "parent", "password", "ReadChar", "ReadLine", "Refresh", "Rollback", "redirect", "Seek", "SetEnv", "SetSQL", "ShowMessage", "substring", "server", "simulateCursors", "size", "source", "status", "timeOut", "toLowerCase", "toUpperCase", "type", "userId", "value", "WriteLine", "Write", "write", "writeln", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, SEQ26, SEQ27, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES5() {
        RULES RULES1 = new RULES();
        RULES1.SET = "powerdynamo-tag-general";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "LITERAL1";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL1";

        BEGIN2.text = "'";

        END2.text = "'";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        KEYWORDS KEYWORDS1 = new KEYWORDS();

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES6() {
        RULES RULES1 = new RULES();
        RULES1.SET = "powerdynamo-tag-data";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "LITERAL1";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL1";

        BEGIN2.text = "'";

        END2.text = "'";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        KEYWORDS KEYWORDS1 = new KEYWORDS();

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES7() {
        RULES RULES1 = new RULES();
        RULES1.SET = "powerdynamo-tag-document";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "LITERAL1";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL1";

        BEGIN2.text = "'";

        END2.text = "'";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        KEYWORDS KEYWORDS1 = new KEYWORDS();

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), RULES5(), RULES6(), RULES7(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}