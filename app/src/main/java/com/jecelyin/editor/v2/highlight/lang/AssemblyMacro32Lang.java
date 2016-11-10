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
public class AssemblyMacro32Lang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = ";";
        PROPERTY1.NAME = "lineComment";

        PROPERTY2.VALUE = "true";
        PROPERTY2.NAME = "contextInsensitive";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "TRUE";

        EOL_SPAN1.text = ";";
        EOL_SPAN1.TYPE = "COMMENT1";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "LITERAL1";

        BEGIN1.text = "'";

        END1.text = "'";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL1";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        MARK_FOLLOWING MARK_FOLLOWING1 = new MARK_FOLLOWING();
        MARK_FOLLOWING1.text = "%%";
        MARK_FOLLOWING1.TYPE = "LABEL";
        MARK_FOLLOWING1.AT_LINE_START = "TRUE";
        MARK_FOLLOWING1.MATCH_TYPE = "OPERATOR";

        MARK_FOLLOWING2.text = "%";
        MARK_FOLLOWING2.TYPE = "KEYWORD2";
        MARK_FOLLOWING2.AT_LINE_START = "TRUE";

        MARK_PREVIOUS1.text = ":";
        MARK_PREVIOUS1.TYPE = "LABEL";
        MARK_PREVIOUS1.AT_LINE_START = "TRUE";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        SEQ1.text = "B^";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "D^";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "O^";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "X^";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "A^";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "M^";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "F^";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "C^";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "L^";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "G^";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "^";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "+";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "-";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = "/";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "*";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "@";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "#";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "&";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = "!";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = "\\";
        SEQ20.TYPE = "OPERATOR";


        KEYWORDS1.add("FUNCTION", new String[]{"ACBB", "ACBD", "ACBF", "ACBG", "ACBH", "ACBL", "ACBW", "ADAWI", "ADDB2", "ADDB3", "ADDD2", "ADDD3", "ADDF2", "ADDF3", "ADDG2", "ADDG3", "ADDH2", "ADDH3", "ADDL2", "ADDL3", "ADDP4", "ADDP6", "ADDW2", "ADDW3", "ADWC", "AOBLEQ", "AOBLSS", "ASHL", "ASHP", "ASHQ", "BBC", "BBCC", "BBCCI", "BBCS", "BBS", "BBSC", "BBSS", "BBSSI", "BCC", "BCS", "BEQL", "BEQLU", "BGEQ", "BGEQU", "BGTR", "BGTRU", "BICB2", "BICB3", "BICL2", "BICL3", "BICPSW", "BICW2", "BICW3", "BISB2", "BISB3", "BISL2", "BISL3", "BISPSW", "BISW2", "BISW3", "BITB", "BITL", "BITW", "BLBC", "BLBS", "BLEQ", "BLEQU", "BLSS", "BLSSU", "BNEQ", "BNEQU", "BPT", "BRB", "BRW", "BSBB", "BSBW", "BVC", "BVS", "CALLG", "CALLS", "CASEB", "CASEL", "CASEW", "CHME", "CHMK", "CHMS", "CHMU", "CLRB", "CLRD", "CLRF", "CLRG", "CLRH", "CLRL", "CLRO", "CLRQ", "CLRW", "CMPB", "CMPC3", "CMPC5", "CMPD", "CMPF", "CMPG", "CMPH", "CMPL", "CMPP3", "CMPP4", "CMPV", "CMPW", "CMPZV", "CRC", "CVTBD", "CVTBF", "CVTBG", "CVTBH", "CVTBL", "CVTBW", "CVTDB", "CVTDF", "CVTDH", "CVTDL", "CVTDW", "CVTFB", "CVTFD", "CVTFG", "CVTFH", "CVTFL", "CVTFW", "CVTGB", "CVTGF", "CVTGH", "CVTGL", "CVTGW", "CVTHB", "CVTHD", "CVTHF", "CVTHG", "CVTHL", "CVTHW", "CVTLB", "CVTLD", "CVTLF", "CVTLG", "CVTLH", "CVTLP", "CVTLW", "CVTPL", "CVTPS", "CVTPT", "CVTRDL", "CVTRFL", "CVTRGL", "CVTRHL", "CVTSP", "CVTTP", "CVTWB", "CVTWD", "CVTWF", "CVTWG", "CVTWH", "CVTWL", "DECB", "DECL", "DECW", "DIVB2", "DIVB3", "DIVD2", "DIVD3", "DIVF2", "DIVF3", "DIVG2", "DIVG3", "DIVH2", "DIVH3", "DIVL2", "DIVL3", "DIVP", "DIVW2", "DIVW3", "EDITPC", "EDIV", "EMODD", "EMODF", "EMODG", "EMODH", "EMUL", "EXTV", "EXTZV", "FFC", "FFS", "HALT", "INCB", "INCL", "INCW", "INDEX", "INSQHI", "INSQTI", "INSQUE", "INSV", "IOTA", "JMP", "JSB", "LDPCTX", "LOCC", "MATCHC", "MCOMB", "MCOML", "MCOMW", "MFPR", "MFVP", "MNEGB", "MNEGD", "MNEGF", "MNEGG", "MNEGH", "MNEGL", "MNEGW", "MOVAB", "MOVAD", "MOVAF", "MOVAG", "MOVAH", "MOVAL", "MOVAO", "MOVAQ", "MOVAW", "MOVB", "MOVC3", "MOVC5", "MOVD", "MOVF", "MOVG", "MOVH", "MOVL", "MOVO", "MOVP", "MOVPSL", "MOVQ", "MOVTC", "MOVTUC", "MOVW", "MOVZBL", "MOVZBW", "MOVZWL", "MTPR", "MTVP", "MULB2", "MULB3", "MULD2", "MULD3", "MULF2", "MULF3", "MULG2", "MULG3", "MULH2", "MULH3", "MULL2", "MULL3", "MULP", "MULW2", "MULW3", "NOP", "POLYD", "POLYF", "POLYG", "POLYH", "POPR", "PROBER", "PROBEW", "PUSHAB", "PUSHABL", "PUSHAL", "PUSHAD", "PUSHAF", "PUSHAG", "PUSHAH", "PUSHAL", "PUSHAO", "PUSHAQ", "PUSHAW", "PUSHL", "PUSHR", "REI", "REMQHI", "REMQTI", "REMQUE", "RET", "ROTL", "RSB", "SBWC", "SCANC", "SKPC", "SOBGEQ", "SOBGTR", "SPANC", "SUBB2", "SUBB3", "SUBD2", "SUBD3", "SUBF2", "SUBF3", "SUBG2", "SUBG3", "SUBH2", "SUBH3", "SUBL2", "SUBL3", "SUBP4", "SUBP6", "SUBW2", "SUBW3", "SVPCTX", "TSTB", "TSTD", "TSTF", "TSTG", "TSTH", "TSTL", "TSTW", "VGATHL", "VGATHQ", "VLDL", "VLDQ", "VSADDD", "VSADDF", "VSADDG", "VSADDL", "VSBICL", "VSBISL", "VSCATL", "VSCATQ", "VSCMPD", "VSCMPF", "VSCMPG", "VSCMPL", "VSDIVD", "VSDIVF", "VSDIVG", "VSMERGE", "VSMULD", "VSMULF", "VSMULG", "VSMULL", "VSSLLL", "VSSRLL", "VSSUBD", "VSSUBF", "VSSUBG", "VSSUBL", "VSTL", "VSTQ", "VSXORL", "VSYNC", "VVADDD", "VVADDF", "VVADDG", "VVADDL", "VVBICL", "VVBISL", "VVCMPD", "VVCMPF", "VVCMPG", "VVCMPL", "VVCVT", "VVDIVD", "VVDIVF", "VVDIVG", "VVMERGE", "VVMULD", "VVMULF", "VVMULG", "VVMULL", "VVSLLL", "VVSRLL", "VVSUBD", "VVSUBF", "VVSUBG", "VVSUBL", "VVXORL", "XFC", "XORB2", "XORB3", "XORL2", "XORL3", "XORW2", "XORW3", });
        KEYWORDS1.add("KEYWORD3", new String[]{"R0", "R1", "R2", "R3", "R4", "R5", "R6", "R7", "R8", "R9", "R10", "R11", "R12", "AP", "FP", "SP", "PC", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, MARK_FOLLOWING2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}