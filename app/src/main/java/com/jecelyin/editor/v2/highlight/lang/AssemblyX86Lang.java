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
public class AssemblyX86Lang implements LangDefine {
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
        RULES1.DIGIT_RE = "(0x)?[\\p{Digit}a-fA-F_]+[hHdD]?";
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

        SEQ1.text = "+";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "-";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "/";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "*";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "%";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "|";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "^";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "&";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "~";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "!";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "=";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "<";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = ">";
        SEQ13.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD2", new String[]{"DB", "DW", "DD", "DF", "DQ", "DT", "RESB", "RESW", "RESD", "RESQ", "REST", "EQU", "TEXTEQU", "TIMES", "DUP", "BYTE", "WORD", "DWORD", "FWORD", "QWORD", "TBYTE", "SBYTE", "TWORD", "SWORD", "SDWORD", "REAL4", "REAL8", "REAL10", });
        KEYWORDS1.add("FUNCTION", new String[]{"AAA", "AAD", "AAM", "AAS", "ADC", "ADD", "ADDPS", "ADDSS", "AND", "ANDNPS", "ANDPS", "ARPL", "BOUND", "BSF", "BSR", "BSWAP", "BT", "BTC", "BTR", "BTS", "CALL", "CBW", "CDQ", "CLC", "CLD", "CLI", "CLTS", "CMC", "CMOVA", "CMOVAE", "CMOVB", "CMOVBE", "CMOVC", "CMOVE", "CMOVG", "CMOVGE", "CMOVL", "CMOVLE", "CMOVNA", "CMOVNAE", "CMOVNB", "CMOVNBE", "CMOVNC", "CMOVNE", "CMOVNG", "CMOVNGE", "CMOVNL", "CMOVNLE", "CMOVNO", "CMOVNP", "CMOVNS", "CMOVNZ", "CMOVO", "CMOVP", "CMOVPE", "CMOVPO", "CMOVS", "CMOVZ", "CMP", "CMPPS", "CMPS", "CMPSB", "CMPSD", "CMPSS", "CMPSW", "CMPXCHG", "CMPXCHGB", "COMISS", "CPUID", "CWD", "CWDE", "CVTPI2PS", "CVTPS2PI", "CVTSI2SS", "CVTSS2SI", "CVTTPS2PI", "CVTTSS2SI", "DAA", "DAS", "DEC", "DIV", "DIVPS", "DIVSS", "EMMS", "ENTER", "F2XM1", "FABS", "FADD", "FADDP", "FBLD", "FBSTP", "FCHS", "FCLEX", "FCMOVB", "FCMOVBE", "FCMOVE", "FCMOVNB", "FCMOVNBE", "FCMOVNE", "FCMOVNU", "FCMOVU", "FCOM", "FCOMI", "FCOMIP", "FCOMP", "FCOMPP", "FCOS", "FDECSTP", "FDIV", "FDIVP", "FDIVR", "FDIVRP", "FFREE", "FIADD", "FICOM", "FICOMP", "FIDIV", "FIDIVR", "FILD", "FIMUL", "FINCSTP", "FINIT", "FIST", "FISTP", "FISUB", "FISUBR", "FLD1", "FLDCW", "FLDENV", "FLDL2E", "FLDL2T", "FLDLG2", "FLDLN2", "FLDPI", "FLDZ", "FMUL", "FMULP", "FNCLEX", "FNINIT", "FNOP", "FNSAVE", "FNSTCW", "FNSTENV", "FNSTSW", "FPATAN", "FPREM", "FPREMI", "FPTAN", "FRNDINT", "FRSTOR", "FSAVE", "FSCALE", "FSIN", "FSINCOS", "FSQRT", "FST", "FSTCW", "FSTENV", "FSTP", "FSTSW", "FSUB", "FSUBP", "FSUBR", "FSUBRP", "FTST", "FUCOM", "FUCOMI", "FUCOMIP", "FUCOMP", "FUCOMPP", "FWAIT", "FXAM", "FXCH", "FXRSTOR", "FXSAVE", "FXTRACT", "FYL2X", "FYL2XP1", "HLT", "IDIV", "IMUL", "IN", "INC", "INS", "INSB", "INSD", "INSW", "INT", "INTO", "INVD", "INVLPG", "IRET", "JA", "JAE", "JB", "JBE", "JC", "JCXZ", "JE", "JECXZ", "JG", "JGE", "JL", "JLE", "JMP", "JNA", "JNAE", "JNB", "JNBE", "JNC", "JNE", "JNG", "JNGE", "JNL", "JNLE", "JNO", "JNP", "JNS", "JNZ", "JO", "JP", "JPE", "JPO", "JS", "JZ", "LAHF", "LAR", "LDMXCSR", "LDS", "LEA", "LEAVE", "LES", "LFS", "LGDT", "LGS", "LIDT", "LLDT", "LMSW", "LOCK", "LODS", "LODSB", "LODSD", "LODSW", "LOOP", "LOOPE", "LOOPNE", "LOOPNZ", "LOOPZ", "LSL", "LSS", "LTR", "MASKMOVQ", "MAXPS", "MAXSS", "MINPS", "MINSS", "MOV", "MOVAPS", "MOVD", "MOVHLPS", "MOVHPS", "MOVLHPS", "MOVLPS", "MOVMSKPS", "MOVNTPS", "MOVNTQ", "MOVQ", "MOVS", "MOVSB", "MOVSD", "MOVSS", "MOVSW", "MOVSX", "MOVUPS", "MOVZX", "MUL", "MULPS", "MULSS", "NEG", "NOP", "NOT", "OR", "ORPS", "OUT", "OUTS", "OUTSB", "OUTSD", "OUTSW", "PACKSSDW", "PACKSSWB", "PACKUSWB", "PADDB", "PADDD", "PADDSB", "PADDSW", "PADDUSB", "PADDUSW", "PADDW", "PAND", "PANDN", "PAVGB", "PAVGW", "PCMPEQB", "PCMPEQD", "PCMPEQW", "PCMPGTB", "PCMPGTD", "PCMPGTW", "PEXTRW", "PINSRW", "PMADDWD", "PMAXSW", "PMAXUB", "PMINSW", "PMINUB", "PMOVMSKB", "PMULHUW", "PMULHW", "PMULLW", "POP", "POPA", "POPAD", "POPAW", "POPF", "POPFD", "POPFW", "POR", "PREFETCH", "PSADBW", "PSHUFW", "PSLLD", "PSLLQ", "PSLLW", "PSRAD", "PSRAW", "PSRLD", "PSRLQ", "PSRLW", "PSUBB", "PSUBD", "PSUBSB", "PSUBSW", "PSUBUSB", "PSUBUSW", "PSUBW", "PUNPCKHBW", "PUNPCKHDQ", "PUNPCKHWD", "PUNPCKLBW", "PUNPCKLDQ", "PUNPCKLWD", "PUSH", "PUSHA", "PUSHAD", "PUSHAW", "PUSHF", "PUSHFD", "PUSHFW", "PXOR", "RCL", "RCR", "RDMSR", "RDPMC", "RDTSC", "REP", "REPE", "REPNE", "REPNZ", "REPZ", "RET", "RETF", "RETN", "ROL", "ROR", "RSM", "SAHF", "SAL", "SAR", "SBB", "SCAS", "SCASB", "SCASD", "SCASW", "SETA", "SETAE", "SETB", "SETBE", "SETC", "SETE", "SETG", "SETGE", "SETL", "SETLE", "SETNA", "SETNAE", "SETNB", "SETNBE", "SETNC", "SETNE", "SETNG", "SETNGE", "SETNL", "SETNLE", "SETNO", "SETNP", "SETNS", "SETNZ", "SETO", "SETP", "SETPE", "SETPO", "SETS", "SETZ", "SFENCE", "SGDT", "SHL", "SHLD", "SHR", "SHRD", "SHUFPS", "SIDT", "SLDT", "SMSW", "SQRTPS", "SQRTSS", "STC", "STD", "STI", "STMXCSR", "STOS", "STOSB", "STOSD", "STOSW", "STR", "SUB", "SUBPS", "SUBSS", "SYSENTER", "SYSEXIT", "TEST", "UB2", "UCOMISS", "UNPCKHPS", "UNPCKLPS", "WAIT", "WBINVD", "VERR", "VERW", "WRMSR", "XADD", "XCHG", "XLAT", "XLATB", "XOR", "XORPS", "FEMMS", "PAVGUSB", "PF2ID", "PFACC", "PFADD", "PFCMPEQ", "PFCMPGE", "PFCMPGT", "PFMAX", "PFMIN", "PFMUL", "PFRCP", "PFRCPIT1", "PFRCPIT2", "PFRSQIT1", "PFRSQRT", "PFSUB", "PFSUBR", "PI2FD", "PMULHRW", "PREFETCHW", "PF2IW", "PFNACC", "PFPNACC", "PI2FW", "PSWAPD", "PREFETCHNTA", "PREFETCHT0", "PREFETCHT1", "PREFETCHT2", });
        KEYWORDS1.add("KEYWORD3", new String[]{"AL", "BL", "CL", "DL", "AH", "BH", "CH", "DH", "AX", "BX", "CX", "DX", "SI", "DI", "SP", "BP", "EAX", "EBX", "ECX", "EDX", "ESI", "EDI", "ESP", "EBP", "CS", "DS", "SS", "ES", "FS", "GS", "ST", "ST0", "ST1", "ST2", "ST3", "ST4", "ST5", "ST6", "ST7", "MM0", "MM1", "MM2", "MM3", "MM4", "MM5", "MM6", "MM7", "XMM0", "XMM1", "XMM2", "XMM3", "XMM4", "XMM5", "XMM6", "XMM7", "CR0", "CR2", "CR3", "CR4", "DR0", "DR1", "DR2", "DR3", "DR4", "DR5", "DR6", "DR7", "TR3", "TR4", "TR5", "TR6", "TR7", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, MARK_FOLLOWING2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, };

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