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
public class CsvLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "true";
        PROPERTY1.NAME = "contextInsensitive";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();

        SEQ1.text = "\"";
        SEQ1.TYPE = "MARKUP";
        SEQ1.AT_LINE_START = "TRUE";
        SEQ1.DELEGATE = "ODD_QUOTED";

        SEQ2.text = ",\"";
        SEQ2.TYPE = "MARKUP";
        SEQ2.DELEGATE = "COMMA_EVEN_QUOTED";

        SEQ3.text = ";\"";
        SEQ3.TYPE = "MARKUP";
        SEQ3.DELEGATE = "SEMICOLON_EVEN_QUOTED";

        EOL_SPAN_REGEXP1.text = ",(?=[^,]*$)";
        EOL_SPAN_REGEXP1.TYPE = "MARKUP";
        EOL_SPAN_REGEXP1.DELEGATE = "COMMA_LAST_COLUMN";
        EOL_SPAN_REGEXP1.HASH_CHAR = ",";

        EOL_SPAN_REGEXP2.text = ";(?=[^;]*$)";
        EOL_SPAN_REGEXP2.TYPE = "MARKUP";
        EOL_SPAN_REGEXP2.DELEGATE = "SEMICOLON_LAST_COLUMN";
        EOL_SPAN_REGEXP2.HASH_CHAR = ";";

        SEQ4.text = ",";
        SEQ4.TYPE = "MARKUP";
        SEQ4.DELEGATE = "COMMA_EVEN";

        SEQ5.text = ";";
        SEQ5.TYPE = "MARKUP";
        SEQ5.DELEGATE = "SEMICOLON_EVEN";


        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "ODD_QUOTED";

        SEQ1.text = "\"\"";
        SEQ1.TYPE = "MARKUP";
        SEQ1.DELEGATE = "ODD_QUOTED";

        SEQ_REGEXP1.text = "\"(?=,[^\"][^,]*$)";
        SEQ_REGEXP1.TYPE = "MARKUP";
        SEQ_REGEXP1.DELEGATE = "COMMA_MAIN";
        SEQ_REGEXP1.HASH_CHAR = "\"";

        SEQ_REGEXP2.text = "\"(?=;[^\"][^;]*$)";
        SEQ_REGEXP2.TYPE = "MARKUP";
        SEQ_REGEXP2.DELEGATE = "SEMICOLON_MAIN";
        SEQ_REGEXP2.HASH_CHAR = "\"";

        SEQ2.text = "\",\"";
        SEQ2.TYPE = "MARKUP";
        SEQ2.DELEGATE = "COMMA_EVEN_QUOTED";

        SEQ3.text = "\";\"";
        SEQ3.TYPE = "MARKUP";
        SEQ3.DELEGATE = "SEMICOLON_EVEN_QUOTED";

        SEQ_REGEXP3.text = "\",$";
        SEQ_REGEXP3.TYPE = "MARKUP";
        SEQ_REGEXP3.DELEGATE = "COMMA_MAIN";
        SEQ_REGEXP3.HASH_CHAR = "\",";

        SEQ_REGEXP4.text = "\";$";
        SEQ_REGEXP4.TYPE = "MARKUP";
        SEQ_REGEXP4.DELEGATE = "SEMICOLON_MAIN";
        SEQ_REGEXP4.HASH_CHAR = "\";";

        SEQ4.text = "\",";
        SEQ4.TYPE = "MARKUP";
        SEQ4.DELEGATE = "COMMA_EVEN";

        SEQ5.text = "\";";
        SEQ5.TYPE = "MARKUP";
        SEQ5.DELEGATE = "SEMICOLON_EVEN";

        SEQ_REGEXP5.text = "\"$";
        SEQ_REGEXP5.TYPE = "MARKUP";
        SEQ_REGEXP5.DELEGATE = "MAIN";
        SEQ_REGEXP5.HASH_CHAR = "\"";

        SEQ6.text = "\"";
        SEQ6.TYPE = "MARKUP";
        SEQ6.DELEGATE = "EVEN";


        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "EVEN";
        RULES1.DEFAULT = "COMMENT1";

        SEQ1.text = ",\"";
        SEQ1.TYPE = "MARKUP";
        SEQ1.DELEGATE = "COMMA_ODD_QUOTED";

        SEQ2.text = ";\"";
        SEQ2.TYPE = "MARKUP";
        SEQ2.DELEGATE = "SEMICOLON_ODD_QUOTED";

        SEQ3.text = ",";
        SEQ3.TYPE = "MARKUP";
        SEQ3.DELEGATE = "COMMA_MAIN";

        SEQ4.text = ";";
        SEQ4.TYPE = "MARKUP";
        SEQ4.DELEGATE = "SEMICOLON_MAIN";


        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "EVEN_QUOTED";
        RULES1.DEFAULT = "COMMENT1";

        SEQ1.text = "\"\"";
        SEQ1.TYPE = "MARKUP";
        SEQ1.DELEGATE = "EVEN_QUOTED";

        SEQ2.text = "\",\"";
        SEQ2.TYPE = "MARKUP";
        SEQ2.DELEGATE = "COMMA_ODD_QUOTED";

        SEQ3.text = "\";\"";
        SEQ3.TYPE = "MARKUP";
        SEQ3.DELEGATE = "SEMICOLON_ODD_QUOTED";

        SEQ4.text = "\",";
        SEQ4.TYPE = "MARKUP";
        SEQ4.DELEGATE = "COMMA_MAIN";

        SEQ5.text = "\";";
        SEQ5.TYPE = "MARKUP";
        SEQ5.DELEGATE = "SEMICOLON_MAIN";

        SEQ6.text = "\"";
        SEQ6.TYPE = "MARKUP";
        SEQ6.DELEGATE = "MAIN";


        return RULES1;
    }

    private RULES RULES5() {
        RULES RULES1 = new RULES();
        RULES1.SET = "COMMA_MAIN";

        SEQ1.text = "\"";
        SEQ1.TYPE = "MARKUP";
        SEQ1.AT_LINE_START = "TRUE";
        SEQ1.DELEGATE = "COMMA_ODD_QUOTED";

        SEQ2.text = ",\"";
        SEQ2.TYPE = "MARKUP";
        SEQ2.DELEGATE = "COMMA_EVEN_QUOTED";

        EOL_SPAN_REGEXP1.text = ",(?=[^,]*$)";
        EOL_SPAN_REGEXP1.TYPE = "MARKUP";
        EOL_SPAN_REGEXP1.DELEGATE = "COMMA_LAST_COLUMN";
        EOL_SPAN_REGEXP1.HASH_CHAR = ",";

        SEQ3.text = ",";
        SEQ3.TYPE = "MARKUP";
        SEQ3.DELEGATE = "COMMA_EVEN";


        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, };

        return RULES1;
    }

    private RULES RULES6() {
        RULES RULES1 = new RULES();
        RULES1.SET = "COMMA_ODD_QUOTED";

        SEQ1.text = "\"\"";
        SEQ1.TYPE = "MARKUP";
        SEQ1.DELEGATE = "COMMA_ODD_QUOTED";

        SEQ_REGEXP1.text = "\"(?=,[^\"][^,]*$)";
        SEQ_REGEXP1.TYPE = "MARKUP";
        SEQ_REGEXP1.DELEGATE = "COMMA_MAIN";
        SEQ_REGEXP1.HASH_CHAR = "\"";

        SEQ2.text = "\",\"";
        SEQ2.TYPE = "MARKUP";
        SEQ2.DELEGATE = "COMMA_EVEN_QUOTED";

        SEQ_REGEXP2.text = "\",$";
        SEQ_REGEXP2.TYPE = "MARKUP";
        SEQ_REGEXP2.DELEGATE = "COMMA_MAIN";
        SEQ_REGEXP2.HASH_CHAR = "\",";

        SEQ3.text = "\",";
        SEQ3.TYPE = "MARKUP";
        SEQ3.DELEGATE = "COMMA_EVEN";

        SEQ_REGEXP3.text = "\"$";
        SEQ_REGEXP3.TYPE = "MARKUP";
        SEQ_REGEXP3.DELEGATE = "COMMA_MAIN";
        SEQ_REGEXP3.HASH_CHAR = "\"";

        SEQ4.text = "\"";
        SEQ4.TYPE = "MARKUP";
        SEQ4.DELEGATE = "COMMA_EVEN";


        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, };

        return RULES1;
    }

    private RULES RULES7() {
        RULES RULES1 = new RULES();
        RULES1.SET = "COMMA_EVEN";
        RULES1.DEFAULT = "COMMENT1";

        SEQ1.text = ",\"";
        SEQ1.TYPE = "MARKUP";
        SEQ1.DELEGATE = "COMMA_ODD_QUOTED";

        SEQ2.text = ",";
        SEQ2.TYPE = "MARKUP";
        SEQ2.DELEGATE = "COMMA_MAIN";


        return RULES1;
    }

    private RULES RULES8() {
        RULES RULES1 = new RULES();
        RULES1.SET = "COMMA_EVEN_QUOTED";
        RULES1.DEFAULT = "COMMENT1";

        SEQ1.text = "\"\"";
        SEQ1.TYPE = "MARKUP";
        SEQ1.DELEGATE = "COMMA_EVEN_QUOTED";

        SEQ2.text = "\",\"";
        SEQ2.TYPE = "MARKUP";
        SEQ2.DELEGATE = "COMMA_ODD_QUOTED";

        SEQ3.text = "\",";
        SEQ3.TYPE = "MARKUP";
        SEQ3.DELEGATE = "COMMA_MAIN";

        SEQ4.text = "\"";
        SEQ4.TYPE = "MARKUP";
        SEQ4.DELEGATE = "COMMA_MAIN";


        return RULES1;
    }

    private RULES RULES9() {
        RULES RULES1 = new RULES();
        RULES1.SET = "COMMA_LAST_COLUMN";
        RULES1.DEFAULT = "COMMENT1";

    }

    private RULES RULES10() {
        RULES RULES1 = new RULES();
        RULES1.SET = "SEMICOLON_MAIN";

        SEQ1.text = "\"";
        SEQ1.TYPE = "MARKUP";
        SEQ1.AT_LINE_START = "TRUE";
        SEQ1.DELEGATE = "SEMICOLON_ODD_QUOTED";

        SEQ2.text = ";\"";
        SEQ2.TYPE = "MARKUP";
        SEQ2.DELEGATE = "SEMICOLON_EVEN_QUOTED";

        EOL_SPAN_REGEXP1.text = ";(?=[^;]*$)";
        EOL_SPAN_REGEXP1.TYPE = "MARKUP";
        EOL_SPAN_REGEXP1.DELEGATE = "SEMICOLON_LAST_COLUMN";
        EOL_SPAN_REGEXP1.HASH_CHAR = ";";

        SEQ3.text = ";";
        SEQ3.TYPE = "MARKUP";
        SEQ3.DELEGATE = "SEMICOLON_EVEN";


        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, };

        return RULES1;
    }

    private RULES RULES11() {
        RULES RULES1 = new RULES();
        RULES1.SET = "SEMICOLON_ODD_QUOTED";

        SEQ1.text = "\"\"";
        SEQ1.TYPE = "MARKUP";
        SEQ1.DELEGATE = "SEMICOLON_ODD_QUOTED";

        SEQ_REGEXP1.text = "\"(?=;[^\"][^;]*$)";
        SEQ_REGEXP1.TYPE = "MARKUP";
        SEQ_REGEXP1.DELEGATE = "SEMICOLON_MAIN";
        SEQ_REGEXP1.HASH_CHAR = "\"";

        SEQ2.text = "\";\"";
        SEQ2.TYPE = "MARKUP";
        SEQ2.DELEGATE = "SEMICOLON_EVEN_QUOTED";

        SEQ_REGEXP2.text = "\";$";
        SEQ_REGEXP2.TYPE = "MARKUP";
        SEQ_REGEXP2.DELEGATE = "SEMICOLON_MAIN";
        SEQ_REGEXP2.HASH_CHAR = "\";";

        SEQ3.text = "\";";
        SEQ3.TYPE = "MARKUP";
        SEQ3.DELEGATE = "SEMICOLON_EVEN";

        SEQ_REGEXP3.text = "\"$";
        SEQ_REGEXP3.TYPE = "MARKUP";
        SEQ_REGEXP3.DELEGATE = "SEMICOLON_MAIN";
        SEQ_REGEXP3.HASH_CHAR = "\"";

        SEQ4.text = "\"";
        SEQ4.TYPE = "MARKUP";
        SEQ4.DELEGATE = "SEMICOLON_EVEN";


        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, };

        return RULES1;
    }

    private RULES RULES12() {
        RULES RULES1 = new RULES();
        RULES1.SET = "SEMICOLON_EVEN";
        RULES1.DEFAULT = "COMMENT1";

        SEQ1.text = ";\"";
        SEQ1.TYPE = "MARKUP";
        SEQ1.DELEGATE = "SEMICOLON_ODD_QUOTED";

        SEQ2.text = ";";
        SEQ2.TYPE = "MARKUP";
        SEQ2.DELEGATE = "SEMICOLON_MAIN";


        return RULES1;
    }

    private RULES RULES13() {
        RULES RULES1 = new RULES();
        RULES1.SET = "SEMICOLON_EVEN_QUOTED";
        RULES1.DEFAULT = "COMMENT1";

        SEQ1.text = "\"\"";
        SEQ1.TYPE = "MARKUP";
        SEQ1.DELEGATE = "SEMICOLON_EVEN_QUOTED";

        SEQ2.text = "\";\"";
        SEQ2.TYPE = "MARKUP";
        SEQ2.DELEGATE = "SEMICOLON_ODD_QUOTED";

        SEQ3.text = "\";";
        SEQ3.TYPE = "MARKUP";
        SEQ3.DELEGATE = "SEMICOLON_MAIN";

        SEQ4.text = "\"";
        SEQ4.TYPE = "MARKUP";
        SEQ4.DELEGATE = "SEMICOLON_MAIN";


        return RULES1;
    }

    private RULES RULES14() {
        RULES RULES1 = new RULES();
        RULES1.SET = "SEMICOLON_LAST_COLUMN";
        RULES1.DEFAULT = "COMMENT1";

    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), RULES5(), RULES6(), RULES7(), RULES8(), RULES9(), RULES10(), RULES11(), RULES12(), RULES13(), RULES14(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}