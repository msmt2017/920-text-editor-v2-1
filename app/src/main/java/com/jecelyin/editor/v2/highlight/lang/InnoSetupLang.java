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
public class InnoSetupLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = ";";
        PROPERTY1.NAME = "lineComment";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "FALSE";

        SEQ1.text = "[code]";
        SEQ1.TYPE = "KEYWORD2";
        SEQ1.AT_LINE_START = "TRUE";
        SEQ1.DELEGATE = "pascal::MAIN";

        SEQ2.text = "[Setup]";
        SEQ2.TYPE = "KEYWORD2";
        SEQ2.AT_LINE_START = "TRUE";

        SEQ3.text = "[Types]";
        SEQ3.TYPE = "KEYWORD2";
        SEQ3.AT_LINE_START = "TRUE";

        SEQ4.text = "[Components]";
        SEQ4.TYPE = "KEYWORD2";
        SEQ4.AT_LINE_START = "TRUE";

        SEQ5.text = "[Tasks]";
        SEQ5.TYPE = "KEYWORD2";
        SEQ5.AT_LINE_START = "TRUE";

        SEQ6.text = "[Dirs]";
        SEQ6.TYPE = "KEYWORD2";
        SEQ6.AT_LINE_START = "TRUE";

        SEQ7.text = "[Files]";
        SEQ7.TYPE = "KEYWORD2";
        SEQ7.AT_LINE_START = "TRUE";

        SEQ8.text = "[Icons]";
        SEQ8.TYPE = "KEYWORD2";
        SEQ8.AT_LINE_START = "TRUE";

        SEQ9.text = "[INI]";
        SEQ9.TYPE = "KEYWORD2";
        SEQ9.AT_LINE_START = "TRUE";

        SEQ10.text = "[InstallDelete]";
        SEQ10.TYPE = "KEYWORD2";
        SEQ10.AT_LINE_START = "TRUE";

        SEQ11.text = "[Languages]";
        SEQ11.TYPE = "KEYWORD2";
        SEQ11.AT_LINE_START = "TRUE";

        SEQ12.text = "[Messages]";
        SEQ12.TYPE = "KEYWORD2";
        SEQ12.AT_LINE_START = "TRUE";

        SEQ13.text = "[CustomMessages]";
        SEQ13.TYPE = "KEYWORD2";
        SEQ13.AT_LINE_START = "TRUE";

        SEQ14.text = "[LangOptions]";
        SEQ14.TYPE = "KEYWORD2";
        SEQ14.AT_LINE_START = "TRUE";

        SEQ15.text = "[Registry]";
        SEQ15.TYPE = "KEYWORD2";
        SEQ15.AT_LINE_START = "TRUE";

        SEQ16.text = "[Run]";
        SEQ16.TYPE = "KEYWORD2";
        SEQ16.AT_LINE_START = "TRUE";

        SEQ17.text = "[UninstallRun]";
        SEQ17.TYPE = "KEYWORD2";
        SEQ17.AT_LINE_START = "TRUE";

        SEQ18.text = "[UninstallDelete]";
        SEQ18.TYPE = "KEYWORD2";
        SEQ18.AT_LINE_START = "TRUE";

        EOL_SPAN1.text = "#define";
        EOL_SPAN1.TYPE = "LITERAL4";
        EOL_SPAN1.DELEGATE = "DIRECTIVE";

        EOL_SPAN2.text = "#dim";
        EOL_SPAN2.TYPE = "LITERAL4";
        EOL_SPAN2.DELEGATE = "DIRECTIVE";

        EOL_SPAN3.text = "#undef";
        EOL_SPAN3.TYPE = "LITERAL4";
        EOL_SPAN3.DELEGATE = "DIRECTIVE";

        EOL_SPAN4.text = "#include";
        EOL_SPAN4.TYPE = "LITERAL4";
        EOL_SPAN4.DELEGATE = "DIRECTIVE";

        EOL_SPAN5.text = "#emit";
        EOL_SPAN5.TYPE = "LITERAL4";
        EOL_SPAN5.DELEGATE = "DIRECTIVE";

        EOL_SPAN6.text = "#expr";
        EOL_SPAN6.TYPE = "LITERAL4";
        EOL_SPAN6.DELEGATE = "DIRECTIVE";

        EOL_SPAN7.text = "#insert";
        EOL_SPAN7.TYPE = "LITERAL4";
        EOL_SPAN7.DELEGATE = "DIRECTIVE";

        EOL_SPAN8.text = "#append";
        EOL_SPAN8.TYPE = "LITERAL4";
        EOL_SPAN8.DELEGATE = "DIRECTIVE";

        EOL_SPAN9.text = "#if";
        EOL_SPAN9.TYPE = "LITERAL4";
        EOL_SPAN9.DELEGATE = "DIRECTIVE";

        EOL_SPAN10.text = "#elif";
        EOL_SPAN10.TYPE = "LITERAL4";
        EOL_SPAN10.DELEGATE = "DIRECTIVE";

        EOL_SPAN11.text = "#else";
        EOL_SPAN11.TYPE = "LITERAL4";
        EOL_SPAN11.DELEGATE = "DIRECTIVE";

        EOL_SPAN12.text = "#endif";
        EOL_SPAN12.TYPE = "LITERAL4";
        EOL_SPAN12.DELEGATE = "DIRECTIVE";

        EOL_SPAN13.text = "#ifexist";
        EOL_SPAN13.TYPE = "LITERAL4";
        EOL_SPAN13.DELEGATE = "DIRECTIVE";

        EOL_SPAN14.text = "#ifnexist";
        EOL_SPAN14.TYPE = "LITERAL4";
        EOL_SPAN14.DELEGATE = "DIRECTIVE";

        EOL_SPAN15.text = "#ifdef";
        EOL_SPAN15.TYPE = "LITERAL4";
        EOL_SPAN15.DELEGATE = "DIRECTIVE";

        EOL_SPAN16.text = "#for";
        EOL_SPAN16.TYPE = "LITERAL4";
        EOL_SPAN16.DELEGATE = "DIRECTIVE";

        EOL_SPAN17.text = "#sub";
        EOL_SPAN17.TYPE = "LITERAL4";
        EOL_SPAN17.DELEGATE = "DIRECTIVE";

        EOL_SPAN18.text = "#endsub";
        EOL_SPAN18.TYPE = "LITERAL4";
        EOL_SPAN18.DELEGATE = "DIRECTIVE";

        EOL_SPAN19.text = "#pragma";
        EOL_SPAN19.TYPE = "LITERAL4";
        EOL_SPAN19.DELEGATE = "DIRECTIVE";

        EOL_SPAN20.text = "#error";
        EOL_SPAN20.TYPE = "LITERAL4";
        EOL_SPAN20.DELEGATE = "DIRECTIVE";

        SPAN1.TYPE = "LITERAL4";

        BEGIN1.text = "{#";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        MARK_FOLLOWING MARK_FOLLOWING1 = new MARK_FOLLOWING();
        MARK_FOLLOWING1.text = "%";
        MARK_FOLLOWING1.TYPE = "LITERAL2";

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

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "KEYWORD3";

        BEGIN4.text = "{";

        END4.text = "}";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        EOL_SPAN EOL_SPAN21 = new EOL_SPAN();
        EOL_SPAN21.text = ";";
        EOL_SPAN21.TYPE = "COMMENT1";
        EOL_SPAN21.AT_LINE_START = "TRUE";

        EOL_SPAN22.text = "#";
        EOL_SPAN22.TYPE = "COMMENT1";
        EOL_SPAN22.AT_LINE_START = "TRUE";


        KEYWORDS1.add("LITERAL3", new String[]{"allowunsafefiles", "checkedonce", "closeonexit", "compact", "comparetimestamp", "confirmoverwrite", "createkeyifdoesntexist", "createonlyiffileexists", "createvalueifdoesntexist", "deleteafterinstall", "deletekey", "deletevalue", "desktopicon", "dirifempty", "disablenouninstallwarning", "dontcloseonexit", "dontcopy", "dontcreatekey", "dontinheritcheck", "dontverifychecksum", "exclusive", "external", "files", "filesandordirs", "fixed", "fontisnttruetype", "full", "ignoreversion", "iscustom", "isreadme", "hidden", "hidewizard", "modify", "nocompression", "noencryption", "noerror", "noregerror", "nowait", "onlyifdestfileexists", "onlyifdoesntexist", "overwritereadonly", "postinstall", "preservestringtype", "promptifolder", "quicklaunchicon", "read", "readonly", "readexec", "recursesubdirs", "regserver", "regtypelib", "replacesameversion", "restart", "restartreplace", "runhidden", "runmaximized", "runminimized", "sharedfile", "shellexec", "skipifnotsilent", "skipifsilent", "skipifdoesntexist", "skipifsourcedoesntexist", "sortfilesbyextension", "system", "touch", "unchecked", "uninsalwaysuninstall", "uninsclearvalue", "uninsdeleteentry", "uninsdeletekey", "uninsdeletekeyifempty", "uninsdeletesection", "uninsdeletesectionifempty", "uninsdeletevalue", "uninsneveruninstall", "uninsremovereadonly", "uninsrestartdelete", "useapppaths", "waituntilidle", "HKCR", "HKCU", "HKLM", "HKU", "HKCC", "none", "string", "expandsz", "multisz", "dword", "binary", });
        KEYWORDS1.add("KEYWORD4", new String[]{"AfterInstall", "Attribs", "BeforeInstall", "Check", "Comment", "Components", "CopyMode", "Description", "DestDir", "DestName", "Excludes", "ExtraDiskSpaceRequired", "Filename", "Flags", "FontInstall", "GroupDescription", "HotKey", "IconFilename", "IconIndex", "InfoBeforeFile", "InfoAfterFile", "Key", "MessagesFile", "Name", "Parameters", "Permissions", "Root", "RunOnceId", "Section", "Source", "StatusMsg", "String", "Subkey", "Tasks", "Type", "Types", "ValueType", "ValueName", "ValueData", "WorkingDir", });
        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, EOL_SPAN3, EOL_SPAN4, EOL_SPAN5, EOL_SPAN6, EOL_SPAN7, EOL_SPAN8, EOL_SPAN9, EOL_SPAN10, EOL_SPAN11, EOL_SPAN12, EOL_SPAN13, EOL_SPAN14, EOL_SPAN15, EOL_SPAN16, EOL_SPAN17, EOL_SPAN18, EOL_SPAN19, EOL_SPAN20, EOL_SPAN21, EOL_SPAN22, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "STRING";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "LITERAL4";

        BEGIN1.text = "{#";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "KEYWORD3";
        SPAN2.DELEGATE = "CONSTANT";

        BEGIN2.text = "{";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "CONSTANT";
        RULES1.DEFAULT = "KEYWORD3";

        MARK_FOLLOWING1.text = "code:";
        MARK_FOLLOWING1.TYPE = "FUNCTION";
        MARK_FOLLOWING1.MATCH_TYPE = "CONTEXT";

        SEQ1.text = "|";
        SEQ1.TYPE = "OPERATOR";


        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "DIRECTIVE";
        RULES1.DEFAULT = "LITERAL4";
        RULES1.IGNORE_CASE = "TRUE";

        EOL_SPAN1.text = ";";
        EOL_SPAN1.TYPE = "COMMENT1";

        SPAN1.TYPE = "COMMENT2";

        BEGIN1.text = "/*";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL1";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        KEYWORDS KEYWORDS1 = new KEYWORDS();

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}