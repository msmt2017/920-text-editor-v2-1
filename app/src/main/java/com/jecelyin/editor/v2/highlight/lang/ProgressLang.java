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
public class ProgressLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "/*";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "*/";
        PROPERTY2.NAME = "commentEnd";

        PROPERTY3.VALUE = "**";
        PROPERTY3.NAME = "boxComment";

        PROPERTY4.VALUE = "&scop cmt ";
        PROPERTY4.NAME = "lineComment";

        PROPERTY5.VALUE = "\\s*(if|do|for|else|case|repeat|procedure|function)(\\s+.*|\\s*)";
        PROPERTY5.NAME = "indentNextLine";

        PROPERTY6.VALUE = ",.;:/?^[]@";
        PROPERTY6.NAME = "wordBreakChars";

        PROPERTY7.VALUE = "{";
        PROPERTY7.NAME = "indentOpenBrackets";

        PROPERTY8.VALUE = "}";
        PROPERTY8.NAME = "indentCloseBrackets";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.SET = "COMMENT";
        RULES1.DEFAULT = "COMMENT1";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "COMMENT1";
        SPAN1.DELEGATE = "COMMENT";

        BEGIN1.text = "/*";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "COMMENT1";
        SPAN1.DELEGATE = "COMMENT";

        BEGIN1.text = "/*";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL1";
        SPAN2.ESCAPE = "~";

        BEGIN2.text = "'";

        END2.text = "'";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "LITERAL1";
        SPAN3.ESCAPE = "~";

        BEGIN3.text = "\"";

        END3.text = "\"";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        MARK_FOLLOWING MARK_FOLLOWING1 = new MARK_FOLLOWING();
        MARK_FOLLOWING1.text = "{&";
        MARK_FOLLOWING1.TYPE = "LABEL";

        SEQ1.text = "*";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "+";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = ",";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = ".";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "/";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "=";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "?";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "@";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "[";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "]";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "^";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "(";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = ")";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = ">=";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "<=";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "<>";
        SEQ16.TYPE = "OPERATOR";

        MARK_PREVIOUS1.text = ":";
        MARK_PREVIOUS1.AT_WHITESPACE_END = "TRUE";
        MARK_PREVIOUS1.TYPE = "LABEL";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        MARK_FOLLOWING2.text = ":accelerator";
        MARK_FOLLOWING2.TYPE = "FUNCTION";

        MARK_FOLLOWING3.text = ":accept-changes";
        MARK_FOLLOWING3.TYPE = "FUNCTION";

        MARK_FOLLOWING4.text = ":accept-row-changes";
        MARK_FOLLOWING4.TYPE = "FUNCTION";

        MARK_FOLLOWING5.text = ":add-buffer";
        MARK_FOLLOWING5.TYPE = "FUNCTION";

        MARK_FOLLOWING6.text = ":add-calc-column";
        MARK_FOLLOWING6.TYPE = "FUNCTION";

        MARK_FOLLOWING7.text = ":add-columns-from";
        MARK_FOLLOWING7.TYPE = "FUNCTION";

        MARK_FOLLOWING8.text = ":add-events-procedure";
        MARK_FOLLOWING8.TYPE = "FUNCTION";

        MARK_FOLLOWING9.text = ":add-fields-from";
        MARK_FOLLOWING9.TYPE = "FUNCTION";

        MARK_FOLLOWING10.text = ":add-first";
        MARK_FOLLOWING10.TYPE = "FUNCTION";

        MARK_FOLLOWING11.text = ":add-index-field";
        MARK_FOLLOWING11.TYPE = "FUNCTION";

        MARK_FOLLOWING12.text = ":add-last";
        MARK_FOLLOWING12.TYPE = "FUNCTION";

        MARK_FOLLOWING13.text = ":add-like-column";
        MARK_FOLLOWING13.TYPE = "FUNCTION";

        MARK_FOLLOWING14.text = ":add-like-field";
        MARK_FOLLOWING14.TYPE = "FUNCTION";

        MARK_FOLLOWING15.text = ":add-like-index";
        MARK_FOLLOWING15.TYPE = "FUNCTION";

        MARK_FOLLOWING16.text = ":add-new-field";
        MARK_FOLLOWING16.TYPE = "FUNCTION";

        MARK_FOLLOWING17.text = ":add-new-index";
        MARK_FOLLOWING17.TYPE = "FUNCTION";

        MARK_FOLLOWING18.text = ":add-super-procedure";
        MARK_FOLLOWING18.TYPE = "FUNCTION";

        MARK_FOLLOWING19.text = ":adm-data";
        MARK_FOLLOWING19.TYPE = "FUNCTION";

        MARK_FOLLOWING20.text = ":after-buffer";
        MARK_FOLLOWING20.TYPE = "FUNCTION";

        MARK_FOLLOWING21.text = ":after-rowid";
        MARK_FOLLOWING21.TYPE = "FUNCTION";

        MARK_FOLLOWING22.text = ":after-table";
        MARK_FOLLOWING22.TYPE = "FUNCTION";

        MARK_FOLLOWING23.text = ":allow-column-searching";
        MARK_FOLLOWING23.TYPE = "FUNCTION";

        MARK_FOLLOWING24.text = ":always-on-top";
        MARK_FOLLOWING24.TYPE = "FUNCTION";

        MARK_FOLLOWING25.text = ":ambiguous";
        MARK_FOLLOWING25.TYPE = "FUNCTION";

        MARK_FOLLOWING26.text = ":append-child";
        MARK_FOLLOWING26.TYPE = "FUNCTION";

        MARK_FOLLOWING27.text = ":appl-alert-boxes";
        MARK_FOLLOWING27.TYPE = "FUNCTION";

        MARK_FOLLOWING28.text = ":apply-callback";
        MARK_FOLLOWING28.TYPE = "FUNCTION";

        MARK_FOLLOWING29.text = ":appserver-info";
        MARK_FOLLOWING29.TYPE = "FUNCTION";

        MARK_FOLLOWING30.text = ":appserver-password";
        MARK_FOLLOWING30.TYPE = "FUNCTION";

        MARK_FOLLOWING31.text = ":appserver-userid";
        MARK_FOLLOWING31.TYPE = "FUNCTION";

        MARK_FOLLOWING32.text = ":async-request-count";
        MARK_FOLLOWING32.TYPE = "FUNCTION";

        MARK_FOLLOWING33.text = ":async-request-handle";
        MARK_FOLLOWING33.TYPE = "FUNCTION";

        MARK_FOLLOWING34.text = ":asynchronous";
        MARK_FOLLOWING34.TYPE = "FUNCTION";

        MARK_FOLLOWING35.text = ":attach-data-source";
        MARK_FOLLOWING35.TYPE = "FUNCTION";

        MARK_FOLLOWING36.text = ":attr-space";
        MARK_FOLLOWING36.TYPE = "FUNCTION";

        MARK_FOLLOWING37.text = ":attribute-names";
        MARK_FOLLOWING37.TYPE = "FUNCTION";

        MARK_FOLLOWING38.text = ":auto-completion";
        MARK_FOLLOWING38.TYPE = "FUNCTION";

        MARK_FOLLOWING39.text = ":auto-delete";
        MARK_FOLLOWING39.TYPE = "FUNCTION";

        MARK_FOLLOWING40.text = ":auto-delete-xml";
        MARK_FOLLOWING40.TYPE = "FUNCTION";

        MARK_FOLLOWING41.text = ":auto-end-key";
        MARK_FOLLOWING41.TYPE = "FUNCTION";

        MARK_FOLLOWING42.text = ":auto-go";
        MARK_FOLLOWING42.TYPE = "FUNCTION";

        MARK_FOLLOWING43.text = ":auto-indent";
        MARK_FOLLOWING43.TYPE = "FUNCTION";

        MARK_FOLLOWING44.text = ":auto-resize";
        MARK_FOLLOWING44.TYPE = "FUNCTION";

        MARK_FOLLOWING45.text = ":auto-return";
        MARK_FOLLOWING45.TYPE = "FUNCTION";

        MARK_FOLLOWING46.text = ":auto-validate";
        MARK_FOLLOWING46.TYPE = "FUNCTION";

        MARK_FOLLOWING47.text = ":auto-zap";
        MARK_FOLLOWING47.TYPE = "FUNCTION";

        MARK_FOLLOWING48.text = ":available";
        MARK_FOLLOWING48.TYPE = "FUNCTION";

        MARK_FOLLOWING49.text = ":available-formats";
        MARK_FOLLOWING49.TYPE = "FUNCTION";

        MARK_FOLLOWING50.text = ":background";
        MARK_FOLLOWING50.TYPE = "FUNCTION";

        MARK_FOLLOWING51.text = ":base-ade";
        MARK_FOLLOWING51.TYPE = "FUNCTION";

        MARK_FOLLOWING52.text = ":basic-logging";
        MARK_FOLLOWING52.TYPE = "FUNCTION";

        MARK_FOLLOWING53.text = ":batch-mode";
        MARK_FOLLOWING53.TYPE = "FUNCTION";

        MARK_FOLLOWING54.text = ":before-buffer";
        MARK_FOLLOWING54.TYPE = "FUNCTION";

        MARK_FOLLOWING55.text = ":before-rowid";
        MARK_FOLLOWING55.TYPE = "FUNCTION";

        MARK_FOLLOWING56.text = ":before-table";
        MARK_FOLLOWING56.TYPE = "FUNCTION";

        MARK_FOLLOWING57.text = ":bgcolor";
        MARK_FOLLOWING57.TYPE = "FUNCTION";

        MARK_FOLLOWING58.text = ":blank";
        MARK_FOLLOWING58.TYPE = "FUNCTION";

        MARK_FOLLOWING59.text = ":block-iteration-display";
        MARK_FOLLOWING59.TYPE = "FUNCTION";

        MARK_FOLLOWING60.text = ":border-bottom-chars";
        MARK_FOLLOWING60.TYPE = "FUNCTION";

        MARK_FOLLOWING61.text = ":border-bottom-pixels";
        MARK_FOLLOWING61.TYPE = "FUNCTION";

        MARK_FOLLOWING62.text = ":border-left-chars";
        MARK_FOLLOWING62.TYPE = "FUNCTION";

        MARK_FOLLOWING63.text = ":border-left-pixels";
        MARK_FOLLOWING63.TYPE = "FUNCTION";

        MARK_FOLLOWING64.text = ":border-right-chars";
        MARK_FOLLOWING64.TYPE = "FUNCTION";

        MARK_FOLLOWING65.text = ":border-right-pixels";
        MARK_FOLLOWING65.TYPE = "FUNCTION";

        MARK_FOLLOWING66.text = ":border-top-chars";
        MARK_FOLLOWING66.TYPE = "FUNCTION";

        MARK_FOLLOWING67.text = ":border-top-pixels";
        MARK_FOLLOWING67.TYPE = "FUNCTION";

        MARK_FOLLOWING68.text = ":box";
        MARK_FOLLOWING68.TYPE = "FUNCTION";

        MARK_FOLLOWING69.text = ":box-selectable";
        MARK_FOLLOWING69.TYPE = "FUNCTION";

        MARK_FOLLOWING70.text = ":browse-column-data-types";
        MARK_FOLLOWING70.TYPE = "FUNCTION";

        MARK_FOLLOWING71.text = ":browse-column-formats";
        MARK_FOLLOWING71.TYPE = "FUNCTION";

        MARK_FOLLOWING72.text = ":browse-column-labels";
        MARK_FOLLOWING72.TYPE = "FUNCTION";

        MARK_FOLLOWING73.text = ":buffer-chars";
        MARK_FOLLOWING73.TYPE = "FUNCTION";

        MARK_FOLLOWING74.text = ":buffer-compare";
        MARK_FOLLOWING74.TYPE = "FUNCTION";

        MARK_FOLLOWING75.text = ":buffer-copy";
        MARK_FOLLOWING75.TYPE = "FUNCTION";

        MARK_FOLLOWING76.text = ":buffer-create";
        MARK_FOLLOWING76.TYPE = "FUNCTION";

        MARK_FOLLOWING77.text = ":buffer-delete";
        MARK_FOLLOWING77.TYPE = "FUNCTION";

        MARK_FOLLOWING78.text = ":buffer-field";
        MARK_FOLLOWING78.TYPE = "FUNCTION";

        MARK_FOLLOWING79.text = ":buffer-handle";
        MARK_FOLLOWING79.TYPE = "FUNCTION";

        MARK_FOLLOWING80.text = ":buffer-lines";
        MARK_FOLLOWING80.TYPE = "FUNCTION";

        MARK_FOLLOWING81.text = ":buffer-name";
        MARK_FOLLOWING81.TYPE = "FUNCTION";

        MARK_FOLLOWING82.text = ":buffer-release";
        MARK_FOLLOWING82.TYPE = "FUNCTION";

        MARK_FOLLOWING83.text = ":buffer-validate";
        MARK_FOLLOWING83.TYPE = "FUNCTION";

        MARK_FOLLOWING84.text = ":buffer-value";
        MARK_FOLLOWING84.TYPE = "FUNCTION";

        MARK_FOLLOWING85.text = ":bytes-read";
        MARK_FOLLOWING85.TYPE = "FUNCTION";

        MARK_FOLLOWING86.text = ":bytes-written";
        MARK_FOLLOWING86.TYPE = "FUNCTION";

        MARK_FOLLOWING87.text = ":cache";
        MARK_FOLLOWING87.TYPE = "FUNCTION";

        MARK_FOLLOWING88.text = ":call-name";
        MARK_FOLLOWING88.TYPE = "FUNCTION";

        MARK_FOLLOWING89.text = ":call-type";
        MARK_FOLLOWING89.TYPE = "FUNCTION";

        MARK_FOLLOWING90.text = ":can-create";
        MARK_FOLLOWING90.TYPE = "FUNCTION";

        MARK_FOLLOWING91.text = ":can-delete";
        MARK_FOLLOWING91.TYPE = "FUNCTION";

        MARK_FOLLOWING92.text = ":can-read";
        MARK_FOLLOWING92.TYPE = "FUNCTION";

        MARK_FOLLOWING93.text = ":can-write";
        MARK_FOLLOWING93.TYPE = "FUNCTION";

        MARK_FOLLOWING94.text = ":cancel-break";
        MARK_FOLLOWING94.TYPE = "FUNCTION";

        MARK_FOLLOWING95.text = ":cancel-button";
        MARK_FOLLOWING95.TYPE = "FUNCTION";

        MARK_FOLLOWING96.text = ":cancel-requests";
        MARK_FOLLOWING96.TYPE = "FUNCTION";

        MARK_FOLLOWING97.text = ":cancelled";
        MARK_FOLLOWING97.TYPE = "FUNCTION";

        MARK_FOLLOWING98.text = ":careful-paint";
        MARK_FOLLOWING98.TYPE = "FUNCTION";

        MARK_FOLLOWING99.text = ":case-sensitive";
        MARK_FOLLOWING99.TYPE = "FUNCTION";

        MARK_FOLLOWING100.text = ":centered";
        MARK_FOLLOWING100.TYPE = "FUNCTION";

        MARK_FOLLOWING101.text = ":character_length";
        MARK_FOLLOWING101.TYPE = "FUNCTION";

        MARK_FOLLOWING102.text = ":charset";
        MARK_FOLLOWING102.TYPE = "FUNCTION";

        MARK_FOLLOWING103.text = ":checked";
        MARK_FOLLOWING103.TYPE = "FUNCTION";

        MARK_FOLLOWING104.text = ":child-num";
        MARK_FOLLOWING104.TYPE = "FUNCTION";

        MARK_FOLLOWING105.text = ":clear";
        MARK_FOLLOWING105.TYPE = "FUNCTION";

        MARK_FOLLOWING106.text = ":clear-selection";
        MARK_FOLLOWING106.TYPE = "FUNCTION";

        MARK_FOLLOWING107.text = ":client-connection-id";
        MARK_FOLLOWING107.TYPE = "FUNCTION";

        MARK_FOLLOWING108.text = ":client-type";
        MARK_FOLLOWING108.TYPE = "FUNCTION";

        MARK_FOLLOWING109.text = ":clone-node";
        MARK_FOLLOWING109.TYPE = "FUNCTION";

        MARK_FOLLOWING110.text = ":code";
        MARK_FOLLOWING110.TYPE = "FUNCTION";

        MARK_FOLLOWING111.text = ":codepage";
        MARK_FOLLOWING111.TYPE = "FUNCTION";

        MARK_FOLLOWING112.text = ":column-bgcolor";
        MARK_FOLLOWING112.TYPE = "FUNCTION";

        MARK_FOLLOWING113.text = ":column-dcolor";
        MARK_FOLLOWING113.TYPE = "FUNCTION";

        MARK_FOLLOWING114.text = ":column-fgcolor";
        MARK_FOLLOWING114.TYPE = "FUNCTION";

        MARK_FOLLOWING115.text = ":column-font";
        MARK_FOLLOWING115.TYPE = "FUNCTION";

        MARK_FOLLOWING116.text = ":column-label";
        MARK_FOLLOWING116.TYPE = "FUNCTION";

        MARK_FOLLOWING117.text = ":column-movable";
        MARK_FOLLOWING117.TYPE = "FUNCTION";

        MARK_FOLLOWING118.text = ":column-pfcolor";
        MARK_FOLLOWING118.TYPE = "FUNCTION";

        MARK_FOLLOWING119.text = ":column-read-only";
        MARK_FOLLOWING119.TYPE = "FUNCTION";

        MARK_FOLLOWING120.text = ":column-resizable";
        MARK_FOLLOWING120.TYPE = "FUNCTION";

        MARK_FOLLOWING121.text = ":column-scrolling";
        MARK_FOLLOWING121.TYPE = "FUNCTION";

        MARK_FOLLOWING122.text = ":columns";
        MARK_FOLLOWING122.TYPE = "FUNCTION";

        MARK_FOLLOWING123.text = ":com-handle";
        MARK_FOLLOWING123.TYPE = "FUNCTION";

        MARK_FOLLOWING124.text = ":complete";
        MARK_FOLLOWING124.TYPE = "FUNCTION";

        MARK_FOLLOWING125.text = ":config-name";
        MARK_FOLLOWING125.TYPE = "FUNCTION";

        MARK_FOLLOWING126.text = ":connect";
        MARK_FOLLOWING126.TYPE = "FUNCTION";

        MARK_FOLLOWING127.text = ":connected";
        MARK_FOLLOWING127.TYPE = "FUNCTION";

        MARK_FOLLOWING128.text = ":context-help";
        MARK_FOLLOWING128.TYPE = "FUNCTION";

        MARK_FOLLOWING129.text = ":context-help-file";
        MARK_FOLLOWING129.TYPE = "FUNCTION";

        MARK_FOLLOWING130.text = ":context-help-id";
        MARK_FOLLOWING130.TYPE = "FUNCTION";

        MARK_FOLLOWING131.text = ":control-box";
        MARK_FOLLOWING131.TYPE = "FUNCTION";

        MARK_FOLLOWING132.text = ":convert-3d-colors";
        MARK_FOLLOWING132.TYPE = "FUNCTION";

        MARK_FOLLOWING133.text = ":convert-to-offset";
        MARK_FOLLOWING133.TYPE = "FUNCTION";

        MARK_FOLLOWING134.text = ":coverage";
        MARK_FOLLOWING134.TYPE = "FUNCTION";

        MARK_FOLLOWING135.text = ":cpcase";
        MARK_FOLLOWING135.TYPE = "FUNCTION";

        MARK_FOLLOWING136.text = ":cpcoll";
        MARK_FOLLOWING136.TYPE = "FUNCTION";

        MARK_FOLLOWING137.text = ":cplog";
        MARK_FOLLOWING137.TYPE = "FUNCTION";

        MARK_FOLLOWING138.text = ":cpprint";
        MARK_FOLLOWING138.TYPE = "FUNCTION";

        MARK_FOLLOWING139.text = ":cprcodein";
        MARK_FOLLOWING139.TYPE = "FUNCTION";

        MARK_FOLLOWING140.text = ":cprcodeout";
        MARK_FOLLOWING140.TYPE = "FUNCTION";

        MARK_FOLLOWING141.text = ":cpstream";
        MARK_FOLLOWING141.TYPE = "FUNCTION";

        MARK_FOLLOWING142.text = ":cpterm";
        MARK_FOLLOWING142.TYPE = "FUNCTION";

        MARK_FOLLOWING143.text = ":crc-value";
        MARK_FOLLOWING143.TYPE = "FUNCTION";

        MARK_FOLLOWING144.text = ":create-like";
        MARK_FOLLOWING144.TYPE = "FUNCTION";

        MARK_FOLLOWING145.text = ":create-node";
        MARK_FOLLOWING145.TYPE = "FUNCTION";

        MARK_FOLLOWING146.text = ":create-node-namespace";
        MARK_FOLLOWING146.TYPE = "FUNCTION";

        MARK_FOLLOWING147.text = ":create-on-add";
        MARK_FOLLOWING147.TYPE = "FUNCTION";

        MARK_FOLLOWING148.text = ":create-result-list-entry";
        MARK_FOLLOWING148.TYPE = "FUNCTION";

        MARK_FOLLOWING149.text = ":current-changed";
        MARK_FOLLOWING149.TYPE = "FUNCTION";

        MARK_FOLLOWING150.text = ":current-column";
        MARK_FOLLOWING150.TYPE = "FUNCTION";

        MARK_FOLLOWING151.text = ":current-environment";
        MARK_FOLLOWING151.TYPE = "FUNCTION";

        MARK_FOLLOWING152.text = ":current-iteration";
        MARK_FOLLOWING152.TYPE = "FUNCTION";

        MARK_FOLLOWING153.text = ":current-result-row";
        MARK_FOLLOWING153.TYPE = "FUNCTION";

        MARK_FOLLOWING154.text = ":current-row-modified";
        MARK_FOLLOWING154.TYPE = "FUNCTION";

        MARK_FOLLOWING155.text = ":current-window";
        MARK_FOLLOWING155.TYPE = "FUNCTION";

        MARK_FOLLOWING156.text = ":cursor-char";
        MARK_FOLLOWING156.TYPE = "FUNCTION";

        MARK_FOLLOWING157.text = ":cursor-line";
        MARK_FOLLOWING157.TYPE = "FUNCTION";

        MARK_FOLLOWING158.text = ":cursor-offset";
        MARK_FOLLOWING158.TYPE = "FUNCTION";

        MARK_FOLLOWING159.text = ":data-entry-return";
        MARK_FOLLOWING159.TYPE = "FUNCTION";

        MARK_FOLLOWING160.text = ":data-source";
        MARK_FOLLOWING160.TYPE = "FUNCTION";

        MARK_FOLLOWING161.text = ":data-type";
        MARK_FOLLOWING161.TYPE = "FUNCTION";

        MARK_FOLLOWING162.text = ":dataset";
        MARK_FOLLOWING162.TYPE = "FUNCTION";

        MARK_FOLLOWING163.text = ":date-format";
        MARK_FOLLOWING163.TYPE = "FUNCTION";

        MARK_FOLLOWING164.text = ":db-references";
        MARK_FOLLOWING164.TYPE = "FUNCTION";

        MARK_FOLLOWING165.text = ":dbname";
        MARK_FOLLOWING165.TYPE = "FUNCTION";

        MARK_FOLLOWING166.text = ":dcolor";
        MARK_FOLLOWING166.TYPE = "FUNCTION";

        MARK_FOLLOWING167.text = ":dde-error";
        MARK_FOLLOWING167.TYPE = "FUNCTION";

        MARK_FOLLOWING168.text = ":dde-id";
        MARK_FOLLOWING168.TYPE = "FUNCTION";

        MARK_FOLLOWING169.text = ":dde-item";
        MARK_FOLLOWING169.TYPE = "FUNCTION";

        MARK_FOLLOWING170.text = ":dde-name";
        MARK_FOLLOWING170.TYPE = "FUNCTION";

        MARK_FOLLOWING171.text = ":dde-topic";
        MARK_FOLLOWING171.TYPE = "FUNCTION";

        MARK_FOLLOWING172.text = ":deblank";
        MARK_FOLLOWING172.TYPE = "FUNCTION";

        MARK_FOLLOWING173.text = ":debug";
        MARK_FOLLOWING173.TYPE = "FUNCTION";

        MARK_FOLLOWING174.text = ":debug-alert";
        MARK_FOLLOWING174.TYPE = "FUNCTION";

        MARK_FOLLOWING175.text = ":decimals";
        MARK_FOLLOWING175.TYPE = "FUNCTION";

        MARK_FOLLOWING176.text = ":default";
        MARK_FOLLOWING176.TYPE = "FUNCTION";

        MARK_FOLLOWING177.text = ":default-buffer-handle";
        MARK_FOLLOWING177.TYPE = "FUNCTION";

        MARK_FOLLOWING178.text = ":default-button";
        MARK_FOLLOWING178.TYPE = "FUNCTION";

        MARK_FOLLOWING179.text = ":default-commit";
        MARK_FOLLOWING179.TYPE = "FUNCTION";

        MARK_FOLLOWING180.text = ":default-string";
        MARK_FOLLOWING180.TYPE = "FUNCTION";

        MARK_FOLLOWING181.text = ":delete";
        MARK_FOLLOWING181.TYPE = "FUNCTION";

        MARK_FOLLOWING182.text = ":delete-current-row";
        MARK_FOLLOWING182.TYPE = "FUNCTION";

        MARK_FOLLOWING183.text = ":delete-line";
        MARK_FOLLOWING183.TYPE = "FUNCTION";

        MARK_FOLLOWING184.text = ":delete-node";
        MARK_FOLLOWING184.TYPE = "FUNCTION";

        MARK_FOLLOWING185.text = ":delete-result-list-entry";
        MARK_FOLLOWING185.TYPE = "FUNCTION";

        MARK_FOLLOWING186.text = ":delete-selected-row";
        MARK_FOLLOWING186.TYPE = "FUNCTION";

        MARK_FOLLOWING187.text = ":delete-selected-rows";
        MARK_FOLLOWING187.TYPE = "FUNCTION";

        MARK_FOLLOWING188.text = ":delimiter";
        MARK_FOLLOWING188.TYPE = "FUNCTION";

        MARK_FOLLOWING189.text = ":description";
        MARK_FOLLOWING189.TYPE = "FUNCTION";

        MARK_FOLLOWING190.text = ":deselect-focused-row";
        MARK_FOLLOWING190.TYPE = "FUNCTION";

        MARK_FOLLOWING191.text = ":deselect-rows";
        MARK_FOLLOWING191.TYPE = "FUNCTION";

        MARK_FOLLOWING192.text = ":deselect-selected-row";
        MARK_FOLLOWING192.TYPE = "FUNCTION";

        MARK_FOLLOWING193.text = ":detach-data-source";
        MARK_FOLLOWING193.TYPE = "FUNCTION";

        MARK_FOLLOWING194.text = ":directory";
        MARK_FOLLOWING194.TYPE = "FUNCTION";

        MARK_FOLLOWING195.text = ":disable";
        MARK_FOLLOWING195.TYPE = "FUNCTION";

        MARK_FOLLOWING196.text = ":disable-auto-zap";
        MARK_FOLLOWING196.TYPE = "FUNCTION";

        MARK_FOLLOWING197.text = ":disable-connections";
        MARK_FOLLOWING197.TYPE = "FUNCTION";

        MARK_FOLLOWING198.text = ":disable-dump-triggers";
        MARK_FOLLOWING198.TYPE = "FUNCTION";

        MARK_FOLLOWING199.text = ":disable-load-triggers";
        MARK_FOLLOWING199.TYPE = "FUNCTION";

        MARK_FOLLOWING200.text = ":disconnect";
        MARK_FOLLOWING200.TYPE = "FUNCTION";

        MARK_FOLLOWING201.text = ":display-message";
        MARK_FOLLOWING201.TYPE = "FUNCTION";

        MARK_FOLLOWING202.text = ":display-timezone";
        MARK_FOLLOWING202.TYPE = "FUNCTION";

        MARK_FOLLOWING203.text = ":display-type";
        MARK_FOLLOWING203.TYPE = "FUNCTION";

        MARK_FOLLOWING204.text = ":down";
        MARK_FOLLOWING204.TYPE = "FUNCTION";

        MARK_FOLLOWING205.text = ":drag-enabled";
        MARK_FOLLOWING205.TYPE = "FUNCTION";

        MARK_FOLLOWING206.text = ":drop-target";
        MARK_FOLLOWING206.TYPE = "FUNCTION";

        MARK_FOLLOWING207.text = ":dump-logging-now";
        MARK_FOLLOWING207.TYPE = "FUNCTION";

        MARK_FOLLOWING208.text = ":dynamic";
        MARK_FOLLOWING208.TYPE = "FUNCTION";

        MARK_FOLLOWING209.text = ":edge-chars";
        MARK_FOLLOWING209.TYPE = "FUNCTION";

        MARK_FOLLOWING210.text = ":edge-pixels";
        MARK_FOLLOWING210.TYPE = "FUNCTION";

        MARK_FOLLOWING211.text = ":edit-can-paste";
        MARK_FOLLOWING211.TYPE = "FUNCTION";

        MARK_FOLLOWING212.text = ":edit-can-undo";
        MARK_FOLLOWING212.TYPE = "FUNCTION";

        MARK_FOLLOWING213.text = ":edit-clear";
        MARK_FOLLOWING213.TYPE = "FUNCTION";

        MARK_FOLLOWING214.text = ":edit-copy";
        MARK_FOLLOWING214.TYPE = "FUNCTION";

        MARK_FOLLOWING215.text = ":edit-cut";
        MARK_FOLLOWING215.TYPE = "FUNCTION";

        MARK_FOLLOWING216.text = ":edit-paste";
        MARK_FOLLOWING216.TYPE = "FUNCTION";

        MARK_FOLLOWING217.text = ":edit-undo";
        MARK_FOLLOWING217.TYPE = "FUNCTION";

        MARK_FOLLOWING218.text = ":empty";
        MARK_FOLLOWING218.TYPE = "FUNCTION";

        MARK_FOLLOWING219.text = ":empty-temp-table";
        MARK_FOLLOWING219.TYPE = "FUNCTION";

        MARK_FOLLOWING220.text = ":enable";
        MARK_FOLLOWING220.TYPE = "FUNCTION";

        MARK_FOLLOWING221.text = ":enable-connections";
        MARK_FOLLOWING221.TYPE = "FUNCTION";

        MARK_FOLLOWING222.text = ":enabled";
        MARK_FOLLOWING222.TYPE = "FUNCTION";

        MARK_FOLLOWING223.text = ":encoding";
        MARK_FOLLOWING223.TYPE = "FUNCTION";

        MARK_FOLLOWING224.text = ":end-file-drop";
        MARK_FOLLOWING224.TYPE = "FUNCTION";

        MARK_FOLLOWING225.text = ":end-user-prompt";
        MARK_FOLLOWING225.TYPE = "FUNCTION";

        MARK_FOLLOWING226.text = ":error-column";
        MARK_FOLLOWING226.TYPE = "FUNCTION";

        MARK_FOLLOWING227.text = ":error-object-detail";
        MARK_FOLLOWING227.TYPE = "FUNCTION";

        MARK_FOLLOWING228.text = ":error-row";
        MARK_FOLLOWING228.TYPE = "FUNCTION";

        MARK_FOLLOWING229.text = ":error-string";
        MARK_FOLLOWING229.TYPE = "FUNCTION";

        MARK_FOLLOWING230.text = ":event-procedure";
        MARK_FOLLOWING230.TYPE = "FUNCTION";

        MARK_FOLLOWING231.text = ":event-procedure-context";
        MARK_FOLLOWING231.TYPE = "FUNCTION";

        MARK_FOLLOWING232.text = ":event-type";
        MARK_FOLLOWING232.TYPE = "FUNCTION";

        MARK_FOLLOWING233.text = ":exclusive-id";
        MARK_FOLLOWING233.TYPE = "FUNCTION";

        MARK_FOLLOWING234.text = ":execution-log";
        MARK_FOLLOWING234.TYPE = "FUNCTION";

        MARK_FOLLOWING235.text = ":expand";
        MARK_FOLLOWING235.TYPE = "FUNCTION";

        MARK_FOLLOWING236.text = ":expandable";
        MARK_FOLLOWING236.TYPE = "FUNCTION";

        MARK_FOLLOWING237.text = ":export";
        MARK_FOLLOWING237.TYPE = "FUNCTION";

        MARK_FOLLOWING238.text = ":extent";
        MARK_FOLLOWING238.TYPE = "FUNCTION";

        MARK_FOLLOWING239.text = ":fetch-selected-row";
        MARK_FOLLOWING239.TYPE = "FUNCTION";

        MARK_FOLLOWING240.text = ":fgcolor";
        MARK_FOLLOWING240.TYPE = "FUNCTION";

        MARK_FOLLOWING241.text = ":file-create-date";
        MARK_FOLLOWING241.TYPE = "FUNCTION";

        MARK_FOLLOWING242.text = ":file-create-time";
        MARK_FOLLOWING242.TYPE = "FUNCTION";

        MARK_FOLLOWING243.text = ":file-mod-date";
        MARK_FOLLOWING243.TYPE = "FUNCTION";

        MARK_FOLLOWING244.text = ":file-mod-time";
        MARK_FOLLOWING244.TYPE = "FUNCTION";

        MARK_FOLLOWING245.text = ":file-name";
        MARK_FOLLOWING245.TYPE = "FUNCTION";

        MARK_FOLLOWING246.text = ":file-offset";
        MARK_FOLLOWING246.TYPE = "FUNCTION";

        MARK_FOLLOWING247.text = ":file-size";
        MARK_FOLLOWING247.TYPE = "FUNCTION";

        MARK_FOLLOWING248.text = ":file-type";
        MARK_FOLLOWING248.TYPE = "FUNCTION";

        MARK_FOLLOWING249.text = ":fill";
        MARK_FOLLOWING249.TYPE = "FUNCTION";

        MARK_FOLLOWING250.text = ":fill-mode";
        MARK_FOLLOWING250.TYPE = "FUNCTION";

        MARK_FOLLOWING251.text = ":filled";
        MARK_FOLLOWING251.TYPE = "FUNCTION";

        MARK_FOLLOWING252.text = ":find-by-rowid";
        MARK_FOLLOWING252.TYPE = "FUNCTION";

        MARK_FOLLOWING253.text = ":find-current";
        MARK_FOLLOWING253.TYPE = "FUNCTION";

        MARK_FOLLOWING254.text = ":find-first";
        MARK_FOLLOWING254.TYPE = "FUNCTION";

        MARK_FOLLOWING255.text = ":find-last";
        MARK_FOLLOWING255.TYPE = "FUNCTION";

        MARK_FOLLOWING256.text = ":find-unique";
        MARK_FOLLOWING256.TYPE = "FUNCTION";

        MARK_FOLLOWING257.text = ":first-async-request";
        MARK_FOLLOWING257.TYPE = "FUNCTION";

        MARK_FOLLOWING258.text = ":first-buffer";
        MARK_FOLLOWING258.TYPE = "FUNCTION";

        MARK_FOLLOWING259.text = ":first-child";
        MARK_FOLLOWING259.TYPE = "FUNCTION";

        MARK_FOLLOWING260.text = ":first-column";
        MARK_FOLLOWING260.TYPE = "FUNCTION";

        MARK_FOLLOWING261.text = ":first-data-source";
        MARK_FOLLOWING261.TYPE = "FUNCTION";

        MARK_FOLLOWING262.text = ":first-dataset";
        MARK_FOLLOWING262.TYPE = "FUNCTION";

        MARK_FOLLOWING263.text = ":first-procedure";
        MARK_FOLLOWING263.TYPE = "FUNCTION";

        MARK_FOLLOWING264.text = ":first-query";
        MARK_FOLLOWING264.TYPE = "FUNCTION";

        MARK_FOLLOWING265.text = ":first-server";
        MARK_FOLLOWING265.TYPE = "FUNCTION";

        MARK_FOLLOWING266.text = ":first-server-socket";
        MARK_FOLLOWING266.TYPE = "FUNCTION";

        MARK_FOLLOWING267.text = ":first-socket";
        MARK_FOLLOWING267.TYPE = "FUNCTION";

        MARK_FOLLOWING268.text = ":first-tab-item";
        MARK_FOLLOWING268.TYPE = "FUNCTION";

        MARK_FOLLOWING269.text = ":fit-last-column";
        MARK_FOLLOWING269.TYPE = "FUNCTION";

        MARK_FOLLOWING270.text = ":flat-button";
        MARK_FOLLOWING270.TYPE = "FUNCTION";

        MARK_FOLLOWING271.text = ":focused-row";
        MARK_FOLLOWING271.TYPE = "FUNCTION";

        MARK_FOLLOWING272.text = ":focused-row-selected";
        MARK_FOLLOWING272.TYPE = "FUNCTION";

        MARK_FOLLOWING273.text = ":font";
        MARK_FOLLOWING273.TYPE = "FUNCTION";

        MARK_FOLLOWING274.text = ":font-based-layout";
        MARK_FOLLOWING274.TYPE = "FUNCTION";

        MARK_FOLLOWING275.text = ":foreground";
        MARK_FOLLOWING275.TYPE = "FUNCTION";

        MARK_FOLLOWING276.text = ":form-input";
        MARK_FOLLOWING276.TYPE = "FUNCTION";

        MARK_FOLLOWING277.text = ":format";
        MARK_FOLLOWING277.TYPE = "FUNCTION";

        MARK_FOLLOWING278.text = ":forward-only";
        MARK_FOLLOWING278.TYPE = "FUNCTION";

        MARK_FOLLOWING279.text = ":frame";
        MARK_FOLLOWING279.TYPE = "FUNCTION";

        MARK_FOLLOWING280.text = ":frame-col";
        MARK_FOLLOWING280.TYPE = "FUNCTION";

        MARK_FOLLOWING281.text = ":frame-name";
        MARK_FOLLOWING281.TYPE = "FUNCTION";

        MARK_FOLLOWING282.text = ":frame-row";
        MARK_FOLLOWING282.TYPE = "FUNCTION";

        MARK_FOLLOWING283.text = ":frame-spacing";
        MARK_FOLLOWING283.TYPE = "FUNCTION";

        MARK_FOLLOWING284.text = ":frame-x";
        MARK_FOLLOWING284.TYPE = "FUNCTION";

        MARK_FOLLOWING285.text = ":frame-y";
        MARK_FOLLOWING285.TYPE = "FUNCTION";

        MARK_FOLLOWING286.text = ":frequency";
        MARK_FOLLOWING286.TYPE = "FUNCTION";

        MARK_FOLLOWING287.text = ":full-height-chars";
        MARK_FOLLOWING287.TYPE = "FUNCTION";

        MARK_FOLLOWING288.text = ":full-height-pixels";
        MARK_FOLLOWING288.TYPE = "FUNCTION";

        MARK_FOLLOWING289.text = ":full-pathname";
        MARK_FOLLOWING289.TYPE = "FUNCTION";

        MARK_FOLLOWING290.text = ":full-width-chars";
        MARK_FOLLOWING290.TYPE = "FUNCTION";

        MARK_FOLLOWING291.text = ":full-width-pixels";
        MARK_FOLLOWING291.TYPE = "FUNCTION";

        MARK_FOLLOWING292.text = ":function";
        MARK_FOLLOWING292.TYPE = "FUNCTION";

        MARK_FOLLOWING293.text = ":get-attribute";
        MARK_FOLLOWING293.TYPE = "FUNCTION";

        MARK_FOLLOWING294.text = ":get-attribute-node";
        MARK_FOLLOWING294.TYPE = "FUNCTION";

        MARK_FOLLOWING295.text = ":get-blue-value";
        MARK_FOLLOWING295.TYPE = "FUNCTION";

        MARK_FOLLOWING296.text = ":get-browse-column";
        MARK_FOLLOWING296.TYPE = "FUNCTION";

        MARK_FOLLOWING297.text = ":get-buffer-handle";
        MARK_FOLLOWING297.TYPE = "FUNCTION";

        MARK_FOLLOWING298.text = ":get-bytes-available";
        MARK_FOLLOWING298.TYPE = "FUNCTION";

        MARK_FOLLOWING299.text = ":get-cgi-list";
        MARK_FOLLOWING299.TYPE = "FUNCTION";

        MARK_FOLLOWING300.text = ":get-cgi-value";
        MARK_FOLLOWING300.TYPE = "FUNCTION";

        MARK_FOLLOWING301.text = ":get-changes";
        MARK_FOLLOWING301.TYPE = "FUNCTION";

        MARK_FOLLOWING302.text = ":get-child";
        MARK_FOLLOWING302.TYPE = "FUNCTION";

        MARK_FOLLOWING303.text = ":get-child-relation";
        MARK_FOLLOWING303.TYPE = "FUNCTION";

        MARK_FOLLOWING304.text = ":get-config-value";
        MARK_FOLLOWING304.TYPE = "FUNCTION";

        MARK_FOLLOWING305.text = ":get-current";
        MARK_FOLLOWING305.TYPE = "FUNCTION";

        MARK_FOLLOWING306.text = ":get-document-element";
        MARK_FOLLOWING306.TYPE = "FUNCTION";

        MARK_FOLLOWING307.text = ":get-dropped-file";
        MARK_FOLLOWING307.TYPE = "FUNCTION";

        MARK_FOLLOWING308.text = ":get-dynamic";
        MARK_FOLLOWING308.TYPE = "FUNCTION";

        MARK_FOLLOWING309.text = ":get-first";
        MARK_FOLLOWING309.TYPE = "FUNCTION";

        MARK_FOLLOWING310.text = ":get-green-value";
        MARK_FOLLOWING310.TYPE = "FUNCTION";

        MARK_FOLLOWING311.text = ":get-iteration";
        MARK_FOLLOWING311.TYPE = "FUNCTION";

        MARK_FOLLOWING312.text = ":get-last";
        MARK_FOLLOWING312.TYPE = "FUNCTION";

        MARK_FOLLOWING313.text = ":get-message";
        MARK_FOLLOWING313.TYPE = "FUNCTION";

        MARK_FOLLOWING314.text = ":get-next";
        MARK_FOLLOWING314.TYPE = "FUNCTION";

        MARK_FOLLOWING315.text = ":get-number";
        MARK_FOLLOWING315.TYPE = "FUNCTION";

        MARK_FOLLOWING316.text = ":get-parent";
        MARK_FOLLOWING316.TYPE = "FUNCTION";

        MARK_FOLLOWING317.text = ":get-prev";
        MARK_FOLLOWING317.TYPE = "FUNCTION";

        MARK_FOLLOWING318.text = ":get-printers";
        MARK_FOLLOWING318.TYPE = "FUNCTION";

        MARK_FOLLOWING319.text = ":get-red-value";
        MARK_FOLLOWING319.TYPE = "FUNCTION";

        MARK_FOLLOWING320.text = ":get-repositioned-row";
        MARK_FOLLOWING320.TYPE = "FUNCTION";

        MARK_FOLLOWING321.text = ":get-rgb-value";
        MARK_FOLLOWING321.TYPE = "FUNCTION";

        MARK_FOLLOWING322.text = ":get-selected-widget";
        MARK_FOLLOWING322.TYPE = "FUNCTION";

        MARK_FOLLOWING323.text = ":get-signature";
        MARK_FOLLOWING323.TYPE = "FUNCTION";

        MARK_FOLLOWING324.text = ":get-socket-option";
        MARK_FOLLOWING324.TYPE = "FUNCTION";

        MARK_FOLLOWING325.text = ":get-tab-item";
        MARK_FOLLOWING325.TYPE = "FUNCTION";

        MARK_FOLLOWING326.text = ":get-text-height-chars";
        MARK_FOLLOWING326.TYPE = "FUNCTION";

        MARK_FOLLOWING327.text = ":get-text-height-pixels";
        MARK_FOLLOWING327.TYPE = "FUNCTION";

        MARK_FOLLOWING328.text = ":get-text-width-chars";
        MARK_FOLLOWING328.TYPE = "FUNCTION";

        MARK_FOLLOWING329.text = ":get-text-width-pixels";
        MARK_FOLLOWING329.TYPE = "FUNCTION";

        MARK_FOLLOWING330.text = ":get-wait-state";
        MARK_FOLLOWING330.TYPE = "FUNCTION";

        MARK_FOLLOWING331.text = ":graphic-edge";
        MARK_FOLLOWING331.TYPE = "FUNCTION";

        MARK_FOLLOWING332.text = ":grid-factor-horizontal";
        MARK_FOLLOWING332.TYPE = "FUNCTION";

        MARK_FOLLOWING333.text = ":grid-factor-vertical";
        MARK_FOLLOWING333.TYPE = "FUNCTION";

        MARK_FOLLOWING334.text = ":grid-snap";
        MARK_FOLLOWING334.TYPE = "FUNCTION";

        MARK_FOLLOWING335.text = ":grid-unit-height-chars";
        MARK_FOLLOWING335.TYPE = "FUNCTION";

        MARK_FOLLOWING336.text = ":grid-unit-height-pixels";
        MARK_FOLLOWING336.TYPE = "FUNCTION";

        MARK_FOLLOWING337.text = ":grid-unit-width-chars";
        MARK_FOLLOWING337.TYPE = "FUNCTION";

        MARK_FOLLOWING338.text = ":grid-unit-width-pixels";
        MARK_FOLLOWING338.TYPE = "FUNCTION";

        MARK_FOLLOWING339.text = ":grid-visible";
        MARK_FOLLOWING339.TYPE = "FUNCTION";

        MARK_FOLLOWING340.text = ":handle";
        MARK_FOLLOWING340.TYPE = "FUNCTION";

        MARK_FOLLOWING341.text = ":handler";
        MARK_FOLLOWING341.TYPE = "FUNCTION";

        MARK_FOLLOWING342.text = ":has-lobs";
        MARK_FOLLOWING342.TYPE = "FUNCTION";

        MARK_FOLLOWING343.text = ":has-records";
        MARK_FOLLOWING343.TYPE = "FUNCTION";

        MARK_FOLLOWING344.text = ":height-chars";
        MARK_FOLLOWING344.TYPE = "FUNCTION";

        MARK_FOLLOWING345.text = ":height-pixels";
        MARK_FOLLOWING345.TYPE = "FUNCTION";

        MARK_FOLLOWING346.text = ":hidden";
        MARK_FOLLOWING346.TYPE = "FUNCTION";

        MARK_FOLLOWING347.text = ":horizontal";
        MARK_FOLLOWING347.TYPE = "FUNCTION";

        MARK_FOLLOWING348.text = ":html-charset";
        MARK_FOLLOWING348.TYPE = "FUNCTION";

        MARK_FOLLOWING349.text = ":html-end-of-line";
        MARK_FOLLOWING349.TYPE = "FUNCTION";

        MARK_FOLLOWING350.text = ":html-end-of-page";
        MARK_FOLLOWING350.TYPE = "FUNCTION";

        MARK_FOLLOWING351.text = ":html-frame-begin";
        MARK_FOLLOWING351.TYPE = "FUNCTION";

        MARK_FOLLOWING352.text = ":html-frame-end";
        MARK_FOLLOWING352.TYPE = "FUNCTION";

        MARK_FOLLOWING353.text = ":html-header-begin";
        MARK_FOLLOWING353.TYPE = "FUNCTION";

        MARK_FOLLOWING354.text = ":html-header-end";
        MARK_FOLLOWING354.TYPE = "FUNCTION";

        MARK_FOLLOWING355.text = ":html-title-begin";
        MARK_FOLLOWING355.TYPE = "FUNCTION";

        MARK_FOLLOWING356.text = ":html-title-end";
        MARK_FOLLOWING356.TYPE = "FUNCTION";

        MARK_FOLLOWING357.text = ":hwnd";
        MARK_FOLLOWING357.TYPE = "FUNCTION";

        MARK_FOLLOWING358.text = ":icfparameter";
        MARK_FOLLOWING358.TYPE = "FUNCTION";

        MARK_FOLLOWING359.text = ":icon";
        MARK_FOLLOWING359.TYPE = "FUNCTION";

        MARK_FOLLOWING360.text = ":image";
        MARK_FOLLOWING360.TYPE = "FUNCTION";

        MARK_FOLLOWING361.text = ":image-down";
        MARK_FOLLOWING361.TYPE = "FUNCTION";

        MARK_FOLLOWING362.text = ":image-insensitive";
        MARK_FOLLOWING362.TYPE = "FUNCTION";

        MARK_FOLLOWING363.text = ":image-up";
        MARK_FOLLOWING363.TYPE = "FUNCTION";

        MARK_FOLLOWING364.text = ":immediate-display";
        MARK_FOLLOWING364.TYPE = "FUNCTION";

        MARK_FOLLOWING365.text = ":import-node";
        MARK_FOLLOWING365.TYPE = "FUNCTION";

        MARK_FOLLOWING366.text = ":in-handle";
        MARK_FOLLOWING366.TYPE = "FUNCTION";

        MARK_FOLLOWING367.text = ":increment-exclusive-id";
        MARK_FOLLOWING367.TYPE = "FUNCTION";

        MARK_FOLLOWING368.text = ":index";
        MARK_FOLLOWING368.TYPE = "FUNCTION";

        MARK_FOLLOWING369.text = ":index-information";
        MARK_FOLLOWING369.TYPE = "FUNCTION";

        MARK_FOLLOWING370.text = ":initial";
        MARK_FOLLOWING370.TYPE = "FUNCTION";

        MARK_FOLLOWING371.text = ":initialize-document-type";
        MARK_FOLLOWING371.TYPE = "FUNCTION";

        MARK_FOLLOWING372.text = ":initiate";
        MARK_FOLLOWING372.TYPE = "FUNCTION";

        MARK_FOLLOWING373.text = ":inner-chars";
        MARK_FOLLOWING373.TYPE = "FUNCTION";

        MARK_FOLLOWING374.text = ":inner-lines";
        MARK_FOLLOWING374.TYPE = "FUNCTION";

        MARK_FOLLOWING375.text = ":input-value";
        MARK_FOLLOWING375.TYPE = "FUNCTION";

        MARK_FOLLOWING376.text = ":insert";
        MARK_FOLLOWING376.TYPE = "FUNCTION";

        MARK_FOLLOWING377.text = ":insert-backtab";
        MARK_FOLLOWING377.TYPE = "FUNCTION";

        MARK_FOLLOWING378.text = ":insert-before";
        MARK_FOLLOWING378.TYPE = "FUNCTION";

        MARK_FOLLOWING379.text = ":insert-file";
        MARK_FOLLOWING379.TYPE = "FUNCTION";

        MARK_FOLLOWING380.text = ":insert-row";
        MARK_FOLLOWING380.TYPE = "FUNCTION";

        MARK_FOLLOWING381.text = ":insert-string";
        MARK_FOLLOWING381.TYPE = "FUNCTION";

        MARK_FOLLOWING382.text = ":insert-tab";
        MARK_FOLLOWING382.TYPE = "FUNCTION";

        MARK_FOLLOWING383.text = ":instantiating-procedure";
        MARK_FOLLOWING383.TYPE = "FUNCTION";

        MARK_FOLLOWING384.text = ":internal-entries";
        MARK_FOLLOWING384.TYPE = "FUNCTION";

        MARK_FOLLOWING385.text = ":invoke";
        MARK_FOLLOWING385.TYPE = "FUNCTION";

        MARK_FOLLOWING386.text = ":is-open";
        MARK_FOLLOWING386.TYPE = "FUNCTION";

        MARK_FOLLOWING387.text = ":is-parameter-set";
        MARK_FOLLOWING387.TYPE = "FUNCTION";

        MARK_FOLLOWING388.text = ":is-row-selected";
        MARK_FOLLOWING388.TYPE = "FUNCTION";

        MARK_FOLLOWING389.text = ":is-selected";
        MARK_FOLLOWING389.TYPE = "FUNCTION";

        MARK_FOLLOWING390.text = ":is-xml";
        MARK_FOLLOWING390.TYPE = "FUNCTION";

        MARK_FOLLOWING391.text = ":items-per-row";
        MARK_FOLLOWING391.TYPE = "FUNCTION";

        MARK_FOLLOWING392.text = ":keep-connection-open";
        MARK_FOLLOWING392.TYPE = "FUNCTION";

        MARK_FOLLOWING393.text = ":keep-frame-z-order";
        MARK_FOLLOWING393.TYPE = "FUNCTION";

        MARK_FOLLOWING394.text = ":keep-security-cache";
        MARK_FOLLOWING394.TYPE = "FUNCTION";

        MARK_FOLLOWING395.text = ":key";
        MARK_FOLLOWING395.TYPE = "FUNCTION";

        MARK_FOLLOWING396.text = ":label";
        MARK_FOLLOWING396.TYPE = "FUNCTION";

        MARK_FOLLOWING397.text = ":label-bgcolor";
        MARK_FOLLOWING397.TYPE = "FUNCTION";

        MARK_FOLLOWING398.text = ":label-dcolor";
        MARK_FOLLOWING398.TYPE = "FUNCTION";

        MARK_FOLLOWING399.text = ":label-fgcolor";
        MARK_FOLLOWING399.TYPE = "FUNCTION";

        MARK_FOLLOWING400.text = ":label-font";
        MARK_FOLLOWING400.TYPE = "FUNCTION";

        MARK_FOLLOWING401.text = ":labels";
        MARK_FOLLOWING401.TYPE = "FUNCTION";

        MARK_FOLLOWING402.text = ":languages";
        MARK_FOLLOWING402.TYPE = "FUNCTION";

        MARK_FOLLOWING403.text = ":large";
        MARK_FOLLOWING403.TYPE = "FUNCTION";

        MARK_FOLLOWING404.text = ":large-to-small";
        MARK_FOLLOWING404.TYPE = "FUNCTION";

        MARK_FOLLOWING405.text = ":last-async-request";
        MARK_FOLLOWING405.TYPE = "FUNCTION";

        MARK_FOLLOWING406.text = ":last-child";
        MARK_FOLLOWING406.TYPE = "FUNCTION";

        MARK_FOLLOWING407.text = ":last-procedure";
        MARK_FOLLOWING407.TYPE = "FUNCTION";

        MARK_FOLLOWING408.text = ":last-server";
        MARK_FOLLOWING408.TYPE = "FUNCTION";

        MARK_FOLLOWING409.text = ":last-server-socket";
        MARK_FOLLOWING409.TYPE = "FUNCTION";

        MARK_FOLLOWING410.text = ":last-socket";
        MARK_FOLLOWING410.TYPE = "FUNCTION";

        MARK_FOLLOWING411.text = ":last-tab-item";
        MARK_FOLLOWING411.TYPE = "FUNCTION";

        MARK_FOLLOWING412.text = ":line";
        MARK_FOLLOWING412.TYPE = "FUNCTION";

        MARK_FOLLOWING413.text = ":list-item-pairs";
        MARK_FOLLOWING413.TYPE = "FUNCTION";

        MARK_FOLLOWING414.text = ":list-items";
        MARK_FOLLOWING414.TYPE = "FUNCTION";

        MARK_FOLLOWING415.text = ":listings";
        MARK_FOLLOWING415.TYPE = "FUNCTION";

        MARK_FOLLOWING416.text = ":literal-question";
        MARK_FOLLOWING416.TYPE = "FUNCTION";

        MARK_FOLLOWING417.text = ":load";
        MARK_FOLLOWING417.TYPE = "FUNCTION";

        MARK_FOLLOWING418.text = ":load-icon";
        MARK_FOLLOWING418.TYPE = "FUNCTION";

        MARK_FOLLOWING419.text = ":load-image";
        MARK_FOLLOWING419.TYPE = "FUNCTION";

        MARK_FOLLOWING420.text = ":load-image-down";
        MARK_FOLLOWING420.TYPE = "FUNCTION";

        MARK_FOLLOWING421.text = ":load-image-insensitive";
        MARK_FOLLOWING421.TYPE = "FUNCTION";

        MARK_FOLLOWING422.text = ":load-image-up";
        MARK_FOLLOWING422.TYPE = "FUNCTION";

        MARK_FOLLOWING423.text = ":load-mouse-pointer";
        MARK_FOLLOWING423.TYPE = "FUNCTION";

        MARK_FOLLOWING424.text = ":load-small-icon";
        MARK_FOLLOWING424.TYPE = "FUNCTION";

        MARK_FOLLOWING425.text = ":local-host";
        MARK_FOLLOWING425.TYPE = "FUNCTION";

        MARK_FOLLOWING426.text = ":local-name";
        MARK_FOLLOWING426.TYPE = "FUNCTION";

        MARK_FOLLOWING427.text = ":local-port";
        MARK_FOLLOWING427.TYPE = "FUNCTION";

        MARK_FOLLOWING428.text = ":locator-column-number";
        MARK_FOLLOWING428.TYPE = "FUNCTION";

        MARK_FOLLOWING429.text = ":locator-line-number";
        MARK_FOLLOWING429.TYPE = "FUNCTION";

        MARK_FOLLOWING430.text = ":locator-public-id";
        MARK_FOLLOWING430.TYPE = "FUNCTION";

        MARK_FOLLOWING431.text = ":locator-system-id";
        MARK_FOLLOWING431.TYPE = "FUNCTION";

        MARK_FOLLOWING432.text = ":locator-type";
        MARK_FOLLOWING432.TYPE = "FUNCTION";

        MARK_FOLLOWING433.text = ":locked";
        MARK_FOLLOWING433.TYPE = "FUNCTION";

        MARK_FOLLOWING434.text = ":log-id";
        MARK_FOLLOWING434.TYPE = "FUNCTION";

        MARK_FOLLOWING435.text = ":longchar-to-node-value";
        MARK_FOLLOWING435.TYPE = "FUNCTION";

        MARK_FOLLOWING436.text = ":lookup";
        MARK_FOLLOWING436.TYPE = "FUNCTION";

        MARK_FOLLOWING437.text = ":mandatory";
        MARK_FOLLOWING437.TYPE = "FUNCTION";

        MARK_FOLLOWING438.text = ":manual-highlight";
        MARK_FOLLOWING438.TYPE = "FUNCTION";

        MARK_FOLLOWING439.text = ":margin-height-chars";
        MARK_FOLLOWING439.TYPE = "FUNCTION";

        MARK_FOLLOWING440.text = ":margin-height-pixels";
        MARK_FOLLOWING440.TYPE = "FUNCTION";

        MARK_FOLLOWING441.text = ":margin-width-chars";
        MARK_FOLLOWING441.TYPE = "FUNCTION";

        MARK_FOLLOWING442.text = ":margin-width-pixels";
        MARK_FOLLOWING442.TYPE = "FUNCTION";

        MARK_FOLLOWING443.text = ":max-button";
        MARK_FOLLOWING443.TYPE = "FUNCTION";

        MARK_FOLLOWING444.text = ":max-chars";
        MARK_FOLLOWING444.TYPE = "FUNCTION";

        MARK_FOLLOWING445.text = ":max-data-guess";
        MARK_FOLLOWING445.TYPE = "FUNCTION";

        MARK_FOLLOWING446.text = ":max-height-chars";
        MARK_FOLLOWING446.TYPE = "FUNCTION";

        MARK_FOLLOWING447.text = ":max-height-pixels";
        MARK_FOLLOWING447.TYPE = "FUNCTION";

        MARK_FOLLOWING448.text = ":max-value";
        MARK_FOLLOWING448.TYPE = "FUNCTION";

        MARK_FOLLOWING449.text = ":max-width-chars";
        MARK_FOLLOWING449.TYPE = "FUNCTION";

        MARK_FOLLOWING450.text = ":max-width-pixels";
        MARK_FOLLOWING450.TYPE = "FUNCTION";

        MARK_FOLLOWING451.text = ":md5-value";
        MARK_FOLLOWING451.TYPE = "FUNCTION";

        MARK_FOLLOWING452.text = ":memptr-to-node-value";
        MARK_FOLLOWING452.TYPE = "FUNCTION";

        MARK_FOLLOWING453.text = ":menu-bar";
        MARK_FOLLOWING453.TYPE = "FUNCTION";

        MARK_FOLLOWING454.text = ":menu-key";
        MARK_FOLLOWING454.TYPE = "FUNCTION";

        MARK_FOLLOWING455.text = ":menu-mouse";
        MARK_FOLLOWING455.TYPE = "FUNCTION";

        MARK_FOLLOWING456.text = ":merge-changes";
        MARK_FOLLOWING456.TYPE = "FUNCTION";

        MARK_FOLLOWING457.text = ":merge-row-changes";
        MARK_FOLLOWING457.TYPE = "FUNCTION";

        MARK_FOLLOWING458.text = ":message-area";
        MARK_FOLLOWING458.TYPE = "FUNCTION";

        MARK_FOLLOWING459.text = ":message-area-font";
        MARK_FOLLOWING459.TYPE = "FUNCTION";

        MARK_FOLLOWING460.text = ":min-button";
        MARK_FOLLOWING460.TYPE = "FUNCTION";

        MARK_FOLLOWING461.text = ":min-column-width-chars";
        MARK_FOLLOWING461.TYPE = "FUNCTION";

        MARK_FOLLOWING462.text = ":min-column-width-pixels";
        MARK_FOLLOWING462.TYPE = "FUNCTION";

        MARK_FOLLOWING463.text = ":min-height-chars";
        MARK_FOLLOWING463.TYPE = "FUNCTION";

        MARK_FOLLOWING464.text = ":min-height-pixels";
        MARK_FOLLOWING464.TYPE = "FUNCTION";

        MARK_FOLLOWING465.text = ":min-schema-marshall";
        MARK_FOLLOWING465.TYPE = "FUNCTION";

        MARK_FOLLOWING466.text = ":min-value";
        MARK_FOLLOWING466.TYPE = "FUNCTION";

        MARK_FOLLOWING467.text = ":min-width-chars";
        MARK_FOLLOWING467.TYPE = "FUNCTION";

        MARK_FOLLOWING468.text = ":min-width-pixels";
        MARK_FOLLOWING468.TYPE = "FUNCTION";

        MARK_FOLLOWING469.text = ":modified";
        MARK_FOLLOWING469.TYPE = "FUNCTION";

        MARK_FOLLOWING470.text = ":mouse-pointer";
        MARK_FOLLOWING470.TYPE = "FUNCTION";

        MARK_FOLLOWING471.text = ":movable";
        MARK_FOLLOWING471.TYPE = "FUNCTION";

        MARK_FOLLOWING472.text = ":move-after-tab-item";
        MARK_FOLLOWING472.TYPE = "FUNCTION";

        MARK_FOLLOWING473.text = ":move-before-tab-item";
        MARK_FOLLOWING473.TYPE = "FUNCTION";

        MARK_FOLLOWING474.text = ":move-column";
        MARK_FOLLOWING474.TYPE = "FUNCTION";

        MARK_FOLLOWING475.text = ":move-to-bottom";
        MARK_FOLLOWING475.TYPE = "FUNCTION";

        MARK_FOLLOWING476.text = ":move-to-eof";
        MARK_FOLLOWING476.TYPE = "FUNCTION";

        MARK_FOLLOWING477.text = ":move-to-top";
        MARK_FOLLOWING477.TYPE = "FUNCTION";

        MARK_FOLLOWING478.text = ":multiple";
        MARK_FOLLOWING478.TYPE = "FUNCTION";

        MARK_FOLLOWING479.text = ":multitasking-interval";
        MARK_FOLLOWING479.TYPE = "FUNCTION";

        MARK_FOLLOWING480.text = ":name";
        MARK_FOLLOWING480.TYPE = "FUNCTION";

        MARK_FOLLOWING481.text = ":namespace-prefix";
        MARK_FOLLOWING481.TYPE = "FUNCTION";

        MARK_FOLLOWING482.text = ":namespace-uri";
        MARK_FOLLOWING482.TYPE = "FUNCTION";

        MARK_FOLLOWING483.text = ":needs-appserver-prompt";
        MARK_FOLLOWING483.TYPE = "FUNCTION";

        MARK_FOLLOWING484.text = ":needs-prompt";
        MARK_FOLLOWING484.TYPE = "FUNCTION";

        MARK_FOLLOWING485.text = ":new";
        MARK_FOLLOWING485.TYPE = "FUNCTION";

        MARK_FOLLOWING486.text = ":new-row";
        MARK_FOLLOWING486.TYPE = "FUNCTION";

        MARK_FOLLOWING487.text = ":next-column";
        MARK_FOLLOWING487.TYPE = "FUNCTION";

        MARK_FOLLOWING488.text = ":next-sibling";
        MARK_FOLLOWING488.TYPE = "FUNCTION";

        MARK_FOLLOWING489.text = ":next-tab-item";
        MARK_FOLLOWING489.TYPE = "FUNCTION";

        MARK_FOLLOWING490.text = ":no-current-value";
        MARK_FOLLOWING490.TYPE = "FUNCTION";

        MARK_FOLLOWING491.text = ":no-empty-space";
        MARK_FOLLOWING491.TYPE = "FUNCTION";

        MARK_FOLLOWING492.text = ":no-focus";
        MARK_FOLLOWING492.TYPE = "FUNCTION";

        MARK_FOLLOWING493.text = ":no-schema-marshall";
        MARK_FOLLOWING493.TYPE = "FUNCTION";

        MARK_FOLLOWING494.text = ":no-validate";
        MARK_FOLLOWING494.TYPE = "FUNCTION";

        MARK_FOLLOWING495.text = ":node-type";
        MARK_FOLLOWING495.TYPE = "FUNCTION";

        MARK_FOLLOWING496.text = ":node-value";
        MARK_FOLLOWING496.TYPE = "FUNCTION";

        MARK_FOLLOWING497.text = ":node-value-to-longchar";
        MARK_FOLLOWING497.TYPE = "FUNCTION";

        MARK_FOLLOWING498.text = ":node-value-to-memptr";
        MARK_FOLLOWING498.TYPE = "FUNCTION";

        MARK_FOLLOWING499.text = ":normalize";
        MARK_FOLLOWING499.TYPE = "FUNCTION";

        MARK_FOLLOWING500.text = ":num-buffers";
        MARK_FOLLOWING500.TYPE = "FUNCTION";

        MARK_FOLLOWING501.text = ":num-buttons";
        MARK_FOLLOWING501.TYPE = "FUNCTION";

        MARK_FOLLOWING502.text = ":num-child-relations";
        MARK_FOLLOWING502.TYPE = "FUNCTION";

        MARK_FOLLOWING503.text = ":num-children";
        MARK_FOLLOWING503.TYPE = "FUNCTION";

        MARK_FOLLOWING504.text = ":num-columns";
        MARK_FOLLOWING504.TYPE = "FUNCTION";

        MARK_FOLLOWING505.text = ":num-dropped-files";
        MARK_FOLLOWING505.TYPE = "FUNCTION";

        MARK_FOLLOWING506.text = ":num-entries";
        MARK_FOLLOWING506.TYPE = "FUNCTION";

        MARK_FOLLOWING507.text = ":num-fields";
        MARK_FOLLOWING507.TYPE = "FUNCTION";

        MARK_FOLLOWING508.text = ":num-formats";
        MARK_FOLLOWING508.TYPE = "FUNCTION";

        MARK_FOLLOWING509.text = ":num-items";
        MARK_FOLLOWING509.TYPE = "FUNCTION";

        MARK_FOLLOWING510.text = ":num-iterations";
        MARK_FOLLOWING510.TYPE = "FUNCTION";

        MARK_FOLLOWING511.text = ":num-lines";
        MARK_FOLLOWING511.TYPE = "FUNCTION";

        MARK_FOLLOWING512.text = ":num-locked-columns";
        MARK_FOLLOWING512.TYPE = "FUNCTION";

        MARK_FOLLOWING513.text = ":num-messages";
        MARK_FOLLOWING513.TYPE = "FUNCTION";

        MARK_FOLLOWING514.text = ":num-parameters";
        MARK_FOLLOWING514.TYPE = "FUNCTION";

        MARK_FOLLOWING515.text = ":num-replaced";
        MARK_FOLLOWING515.TYPE = "FUNCTION";

        MARK_FOLLOWING516.text = ":num-results";
        MARK_FOLLOWING516.TYPE = "FUNCTION";

        MARK_FOLLOWING517.text = ":num-selected-rows";
        MARK_FOLLOWING517.TYPE = "FUNCTION";

        MARK_FOLLOWING518.text = ":num-selected-widgets";
        MARK_FOLLOWING518.TYPE = "FUNCTION";

        MARK_FOLLOWING519.text = ":num-tabs";
        MARK_FOLLOWING519.TYPE = "FUNCTION";

        MARK_FOLLOWING520.text = ":num-to-retain";
        MARK_FOLLOWING520.TYPE = "FUNCTION";

        MARK_FOLLOWING521.text = ":num-visible-columns";
        MARK_FOLLOWING521.TYPE = "FUNCTION";

        MARK_FOLLOWING522.text = ":numeric-decimal-point";
        MARK_FOLLOWING522.TYPE = "FUNCTION";

        MARK_FOLLOWING523.text = ":numeric-format";
        MARK_FOLLOWING523.TYPE = "FUNCTION";

        MARK_FOLLOWING524.text = ":numeric-separator";
        MARK_FOLLOWING524.TYPE = "FUNCTION";

        MARK_FOLLOWING525.text = ":ole-invoke-locale";
        MARK_FOLLOWING525.TYPE = "FUNCTION";

        MARK_FOLLOWING526.text = ":ole-names-locale";
        MARK_FOLLOWING526.TYPE = "FUNCTION";

        MARK_FOLLOWING527.text = ":on-frame-border";
        MARK_FOLLOWING527.TYPE = "FUNCTION";

        MARK_FOLLOWING528.text = ":origin-handle";
        MARK_FOLLOWING528.TYPE = "FUNCTION";

        MARK_FOLLOWING529.text = ":origin-rowid";
        MARK_FOLLOWING529.TYPE = "FUNCTION";

        MARK_FOLLOWING530.text = ":overlay";
        MARK_FOLLOWING530.TYPE = "FUNCTION";

        MARK_FOLLOWING531.text = ":owner";
        MARK_FOLLOWING531.TYPE = "FUNCTION";

        MARK_FOLLOWING532.text = ":owner-document";
        MARK_FOLLOWING532.TYPE = "FUNCTION";

        MARK_FOLLOWING533.text = ":page-bottom";
        MARK_FOLLOWING533.TYPE = "FUNCTION";

        MARK_FOLLOWING534.text = ":page-top";
        MARK_FOLLOWING534.TYPE = "FUNCTION";

        MARK_FOLLOWING535.text = ":parameter";
        MARK_FOLLOWING535.TYPE = "FUNCTION";

        MARK_FOLLOWING536.text = ":parent";
        MARK_FOLLOWING536.TYPE = "FUNCTION";

        MARK_FOLLOWING537.text = ":parent-relation";
        MARK_FOLLOWING537.TYPE = "FUNCTION";

        MARK_FOLLOWING538.text = ":parse-status";
        MARK_FOLLOWING538.TYPE = "FUNCTION";

        MARK_FOLLOWING539.text = ":password-field";
        MARK_FOLLOWING539.TYPE = "FUNCTION";

        MARK_FOLLOWING540.text = ":pathname";
        MARK_FOLLOWING540.TYPE = "FUNCTION";

        MARK_FOLLOWING541.text = ":persistent";
        MARK_FOLLOWING541.TYPE = "FUNCTION";

        MARK_FOLLOWING542.text = ":persistent-cache-disabled";
        MARK_FOLLOWING542.TYPE = "FUNCTION";

        MARK_FOLLOWING543.text = ":persistent-procedure";
        MARK_FOLLOWING543.TYPE = "FUNCTION";

        MARK_FOLLOWING544.text = ":pfcolor";
        MARK_FOLLOWING544.TYPE = "FUNCTION";

        MARK_FOLLOWING545.text = ":pixels-per-column";
        MARK_FOLLOWING545.TYPE = "FUNCTION";

        MARK_FOLLOWING546.text = ":pixels-per-row";
        MARK_FOLLOWING546.TYPE = "FUNCTION";

        MARK_FOLLOWING547.text = ":popup-menu";
        MARK_FOLLOWING547.TYPE = "FUNCTION";

        MARK_FOLLOWING548.text = ":popup-only";
        MARK_FOLLOWING548.TYPE = "FUNCTION";

        MARK_FOLLOWING549.text = ":position";
        MARK_FOLLOWING549.TYPE = "FUNCTION";

        MARK_FOLLOWING550.text = ":prepare-string";
        MARK_FOLLOWING550.TYPE = "FUNCTION";

        MARK_FOLLOWING551.text = ":prepared";
        MARK_FOLLOWING551.TYPE = "FUNCTION";

        MARK_FOLLOWING552.text = ":prev-column";
        MARK_FOLLOWING552.TYPE = "FUNCTION";

        MARK_FOLLOWING553.text = ":prev-sibling";
        MARK_FOLLOWING553.TYPE = "FUNCTION";

        MARK_FOLLOWING554.text = ":prev-tab-item";
        MARK_FOLLOWING554.TYPE = "FUNCTION";

        MARK_FOLLOWING555.text = ":primary";
        MARK_FOLLOWING555.TYPE = "FUNCTION";

        MARK_FOLLOWING556.text = ":printer-control-handle";
        MARK_FOLLOWING556.TYPE = "FUNCTION";

        MARK_FOLLOWING557.text = ":printer-hdc";
        MARK_FOLLOWING557.TYPE = "FUNCTION";

        MARK_FOLLOWING558.text = ":printer-name";
        MARK_FOLLOWING558.TYPE = "FUNCTION";

        MARK_FOLLOWING559.text = ":printer-port";
        MARK_FOLLOWING559.TYPE = "FUNCTION";

        MARK_FOLLOWING560.text = ":private-data";
        MARK_FOLLOWING560.TYPE = "FUNCTION";

        MARK_FOLLOWING561.text = ":procedure-name";
        MARK_FOLLOWING561.TYPE = "FUNCTION";

        MARK_FOLLOWING562.text = ":profiling";
        MARK_FOLLOWING562.TYPE = "FUNCTION";

        MARK_FOLLOWING563.text = ":progress-source";
        MARK_FOLLOWING563.TYPE = "FUNCTION";

        MARK_FOLLOWING564.text = ":proxy";
        MARK_FOLLOWING564.TYPE = "FUNCTION";

        MARK_FOLLOWING565.text = ":proxy-password";
        MARK_FOLLOWING565.TYPE = "FUNCTION";

        MARK_FOLLOWING566.text = ":proxy-userid";
        MARK_FOLLOWING566.TYPE = "FUNCTION";

        MARK_FOLLOWING567.text = ":public-id";
        MARK_FOLLOWING567.TYPE = "FUNCTION";

        MARK_FOLLOWING568.text = ":published-events";
        MARK_FOLLOWING568.TYPE = "FUNCTION";

        MARK_FOLLOWING569.text = ":query";
        MARK_FOLLOWING569.TYPE = "FUNCTION";

        MARK_FOLLOWING570.text = ":query-close";
        MARK_FOLLOWING570.TYPE = "FUNCTION";

        MARK_FOLLOWING571.text = ":query-off-end";
        MARK_FOLLOWING571.TYPE = "FUNCTION";

        MARK_FOLLOWING572.text = ":query-open";
        MARK_FOLLOWING572.TYPE = "FUNCTION";

        MARK_FOLLOWING573.text = ":query-prepare";
        MARK_FOLLOWING573.TYPE = "FUNCTION";

        MARK_FOLLOWING574.text = ":quit";
        MARK_FOLLOWING574.TYPE = "FUNCTION";

        MARK_FOLLOWING575.text = ":radio-buttons";
        MARK_FOLLOWING575.TYPE = "FUNCTION";

        MARK_FOLLOWING576.text = ":raw-transfer";
        MARK_FOLLOWING576.TYPE = "FUNCTION";

        MARK_FOLLOWING577.text = ":read";
        MARK_FOLLOWING577.TYPE = "FUNCTION";

        MARK_FOLLOWING578.text = ":read-file";
        MARK_FOLLOWING578.TYPE = "FUNCTION";

        MARK_FOLLOWING579.text = ":read-only";
        MARK_FOLLOWING579.TYPE = "FUNCTION";

        MARK_FOLLOWING580.text = ":recid";
        MARK_FOLLOWING580.TYPE = "FUNCTION";

        MARK_FOLLOWING581.text = ":record-length";
        MARK_FOLLOWING581.TYPE = "FUNCTION";

        MARK_FOLLOWING582.text = ":refresh";
        MARK_FOLLOWING582.TYPE = "FUNCTION";

        MARK_FOLLOWING583.text = ":refreshable";
        MARK_FOLLOWING583.TYPE = "FUNCTION";

        MARK_FOLLOWING584.text = ":reject-changes";
        MARK_FOLLOWING584.TYPE = "FUNCTION";

        MARK_FOLLOWING585.text = ":reject-row-changes";
        MARK_FOLLOWING585.TYPE = "FUNCTION";

        MARK_FOLLOWING586.text = ":rejected";
        MARK_FOLLOWING586.TYPE = "FUNCTION";

        MARK_FOLLOWING587.text = ":remote";
        MARK_FOLLOWING587.TYPE = "FUNCTION";

        MARK_FOLLOWING588.text = ":remote-host";
        MARK_FOLLOWING588.TYPE = "FUNCTION";

        MARK_FOLLOWING589.text = ":remote-port";
        MARK_FOLLOWING589.TYPE = "FUNCTION";

        MARK_FOLLOWING590.text = ":remove-attribute";
        MARK_FOLLOWING590.TYPE = "FUNCTION";

        MARK_FOLLOWING591.text = ":remove-child";
        MARK_FOLLOWING591.TYPE = "FUNCTION";

        MARK_FOLLOWING592.text = ":remove-events-procedure";
        MARK_FOLLOWING592.TYPE = "FUNCTION";

        MARK_FOLLOWING593.text = ":remove-super-procedure";
        MARK_FOLLOWING593.TYPE = "FUNCTION";

        MARK_FOLLOWING594.text = ":replace";
        MARK_FOLLOWING594.TYPE = "FUNCTION";

        MARK_FOLLOWING595.text = ":replace-child";
        MARK_FOLLOWING595.TYPE = "FUNCTION";

        MARK_FOLLOWING596.text = ":replace-selection-text";
        MARK_FOLLOWING596.TYPE = "FUNCTION";

        MARK_FOLLOWING597.text = ":reposition-backwards";
        MARK_FOLLOWING597.TYPE = "FUNCTION";

        MARK_FOLLOWING598.text = ":reposition-forwards";
        MARK_FOLLOWING598.TYPE = "FUNCTION";

        MARK_FOLLOWING599.text = ":reposition-parent-relation";
        MARK_FOLLOWING599.TYPE = "FUNCTION";

        MARK_FOLLOWING600.text = ":reposition-to-row";
        MARK_FOLLOWING600.TYPE = "FUNCTION";

        MARK_FOLLOWING601.text = ":reposition-to-rowid";
        MARK_FOLLOWING601.TYPE = "FUNCTION";

        MARK_FOLLOWING602.text = ":resizable";
        MARK_FOLLOWING602.TYPE = "FUNCTION";

        MARK_FOLLOWING603.text = ":resize";
        MARK_FOLLOWING603.TYPE = "FUNCTION";

        MARK_FOLLOWING604.text = ":retain-shape";
        MARK_FOLLOWING604.TYPE = "FUNCTION";

        MARK_FOLLOWING605.text = ":return-inserted";
        MARK_FOLLOWING605.TYPE = "FUNCTION";

        MARK_FOLLOWING606.text = ":return-value";
        MARK_FOLLOWING606.TYPE = "FUNCTION";

        MARK_FOLLOWING607.text = ":return-value-data-type";
        MARK_FOLLOWING607.TYPE = "FUNCTION";

        MARK_FOLLOWING608.text = ":row";
        MARK_FOLLOWING608.TYPE = "FUNCTION";

        MARK_FOLLOWING609.text = ":row-height-chars";
        MARK_FOLLOWING609.TYPE = "FUNCTION";

        MARK_FOLLOWING610.text = ":row-height-pixels";
        MARK_FOLLOWING610.TYPE = "FUNCTION";

        MARK_FOLLOWING611.text = ":row-markers";
        MARK_FOLLOWING611.TYPE = "FUNCTION";

        MARK_FOLLOWING612.text = ":row-resizable";
        MARK_FOLLOWING612.TYPE = "FUNCTION";

        MARK_FOLLOWING613.text = ":row-state";
        MARK_FOLLOWING613.TYPE = "FUNCTION";

        MARK_FOLLOWING614.text = ":rowid";
        MARK_FOLLOWING614.TYPE = "FUNCTION";

        MARK_FOLLOWING615.text = ":rule-row";
        MARK_FOLLOWING615.TYPE = "FUNCTION";

        MARK_FOLLOWING616.text = ":rule-y";
        MARK_FOLLOWING616.TYPE = "FUNCTION";

        MARK_FOLLOWING617.text = ":save";
        MARK_FOLLOWING617.TYPE = "FUNCTION";

        MARK_FOLLOWING618.text = ":save-file";
        MARK_FOLLOWING618.TYPE = "FUNCTION";

        MARK_FOLLOWING619.text = ":save-row-changes";
        MARK_FOLLOWING619.TYPE = "FUNCTION";

        MARK_FOLLOWING620.text = ":sax-parse";
        MARK_FOLLOWING620.TYPE = "FUNCTION";

        MARK_FOLLOWING621.text = ":sax-parse-first";
        MARK_FOLLOWING621.TYPE = "FUNCTION";

        MARK_FOLLOWING622.text = ":sax-parse-next";
        MARK_FOLLOWING622.TYPE = "FUNCTION";

        MARK_FOLLOWING623.text = ":sax-xml";
        MARK_FOLLOWING623.TYPE = "FUNCTION";

        MARK_FOLLOWING624.text = ":schema-change";
        MARK_FOLLOWING624.TYPE = "FUNCTION";

        MARK_FOLLOWING625.text = ":schema-path";
        MARK_FOLLOWING625.TYPE = "FUNCTION";

        MARK_FOLLOWING626.text = ":screen-lines";
        MARK_FOLLOWING626.TYPE = "FUNCTION";

        MARK_FOLLOWING627.text = ":screen-value";
        MARK_FOLLOWING627.TYPE = "FUNCTION";

        MARK_FOLLOWING628.text = ":scroll-bars";
        MARK_FOLLOWING628.TYPE = "FUNCTION";

        MARK_FOLLOWING629.text = ":scroll-delta";
        MARK_FOLLOWING629.TYPE = "FUNCTION";

        MARK_FOLLOWING630.text = ":scroll-offset";
        MARK_FOLLOWING630.TYPE = "FUNCTION";

        MARK_FOLLOWING631.text = ":scroll-to-current-row";
        MARK_FOLLOWING631.TYPE = "FUNCTION";

        MARK_FOLLOWING632.text = ":scroll-to-item";
        MARK_FOLLOWING632.TYPE = "FUNCTION";

        MARK_FOLLOWING633.text = ":scroll-to-selected-row";
        MARK_FOLLOWING633.TYPE = "FUNCTION";

        MARK_FOLLOWING634.text = ":scrollable";
        MARK_FOLLOWING634.TYPE = "FUNCTION";

        MARK_FOLLOWING635.text = ":scrollbar-horizontal";
        MARK_FOLLOWING635.TYPE = "FUNCTION";

        MARK_FOLLOWING636.text = ":scrollbar-vertical";
        MARK_FOLLOWING636.TYPE = "FUNCTION";

        MARK_FOLLOWING637.text = ":search";
        MARK_FOLLOWING637.TYPE = "FUNCTION";

        MARK_FOLLOWING638.text = ":select-all";
        MARK_FOLLOWING638.TYPE = "FUNCTION";

        MARK_FOLLOWING639.text = ":select-focused-row";
        MARK_FOLLOWING639.TYPE = "FUNCTION";

        MARK_FOLLOWING640.text = ":select-next-row";
        MARK_FOLLOWING640.TYPE = "FUNCTION";

        MARK_FOLLOWING641.text = ":select-prev-row";
        MARK_FOLLOWING641.TYPE = "FUNCTION";

        MARK_FOLLOWING642.text = ":select-row";
        MARK_FOLLOWING642.TYPE = "FUNCTION";

        MARK_FOLLOWING643.text = ":selectable";
        MARK_FOLLOWING643.TYPE = "FUNCTION";

        MARK_FOLLOWING644.text = ":selected";
        MARK_FOLLOWING644.TYPE = "FUNCTION";

        MARK_FOLLOWING645.text = ":selection-end";
        MARK_FOLLOWING645.TYPE = "FUNCTION";

        MARK_FOLLOWING646.text = ":selection-start";
        MARK_FOLLOWING646.TYPE = "FUNCTION";

        MARK_FOLLOWING647.text = ":selection-text";
        MARK_FOLLOWING647.TYPE = "FUNCTION";

        MARK_FOLLOWING648.text = ":sensitive";
        MARK_FOLLOWING648.TYPE = "FUNCTION";

        MARK_FOLLOWING649.text = ":separator-fgcolor";
        MARK_FOLLOWING649.TYPE = "FUNCTION";

        MARK_FOLLOWING650.text = ":separators";
        MARK_FOLLOWING650.TYPE = "FUNCTION";

        MARK_FOLLOWING651.text = ":server";
        MARK_FOLLOWING651.TYPE = "FUNCTION";

        MARK_FOLLOWING652.text = ":server-connection-bound";
        MARK_FOLLOWING652.TYPE = "FUNCTION";

        MARK_FOLLOWING653.text = ":server-connection-bound-request";
        MARK_FOLLOWING653.TYPE = "FUNCTION";

        MARK_FOLLOWING654.text = ":server-connection-context";
        MARK_FOLLOWING654.TYPE = "FUNCTION";

        MARK_FOLLOWING655.text = ":server-connection-id";
        MARK_FOLLOWING655.TYPE = "FUNCTION";

        MARK_FOLLOWING656.text = ":server-operating-mode";
        MARK_FOLLOWING656.TYPE = "FUNCTION";

        MARK_FOLLOWING657.text = ":session-end";
        MARK_FOLLOWING657.TYPE = "FUNCTION";

        MARK_FOLLOWING658.text = ":set-attribute";
        MARK_FOLLOWING658.TYPE = "FUNCTION";

        MARK_FOLLOWING659.text = ":set-attribute-node";
        MARK_FOLLOWING659.TYPE = "FUNCTION";

        MARK_FOLLOWING660.text = ":set-blue-value";
        MARK_FOLLOWING660.TYPE = "FUNCTION";

        MARK_FOLLOWING661.text = ":set-break";
        MARK_FOLLOWING661.TYPE = "FUNCTION";

        MARK_FOLLOWING662.text = ":set-buffers";
        MARK_FOLLOWING662.TYPE = "FUNCTION";

        MARK_FOLLOWING663.text = ":set-callback-procedure";
        MARK_FOLLOWING663.TYPE = "FUNCTION";

        MARK_FOLLOWING664.text = ":set-commit";
        MARK_FOLLOWING664.TYPE = "FUNCTION";

        MARK_FOLLOWING665.text = ":set-connect-procedure";
        MARK_FOLLOWING665.TYPE = "FUNCTION";

        MARK_FOLLOWING666.text = ":set-dynamic";
        MARK_FOLLOWING666.TYPE = "FUNCTION";

        MARK_FOLLOWING667.text = ":set-green-value";
        MARK_FOLLOWING667.TYPE = "FUNCTION";

        MARK_FOLLOWING668.text = ":set-input-source";
        MARK_FOLLOWING668.TYPE = "FUNCTION";

        MARK_FOLLOWING669.text = ":set-numeric-format";
        MARK_FOLLOWING669.TYPE = "FUNCTION";

        MARK_FOLLOWING670.text = ":set-parameter";
        MARK_FOLLOWING670.TYPE = "FUNCTION";

        MARK_FOLLOWING671.text = ":set-read-response-procedure";
        MARK_FOLLOWING671.TYPE = "FUNCTION";

        MARK_FOLLOWING672.text = ":set-red-value";
        MARK_FOLLOWING672.TYPE = "FUNCTION";

        MARK_FOLLOWING673.text = ":set-repositioned-row";
        MARK_FOLLOWING673.TYPE = "FUNCTION";

        MARK_FOLLOWING674.text = ":set-rgb-value";
        MARK_FOLLOWING674.TYPE = "FUNCTION";

        MARK_FOLLOWING675.text = ":set-rollback";
        MARK_FOLLOWING675.TYPE = "FUNCTION";

        MARK_FOLLOWING676.text = ":set-selection";
        MARK_FOLLOWING676.TYPE = "FUNCTION";

        MARK_FOLLOWING677.text = ":set-socket-option";
        MARK_FOLLOWING677.TYPE = "FUNCTION";

        MARK_FOLLOWING678.text = ":set-wait-state";
        MARK_FOLLOWING678.TYPE = "FUNCTION";

        MARK_FOLLOWING679.text = ":show-in-taskbar";
        MARK_FOLLOWING679.TYPE = "FUNCTION";

        MARK_FOLLOWING680.text = ":side-label-handle";
        MARK_FOLLOWING680.TYPE = "FUNCTION";

        MARK_FOLLOWING681.text = ":side-labels";
        MARK_FOLLOWING681.TYPE = "FUNCTION";

        MARK_FOLLOWING682.text = ":skip-deleted-record";
        MARK_FOLLOWING682.TYPE = "FUNCTION";

        MARK_FOLLOWING683.text = ":small-icon";
        MARK_FOLLOWING683.TYPE = "FUNCTION";

        MARK_FOLLOWING684.text = ":small-title";
        MARK_FOLLOWING684.TYPE = "FUNCTION";

        MARK_FOLLOWING685.text = ":sort";
        MARK_FOLLOWING685.TYPE = "FUNCTION";

        MARK_FOLLOWING686.text = ":startup-parameters";
        MARK_FOLLOWING686.TYPE = "FUNCTION";

        MARK_FOLLOWING687.text = ":status-area";
        MARK_FOLLOWING687.TYPE = "FUNCTION";

        MARK_FOLLOWING688.text = ":status-area-font";
        MARK_FOLLOWING688.TYPE = "FUNCTION";

        MARK_FOLLOWING689.text = ":stop";
        MARK_FOLLOWING689.TYPE = "FUNCTION";

        MARK_FOLLOWING690.text = ":stop-parsing";
        MARK_FOLLOWING690.TYPE = "FUNCTION";

        MARK_FOLLOWING691.text = ":stopped";
        MARK_FOLLOWING691.TYPE = "FUNCTION";

        MARK_FOLLOWING692.text = ":stretch-to-fit";
        MARK_FOLLOWING692.TYPE = "FUNCTION";

        MARK_FOLLOWING693.text = ":string-value";
        MARK_FOLLOWING693.TYPE = "FUNCTION";

        MARK_FOLLOWING694.text = ":sub-menu-help";
        MARK_FOLLOWING694.TYPE = "FUNCTION";

        MARK_FOLLOWING695.text = ":subtype";
        MARK_FOLLOWING695.TYPE = "FUNCTION";

        MARK_FOLLOWING696.text = ":super-procedures";
        MARK_FOLLOWING696.TYPE = "FUNCTION";

        MARK_FOLLOWING697.text = ":suppress-namespace-processing";
        MARK_FOLLOWING697.TYPE = "FUNCTION";

        MARK_FOLLOWING698.text = ":suppress-warnings";
        MARK_FOLLOWING698.TYPE = "FUNCTION";

        MARK_FOLLOWING699.text = ":synchronize";
        MARK_FOLLOWING699.TYPE = "FUNCTION";

        MARK_FOLLOWING700.text = ":system-alert-boxes";
        MARK_FOLLOWING700.TYPE = "FUNCTION";

        MARK_FOLLOWING701.text = ":system-id";
        MARK_FOLLOWING701.TYPE = "FUNCTION";

        MARK_FOLLOWING702.text = ":tab-position";
        MARK_FOLLOWING702.TYPE = "FUNCTION";

        MARK_FOLLOWING703.text = ":tab-stop";
        MARK_FOLLOWING703.TYPE = "FUNCTION";

        MARK_FOLLOWING704.text = ":table";
        MARK_FOLLOWING704.TYPE = "FUNCTION";

        MARK_FOLLOWING705.text = ":table-crc-list";
        MARK_FOLLOWING705.TYPE = "FUNCTION";

        MARK_FOLLOWING706.text = ":table-handle";
        MARK_FOLLOWING706.TYPE = "FUNCTION";

        MARK_FOLLOWING707.text = ":table-list";
        MARK_FOLLOWING707.TYPE = "FUNCTION";

        MARK_FOLLOWING708.text = ":table-number";
        MARK_FOLLOWING708.TYPE = "FUNCTION";

        MARK_FOLLOWING709.text = ":temp-directory";
        MARK_FOLLOWING709.TYPE = "FUNCTION";

        MARK_FOLLOWING710.text = ":temp-table-prepare";
        MARK_FOLLOWING710.TYPE = "FUNCTION";

        MARK_FOLLOWING711.text = ":text-selected";
        MARK_FOLLOWING711.TYPE = "FUNCTION";

        MARK_FOLLOWING712.text = ":three-d";
        MARK_FOLLOWING712.TYPE = "FUNCTION";

        MARK_FOLLOWING713.text = ":tic-marks";
        MARK_FOLLOWING713.TYPE = "FUNCTION";

        MARK_FOLLOWING714.text = ":time-source";
        MARK_FOLLOWING714.TYPE = "FUNCTION";

        MARK_FOLLOWING715.text = ":title";
        MARK_FOLLOWING715.TYPE = "FUNCTION";

        MARK_FOLLOWING716.text = ":title-bgcolor";
        MARK_FOLLOWING716.TYPE = "FUNCTION";

        MARK_FOLLOWING717.text = ":title-dcolor";
        MARK_FOLLOWING717.TYPE = "FUNCTION";

        MARK_FOLLOWING718.text = ":title-fgcolor";
        MARK_FOLLOWING718.TYPE = "FUNCTION";

        MARK_FOLLOWING719.text = ":title-font";
        MARK_FOLLOWING719.TYPE = "FUNCTION";

        MARK_FOLLOWING720.text = ":toggle-box";
        MARK_FOLLOWING720.TYPE = "FUNCTION";

        MARK_FOLLOWING721.text = ":tooltip";
        MARK_FOLLOWING721.TYPE = "FUNCTION";

        MARK_FOLLOWING722.text = ":tooltips";
        MARK_FOLLOWING722.TYPE = "FUNCTION";

        MARK_FOLLOWING723.text = ":top-only";
        MARK_FOLLOWING723.TYPE = "FUNCTION";

        MARK_FOLLOWING724.text = ":trace-filter";
        MARK_FOLLOWING724.TYPE = "FUNCTION";

        MARK_FOLLOWING725.text = ":tracing";
        MARK_FOLLOWING725.TYPE = "FUNCTION";

        MARK_FOLLOWING726.text = ":tracking-changes";
        MARK_FOLLOWING726.TYPE = "FUNCTION";

        MARK_FOLLOWING727.text = ":trans-init-procedure";
        MARK_FOLLOWING727.TYPE = "FUNCTION";

        MARK_FOLLOWING728.text = ":transaction";
        MARK_FOLLOWING728.TYPE = "FUNCTION";

        MARK_FOLLOWING729.text = ":transparent";
        MARK_FOLLOWING729.TYPE = "FUNCTION";

        MARK_FOLLOWING730.text = ":type";
        MARK_FOLLOWING730.TYPE = "FUNCTION";

        MARK_FOLLOWING731.text = ":undo";
        MARK_FOLLOWING731.TYPE = "FUNCTION";

        MARK_FOLLOWING732.text = ":unique-id";
        MARK_FOLLOWING732.TYPE = "FUNCTION";

        MARK_FOLLOWING733.text = ":unique-match";
        MARK_FOLLOWING733.TYPE = "FUNCTION";

        MARK_FOLLOWING734.text = ":url";
        MARK_FOLLOWING734.TYPE = "FUNCTION";

        MARK_FOLLOWING735.text = ":url-decode";
        MARK_FOLLOWING735.TYPE = "FUNCTION";

        MARK_FOLLOWING736.text = ":url-encode";
        MARK_FOLLOWING736.TYPE = "FUNCTION";

        MARK_FOLLOWING737.text = ":url-password";
        MARK_FOLLOWING737.TYPE = "FUNCTION";

        MARK_FOLLOWING738.text = ":url-userid";
        MARK_FOLLOWING738.TYPE = "FUNCTION";

        MARK_FOLLOWING739.text = ":user-data";
        MARK_FOLLOWING739.TYPE = "FUNCTION";

        MARK_FOLLOWING740.text = ":v6display";
        MARK_FOLLOWING740.TYPE = "FUNCTION";

        MARK_FOLLOWING741.text = ":validate";
        MARK_FOLLOWING741.TYPE = "FUNCTION";

        MARK_FOLLOWING742.text = ":validate-expression";
        MARK_FOLLOWING742.TYPE = "FUNCTION";

        MARK_FOLLOWING743.text = ":validate-message";
        MARK_FOLLOWING743.TYPE = "FUNCTION";

        MARK_FOLLOWING744.text = ":validate-xml";
        MARK_FOLLOWING744.TYPE = "FUNCTION";

        MARK_FOLLOWING745.text = ":validation-enabled";
        MARK_FOLLOWING745.TYPE = "FUNCTION";

        MARK_FOLLOWING746.text = ":value";
        MARK_FOLLOWING746.TYPE = "FUNCTION";

        MARK_FOLLOWING747.text = ":view-first-column-on-reopen";
        MARK_FOLLOWING747.TYPE = "FUNCTION";

        MARK_FOLLOWING748.text = ":virtual-height-chars";
        MARK_FOLLOWING748.TYPE = "FUNCTION";

        MARK_FOLLOWING749.text = ":virtual-height-pixels";
        MARK_FOLLOWING749.TYPE = "FUNCTION";

        MARK_FOLLOWING750.text = ":virtual-width-chars";
        MARK_FOLLOWING750.TYPE = "FUNCTION";

        MARK_FOLLOWING751.text = ":virtual-width-pixels";
        MARK_FOLLOWING751.TYPE = "FUNCTION";

        MARK_FOLLOWING752.text = ":visible";
        MARK_FOLLOWING752.TYPE = "FUNCTION";

        MARK_FOLLOWING753.text = ":warning";
        MARK_FOLLOWING753.TYPE = "FUNCTION";

        MARK_FOLLOWING754.text = ":widget-enter";
        MARK_FOLLOWING754.TYPE = "FUNCTION";

        MARK_FOLLOWING755.text = ":widget-leave";
        MARK_FOLLOWING755.TYPE = "FUNCTION";

        MARK_FOLLOWING756.text = ":width-chars";
        MARK_FOLLOWING756.TYPE = "FUNCTION";

        MARK_FOLLOWING757.text = ":width-pixels";
        MARK_FOLLOWING757.TYPE = "FUNCTION";

        MARK_FOLLOWING758.text = ":window";
        MARK_FOLLOWING758.TYPE = "FUNCTION";

        MARK_FOLLOWING759.text = ":window-state";
        MARK_FOLLOWING759.TYPE = "FUNCTION";

        MARK_FOLLOWING760.text = ":window-system";
        MARK_FOLLOWING760.TYPE = "FUNCTION";

        MARK_FOLLOWING761.text = ":word-wrap";
        MARK_FOLLOWING761.TYPE = "FUNCTION";

        MARK_FOLLOWING762.text = ":work-area-height-pixels";
        MARK_FOLLOWING762.TYPE = "FUNCTION";

        MARK_FOLLOWING763.text = ":work-area-width-pixels";
        MARK_FOLLOWING763.TYPE = "FUNCTION";

        MARK_FOLLOWING764.text = ":work-area-x";
        MARK_FOLLOWING764.TYPE = "FUNCTION";

        MARK_FOLLOWING765.text = ":work-area-y";
        MARK_FOLLOWING765.TYPE = "FUNCTION";

        MARK_FOLLOWING766.text = ":write";
        MARK_FOLLOWING766.TYPE = "FUNCTION";

        MARK_FOLLOWING767.text = ":write-data";
        MARK_FOLLOWING767.TYPE = "FUNCTION";

        MARK_FOLLOWING768.text = ":x";
        MARK_FOLLOWING768.TYPE = "FUNCTION";

        MARK_FOLLOWING769.text = ":x-document";
        MARK_FOLLOWING769.TYPE = "FUNCTION";

        MARK_FOLLOWING770.text = ":xml-schema-path";
        MARK_FOLLOWING770.TYPE = "FUNCTION";

        MARK_FOLLOWING771.text = ":xml-suppress-namespace-processing";
        MARK_FOLLOWING771.TYPE = "FUNCTION";

        MARK_FOLLOWING772.text = ":y";
        MARK_FOLLOWING772.TYPE = "FUNCTION";

        MARK_FOLLOWING773.text = ":year-offset";
        MARK_FOLLOWING773.TYPE = "FUNCTION";

        MARK_FOLLOWING774.text = ":_dcm";
        MARK_FOLLOWING774.TYPE = "FUNCTION";

        SEQ_REGEXP1.text = "put\\s+screen";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "INVALID";
        SEQ_REGEXP1.HASH_CHAR = "put";

        MARK_FOLLOWING775.text = ":WHERE-STRING";
        MARK_FOLLOWING775.TYPE = "INVALID";

        MARK_FOLLOWING776.text = ":REPOSITION-PARENT-RELATION";
        MARK_FOLLOWING776.TYPE = "INVALID";

        SEQ_REGEXP2.text = "choose\\s+of";
        SEQ_REGEXP2.AT_WORD_START = "TRUE";
        SEQ_REGEXP2.TYPE = "KEYWORD3";
        SEQ_REGEXP2.HASH_CHAR = "choose";


        KEYWORDS1.add("INVALID", new String[]{"USE-INDEX", "UNIX", "DOS", "VMS", "BTOS", "CTOS", "OS2", "OS400", "EDITING", "CHOOSE", "PROMPT-FOR", "SHARE-LOCK", "READKEY", "GO-PENDING", "VALIDATE", "IS-ATTR-SPACE", "GATEWAYS", "SCROLL", "ITERATION-CHANGED", "BEFORE-RECORD-FILL", "AFTER-RECORD-FILL", "REPOSITION-MODE", });
        KEYWORDS1.add("KEYWORD2", new String[]{"_abbreviate", "_account_expires", "_actailog", "_actbilog", "_actbuffer", "_actindex", "_actiofile", "_actiotype", "_active", "_actlock", "_actother", "_actpws", "_actrecord", "_actserver", "_actspace", "_actsummary", "_admin", "_ailog-aiwwrites", "_ailog-bbuffwaits", "_ailog-byteswritn", "_ailog-forcewaits", "_ailog-id", "_ailog-misc", "_ailog-nobufavail", "_ailog-partialwrt", "_ailog-recwriten", "_ailog-totwrites", "_ailog-trans", "_ailog-uptime", "_alt", "_area", "_area-attrib", "_area-block", "_area-blocksize", "_area-clustersize", "_area-extents", "_area-misc", "_area-name", "_area-number", "_area-recbits", "_area-recid", "_area-type", "_area-version", "_areaextent", "_areastatus", "_areastatus-areaname", "_areastatus-areanum", "_areastatus-extents", "_areastatus-freenum", "_areastatus-hiwater", "_areastatus-id", "_areastatus-lastextent", "_areastatus-rmnum", "_areastatus-totblocks", "_argtype", "_ascending", "_attribute", "_attributes1", "_auth-id", "_autoincr", "_base-col", "_base-tables", "_bfstatus-apwq", "_bfstatus-ckpmarked", "_bfstatus-ckpq", "_bfstatus-hashsize", "_bfstatus-id", "_bfstatus-lastckpnum", "_bfstatus-lru", "_bfstatus-misc", "_bfstatus-modbuffs", "_bfstatus-totbufs", "_bfstatus-usedbuffs", "_bilog-bbuffwaits", "_bilog-biwwrites", "_bilog-bytesread", "_bilog-byteswrtn", "_bilog-clstrclose", "_bilog-ebuffwaits", "_bilog-forcewaits", "_bilog-forcewrts", "_bilog-id", "_bilog-misc", "_bilog-partialwrts", "_bilog-recread", "_bilog-recwriten", "_bilog-totalwrts", "_bilog-totreads", "_bilog-trans", "_bilog-uptime", "_block", "_block-area", "_block-bkupctr", "_block-block", "_block-chaintype", "_block-dbkey", "_block-id", "_block-misc", "_block-nextdbkey", "_block-type", "_block-update", "_buffer-apwenq", "_buffer-chkpts", "_buffer-deferred", "_buffer-flushed", "_buffer-id", "_buffer-logicrds", "_buffer-logicwrts", "_buffer-lruskips", "_buffer-lruwrts", "_buffer-marked", "_buffer-misc", "_buffer-osrds", "_buffer-oswrts", "_buffer-trans", "_buffer-uptime", "_buffstatus", "_cache", "_can-create", "_can-delete", "_can-dump", "_can-load", "_can-read", "_can-write", "_casesensitive", "_charset", "_checkpoint", "_checkpoint-apwq", "_checkpoint-cptq", "_checkpoint-dirty", "_checkpoint-flush", "_checkpoint-id", "_checkpoint-len", "_checkpoint-misc", "_checkpoint-scan", "_checkpoint-time", "_chkclause", "_chkseq", "_cnstrname", "_cnstrtype", "_code-feature", "_codefeature-id", "_codefeature-res01", "_codefeature-res02", "_codefeature_name", "_codefeature_required", "_codefeature_supported", "_codepage", "_col", "_col-label", "_col-label-sa", "_col-name", "_colid", "_coll-cp", "_coll-data", "_coll-name", "_coll-segment", "_coll-sequence", "_coll-strength", "_coll-tran-subtype", "_coll-tran-version", "_collation", "_colname", "_colposition", "_connect", "_connect-2phase", "_connect-batch", "_connect-device", "_connect-disconnect", "_connect-id", "_connect-interrupt", "_connect-misc", "_connect-name", "_connect-pid", "_connect-resync", "_connect-semid", "_connect-semnum", "_connect-server", "_connect-time", "_connect-transid", "_connect-type", "_connect-usr", "_connect-wait", "_connect-wait1", "_cp-attr", "_cp-dbrecid", "_cp-name", "_cp-sequence", "_crc", "_create-limit", "_createparams", "_create_date", "_creator", "_cycle-ok", "_data-type", "_database-feature", "_datatype", "_db", "_db-addr", "_db-coll-name", "_db-collate", "_db-comm", "_db-lang", "_db-local", "_db-misc1", "_db-misc2", "_db-name", "_db-recid", "_db-res1", "_db-res2", "_db-revision", "_db-slave", "_db-type", "_db-xl-name", "_db-xlate", "_dbaacc", "_dbfeature-id", "_dbfeature-res01", "_dbfeature-res02", "_dbfeature_active", "_dbfeature_enabled", "_dbfeature_name", "_dblink", "_dbstatus", "_dbstatus-aiblksize", "_dbstatus-biblksize", "_dbstatus-biclsize", "_dbstatus-biopen", "_dbstatus-bisize", "_dbstatus-bitrunc", "_dbstatus-cachestamp", "_dbstatus-changed", "_dbstatus-clversminor", "_dbstatus-codepage", "_dbstatus-collation", "_dbstatus-createdate", "_dbstatus-dbblksize", "_dbstatus-dbvers", "_dbstatus-dbversminor", "_dbstatus-emptyblks", "_dbstatus-fbdate", "_dbstatus-freeblks", "_dbstatus-hiwater", "_dbstatus-ibdate", "_dbstatus-ibseq", "_dbstatus-id", "_dbstatus-integrity", "_dbstatus-intflags", "_dbstatus-lastopen", "_dbstatus-lasttable", "_dbstatus-lasttran", "_dbstatus-misc", "_dbstatus-mostlocks", "_dbstatus-numareas", "_dbstatus-numlocks", "_dbstatus-numsems", "_dbstatus-prevopen", "_dbstatus-rmfreeblks", "_dbstatus-sharedmemver", "_dbstatus-shmvers", "_dbstatus-starttime", "_dbstatus-state", "_dbstatus-tainted", "_dbstatus-totalblks", "_decimals", "_del", "_deleterule", "_desc", "_description", "_dfltvalue", "_dft-pk", "_dhtypename", "_disabled", "_dtype", "_dump-name", "_email", "_event", "_exe", "_extent", "_extent-attrib", "_extent-misc", "_extent-number", "_extent-path", "_extent-size", "_extent-system", "_extent-type", "_extent-version", "_fetch-type", "_field", "_field-map", "_field-name", "_field-physpos", "_field-recid", "_field-rpos", "_field-trig", "_fil-misc1", "_fil-misc2", "_fil-res1", "_fil-res2", "_file", "_file-label", "_file-label-sa", "_file-name", "_file-number", "_file-recid", "_file-trig", "_filelist", "_filelist-blksize", "_filelist-extend", "_filelist-id", "_filelist-logicalsz", "_filelist-misc", "_filelist-name", "_filelist-openmode", "_filelist-size", "_fire_4gl", "_fld", "_fld-case", "_fld-misc1", "_fld-misc2", "_fld-res1", "_fld-res2", "_fld-stdtype", "_fld-stlen", "_fld-stoff", "_for-allocated", "_for-cnt1", "_for-cnt2", "_for-flag", "_for-format", "_for-id", "_for-info", "_for-itype", "_for-maxsize", "_for-name", "_for-number", "_for-owner", "_for-primary", "_for-retrieve", "_for-scale", "_for-separator", "_for-size", "_for-spacing", "_for-type", "_for-xpos", "_format", "_format-sa", "_frozen", "_given_name", "_grantee", "_grantor", "_group-by", "_group_number", "_has-ccnstrs", "_has-fcnstrs", "_has-pcnstrs", "_has-ucnstrs", "_hasresultset", "_hasreturnval", "_help", "_help-sa", "_hidden", "_host", "_i-misc1", "_i-misc2", "_i-res1", "_i-res2", "_ianum", "_id", "_idx-crc", "_idx-num", "_idxid", "_idxmethod", "_idxname", "_idxowner", "_if-misc1", "_if-misc2", "_if-res1", "_if-res2", "_index", "_index-create", "_index-delete", "_index-field", "_index-find", "_index-free", "_index-id", "_index-misc", "_index-name", "_index-recid", "_index-remove", "_index-seq", "_index-splits", "_index-trans", "_index-uptime", "_indexbase", "_indexstat", "_indexstat-blockdelete", "_indexstat-create", "_indexstat-delete", "_indexstat-id", "_indexstat-read", "_indexstat-split", "_initial", "_initial-sa", "_ins", "_iofile-bufreads", "_iofile-bufwrites", "_iofile-extends", "_iofile-filename", "_iofile-id", "_iofile-misc", "_iofile-reads", "_iofile-trans", "_iofile-ubufreads", "_iofile-ubufwrites", "_iofile-uptime", "_iofile-writes", "_iotype-airds", "_iotype-aiwrts", "_iotype-birds", "_iotype-biwrts", "_iotype-datareads", "_iotype-datawrts", "_iotype-id", "_iotype-idxrds", "_iotype-idxwrts", "_iotype-misc", "_iotype-trans", "_iotype-uptime", "_ispublic", "_keyvalue-expr", "_label", "_label-sa", "_lang", "_last-change", "_last-modified", "_last_login", "_latch", "_latch-busy", "_latch-hold", "_latch-id", "_latch-lock", "_latch-lockedt", "_latch-lockt", "_latch-name", "_latch-qhold", "_latch-spin", "_latch-type", "_latch-wait", "_latch-waitt", "_lic-activeconns", "_lic-batchconns", "_lic-currconns", "_lic-id", "_lic-maxactive", "_lic-maxbatch", "_lic-maxcurrent", "_lic-minactive", "_lic-minbatch", "_lic-mincurrent", "_lic-validusers", "_license", "_linkowner", "_literalprefix", "_literalsuffix", "_localtypename", "_lock", "_lock-canclreq", "_lock-chain", "_lock-downgrade", "_lock-exclfind", "_lock-excllock", "_lock-exclreq", "_lock-exclwait", "_lock-flags", "_lock-id", "_lock-misc", "_lock-name", "_lock-recgetlock", "_lock-recgetreq", "_lock-recgetwait", "_lock-recid", "_lock-redreq", "_lock-shrfind", "_lock-shrlock", "_lock-shrreq", "_lock-shrwait", "_lock-table", "_lock-trans", "_lock-type", "_lock-upglock", "_lock-upgreq", "_lock-upgwait", "_lock-uptime", "_lock-usr", "_lockreq", "_lockreq-exclfind", "_lockreq-id", "_lockreq-misc", "_lockreq-name", "_lockreq-num", "_lockreq-reclock", "_lockreq-recwait", "_lockreq-schlock", "_lockreq-schwait", "_lockreq-shrfind", "_lockreq-trnlock", "_lockreq-trnwait", "_logging", "_logging-2pc", "_logging-2pcnickname", "_logging-2pcpriority", "_logging-aibegin", "_logging-aiblksize", "_logging-aibuffs", "_logging-aicurrext", "_logging-aiextents", "_logging-aigennum", "_logging-aiio", "_logging-aijournal", "_logging-ailogsize", "_logging-ainew", "_logging-aiopen", "_logging-biblksize", "_logging-bibuffs", "_logging-bibytesfree", "_logging-biclage", "_logging-biclsize", "_logging-biextents", "_logging-bifullbuffs", "_logging-biio", "_logging-bilogsize", "_logging-commitdelay", "_logging-crashprot", "_logging-id", "_logging-lastckp", "_logging-misc", "_logins", "_login_failures", "_mandatory", "_max_logins", "_max_tries", "_middle_initial", "_mod-sequence", "_mode", "_mstrblk", "_mstrblk-aiblksize", "_mstrblk-biblksize", "_mstrblk-biopen", "_mstrblk-biprev", "_mstrblk-bistate", "_mstrblk-cfilnum", "_mstrblk-crdate", "_mstrblk-dbstate", "_mstrblk-dbvers", "_mstrblk-fbdate", "_mstrblk-hiwater", "_mstrblk-ibdate", "_mstrblk-ibseq", "_mstrblk-id", "_mstrblk-integrity", "_mstrblk-lasttask", "_mstrblk-misc", "_mstrblk-oppdate", "_mstrblk-oprdate", "_mstrblk-rlclsize", "_mstrblk-rltime", "_mstrblk-tainted", "_mstrblk-timestamp", "_mstrblk-totblks", "_myconn-id", "_myconn-numseqbuffers", "_myconn-pid", "_myconn-usedseqbuffers", "_myconn-userid", "_myconnection", "_name_loc", "_ndx", "_nullable", "_nullflag", "_num-comp", "_numfld", "_numkcomp", "_numkey", "_numkfld", "_object-associate", "_object-associate-type", "_object-attrib", "_object-block", "_object-misc", "_object-number", "_object-root", "_object-system", "_object-type", "_odbcmoney", "_order", "_other-commit", "_other-flushmblk", "_other-id", "_other-misc", "_other-trans", "_other-undo", "_other-uptime", "_other-wait", "_override", "_owner", "_password", "_prime-index", "_proc-name", "_procbin", "_procid", "_procname", "_proctext", "_proctype", "_property", "_pw-apwqwrites", "_pw-buffsscaned", "_pw-bufsckp", "_pw-checkpoints", "_pw-ckpqwrites", "_pw-dbwrites", "_pw-flushed", "_pw-id", "_pw-marked", "_pw-misc", "_pw-scancycles", "_pw-scanwrites", "_pw-totdbwrites", "_pw-trans", "_pw-uptime", "_pwd", "_pwd_duration", "_pwd_expires", "_record-bytescreat", "_record-bytesdel", "_record-bytesread", "_record-bytesupd", "_record-fragcreat", "_record-fragdel", "_record-fragread", "_record-fragupd", "_record-id", "_record-misc", "_record-reccreat", "_record-recdel", "_record-recread", "_record-recupd", "_record-trans", "_record-uptime", "_ref", "_ref-table", "_refcnstrname", "_referstonew", "_referstoold", "_refowner", "_reftblname", "_remowner", "_remtbl", "_repl-agent", "_repl-agentcontrol", "_repl-server", "_replagt-agentid", "_replagt-agentname", "_replagt-blocksack", "_replagt-blocksprocessed", "_replagt-blocksreceived", "_replagt-commstatus", "_replagt-connecttime", "_replagt-dbname", "_replagt-lasttrid", "_replagt-method", "_replagt-notesprocessed", "_replagt-port", "_replagt-reservedchar", "_replagt-reservedint", "_replagt-serverhost", "_replagt-status", "_replagtctl-agentid", "_replagtctl-agentname", "_replagtctl-blocksack", "_replagtctl-blockssent", "_replagtctl-commstatus", "_replagtctl-connecttime", "_replagtctl-lastblocksentat", "_replagtctl-method", "_replagtctl-port", "_replagtctl-remotedbname", "_replagtctl-remotehost", "_replagtctl-reservedchar", "_replagtctl-reservedint", "_replagtctl-status", "_replsrv-agentcount", "_replsrv-blockssent", "_replsrv-id", "_replsrv-lastblocksentat", "_replsrv-reservedchar", "_replsrv-reservedint", "_replsrv-starttime", "_resacc", "_resrc", "_resrc-id", "_resrc-lock", "_resrc-name", "_resrc-time", "_resrc-wait", "_rolename", "_rssid", "_scale", "_schemaname", "_screator", "_searchable", "_segment-bytefree", "_segment-bytesused", "_segment-id", "_segment-misc", "_segment-segid", "_segment-segsize", "_segments", "_sel", "_seq", "_seq-incr", "_seq-init", "_seq-max", "_seq-min", "_seq-misc", "_seq-name", "_seq-num", "_seq-owner", "_sequence", "_server-byterec", "_server-bytesent", "_server-currusers", "_server-id", "_server-logins", "_server-maxusers", "_server-misc", "_server-msgrec", "_server-msgsent", "_server-num", "_server-pendconn", "_server-pid", "_server-portnum", "_server-protocol", "_server-qryrec", "_server-recrec", "_server-recsent", "_server-timeslice", "_server-trans", "_server-type", "_server-uptime", "_servers", "_sname", "_sowner", "_space-allocnewrm", "_space-backadd", "_space-bytesalloc", "_space-dbexd", "_space-examined", "_space-fromfree", "_space-fromrm", "_space-front2back", "_space-frontadd", "_space-id", "_space-locked", "_space-misc", "_space-removed", "_space-retfree", "_space-takefree", "_space-trans", "_space-uptime", "_spare1", "_spare2", "_spare3", "_spare4", "_sql_properties", "_sremdb", "_startup", "_startup-aibuffs", "_startup-ainame", "_startup-apwbuffs", "_startup-apwmaxwrites", "_startup-apwqtime", "_startup-apwstime", "_startup-bibuffs", "_startup-bidelay", "_startup-biio", "_startup-biname", "_startup-bitrunc", "_startup-buffs", "_startup-crashprot", "_startup-directio", "_startup-id", "_startup-locktable", "_startup-maxclients", "_startup-maxservers", "_startup-maxusers", "_startup-misc", "_startup-spin", "_statbase", "_statbase-id", "_statementorrow", "_stbl", "_stblowner", "_storageobject", "_summary-aiwrites", "_summary-bireads", "_summary-biwrites", "_summary-chkpts", "_summary-commits", "_summary-dbaccesses", "_summary-dbreads", "_summary-dbwrites", "_summary-flushed", "_summary-id", "_summary-misc", "_summary-reccreat", "_summary-recdel", "_summary-reclock", "_summary-recreads", "_summary-recupd", "_summary-recwait", "_summary-transcomm", "_summary-undos", "_summary-uptime", "_surname", "_sys-field", "_sysattachtbls", "_sysbigintstat", "_syscalctable", "_syscharstat", "_syschkcolusage", "_syschkconstrs", "_syschkconstr_name_map", "_syscolauth", "_syscolstat", "_sysdatatypes", "_sysdatestat", "_sysdbauth", "_sysdblinks", "_sysfloatstat", "_sysidxstat", "_sysintstat", "_syskeycolusage", "_sysncharstat", "_sysnumstat", "_sysnvarcharstat", "_sysprocbin", "_sysproccolumns", "_sysprocedures", "_sysproctext", "_sysrealstat", "_sysrefconstrs", "_sysroles", "_sysschemas", "_sysseqauth", "_syssmintstat", "_syssynonyms", "_systabauth", "_systblconstrs", "_systblstat", "_systimestat", "_systinyintstat", "_systrigcols", "_systrigger", "_systsstat", "_syststzstat", "_sysvarcharstat", "_sysviews", "_sysviews_name_map", "_tablebase", "_tablestat", "_tablestat-create", "_tablestat-delete", "_tablestat-id", "_tablestat-read", "_tablestat-update", "_tbl", "_tbl-status", "_tbl-type", "_tblid", "_tblname", "_tblowner", "_telephone", "_template", "_toss-limit", "_trans", "_trans-coord", "_trans-coordtx", "_trans-counter", "_trans-duration", "_trans-flags", "_trans-id", "_trans-misc", "_trans-num", "_trans-state", "_trans-txtime", "_trans-usrnum", "_trig-crc", "_triggerevent", "_triggerid", "_triggername", "_triggertime", "_txe-id", "_txe-locks", "_txe-lockss", "_txe-time", "_txe-type", "_txe-wait-time", "_txe-waits", "_txe-waitss", "_txelock", "_typeprecision", "_u-misc1", "_u-misc2", "_unique", "_unsignedattr", "_unsorted", "_upd", "_updatable", "_user", "_user-misc", "_user-name", "_userid", "_userio", "_userio-airead", "_userio-aiwrite", "_userio-biread", "_userio-biwrite", "_userio-dbaccess", "_userio-dbread", "_userio-dbwrite", "_userio-id", "_userio-misc", "_userio-name", "_userio-usr", "_userlock", "_userlock-chain", "_userlock-flags", "_userlock-id", "_userlock-misc", "_userlock-name", "_userlock-recid", "_userlock-type", "_userlock-usr", "_username", "_userstatus", "_userstatus-counter", "_userstatus-objectid", "_userstatus-objecttype", "_userstatus-operation", "_userstatus-state", "_userstatus-target", "_userstatus-userid", "_user_number", "_valexp", "_valmsg", "_valmsg-sa", "_value", "_value_ch", "_value_n", "_val_ts", "_vcol-order", "_version", "_view", "_view-as", "_view-col", "_view-def", "_view-name", "_view-ref", "_viewname", "_viewtext", "_where-cls", "_width", "_word-rule", "_word-rules", "_wordidx", "_wr-attr", "_wr-cp", "_wr-name", "_wr-number", "_wr-segment", "_wr-type", "_wr-version", });
        KEYWORDS1.add("KEYWORD3", new String[]{"any-key", "any-printable", "back-tab", "backspace", "bell", "choose", "container-event", "dde-notify", "default-action", "del", "delete-char", "delete-character", "deselect", "deselection", "drop-file-notify", "empty-selection", "end", "end-box-selection", "end-error", "end-move", "end-resize", "end-search", "endkey", "entry", "error", "go", "help", "home", "leave", "menu-drop", "off-end", "off-home", "parent-window-close", "procedure-complete", "read-response", "recall", "return", "row-display", "row-entry", "row-leave", "scroll-notify", "select", "selection", "start-box-selection", "start-move", "start-resize", "start-search", "tab", "value-changed", "window-close", "window-maximized", "window-minimized", "window-resized", "window-restored", });
        KEYWORDS1.add("COMMENT2", new String[]{"&ADM-CONTAINER", "&ADM-SUPPORTED-LINKS", "&ANALYZE-RESUME", "&ANALYZE-SUSPEND", "&BATCH-MODE", "&BROWSE-NAME", "&DEFINED", "&DISPLAYED-FIELDS", "&DISPLAYED-OBJECTS", "&ELSE", "&ELSEIF", "&ENABLED-FIELDS-IN-QUERY", "&ENABLED-FIELDS", "&ENABLED-OBJECTS", "&ENABLED-TABLES-IN-QUERY", "&ENABLED-TABLES", "&ENDIF", "&EXTERNAL-TABLES", "&FIELD-PAIRS-IN-QUERY", "&FIELD-PAIRS", "&FIELDS-IN-QUERY", "&FILE-NAME", "&FIRST-EXTERNAL-TABLE", "&FIRST-TABLE-IN-QUERY", "&FRAME-NAME", "&GLOB", "&GLOBAL-DEFINE", "&IF", "&INCLUDE", "&INTERNAL-TABLES", "&LAYOUT-VARIABLE", "&LINE-NUMBER", "&LIST-1", "&LIST-2", "&LIST-3", "&LIST-4", "&LIST-5", "&LIST-6", "&MESSAGE", "&NEW", "&OPEN-BROWSERS-IN-QUERY", "&OPEN-QUERY", "&OPSYS", "&PROCEDURE-TYPE", "&QUERY-NAME", "&SCOP", "&SCOPED-DEFINE", "&SELF-NAME", "&SEQUENCE", "&TABLES-IN-QUERY", "&THEN", "&UIB_is_Running", "&UNDEFINE", "&WINDOW-NAME", "&WINDOW-SYSTEM", "DEFINED", "PROCEDURE-TYPE", "_CREATE-WINDOW", "_CUSTOM _DEFINITIONS", "_CUSTOM _MAIN-BLOCK", "_CUSTOM", "_DEFINITIONS", "_END-PROCEDURE-SETTINGS", "_FUNCTION-FORWARD", "_FUNCTION", "_INCLUDED-LIB", "_INLINE", "_MAIN-BLOCK", "_PROCEDURE-SETTINGS", "_PROCEDURE", "_UIB-CODE-BLOCK", "_UIB-PREPROCESSOR-BLOCK", "_VERSION-NUMBER", "_XFTR", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, SEQ_REGEXP2, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, MARK_FOLLOWING2, MARK_FOLLOWING3, MARK_FOLLOWING4, MARK_FOLLOWING5, MARK_FOLLOWING6, MARK_FOLLOWING7, MARK_FOLLOWING8, MARK_FOLLOWING9, MARK_FOLLOWING10, MARK_FOLLOWING11, MARK_FOLLOWING12, MARK_FOLLOWING13, MARK_FOLLOWING14, MARK_FOLLOWING15, MARK_FOLLOWING16, MARK_FOLLOWING17, MARK_FOLLOWING18, MARK_FOLLOWING19, MARK_FOLLOWING20, MARK_FOLLOWING21, MARK_FOLLOWING22, MARK_FOLLOWING23, MARK_FOLLOWING24, MARK_FOLLOWING25, MARK_FOLLOWING26, MARK_FOLLOWING27, MARK_FOLLOWING28, MARK_FOLLOWING29, MARK_FOLLOWING30, MARK_FOLLOWING31, MARK_FOLLOWING32, MARK_FOLLOWING33, MARK_FOLLOWING34, MARK_FOLLOWING35, MARK_FOLLOWING36, MARK_FOLLOWING37, MARK_FOLLOWING38, MARK_FOLLOWING39, MARK_FOLLOWING40, MARK_FOLLOWING41, MARK_FOLLOWING42, MARK_FOLLOWING43, MARK_FOLLOWING44, MARK_FOLLOWING45, MARK_FOLLOWING46, MARK_FOLLOWING47, MARK_FOLLOWING48, MARK_FOLLOWING49, MARK_FOLLOWING50, MARK_FOLLOWING51, MARK_FOLLOWING52, MARK_FOLLOWING53, MARK_FOLLOWING54, MARK_FOLLOWING55, MARK_FOLLOWING56, MARK_FOLLOWING57, MARK_FOLLOWING58, MARK_FOLLOWING59, MARK_FOLLOWING60, MARK_FOLLOWING61, MARK_FOLLOWING62, MARK_FOLLOWING63, MARK_FOLLOWING64, MARK_FOLLOWING65, MARK_FOLLOWING66, MARK_FOLLOWING67, MARK_FOLLOWING68, MARK_FOLLOWING69, MARK_FOLLOWING70, MARK_FOLLOWING71, MARK_FOLLOWING72, MARK_FOLLOWING73, MARK_FOLLOWING74, MARK_FOLLOWING75, MARK_FOLLOWING76, MARK_FOLLOWING77, MARK_FOLLOWING78, MARK_FOLLOWING79, MARK_FOLLOWING80, MARK_FOLLOWING81, MARK_FOLLOWING82, MARK_FOLLOWING83, MARK_FOLLOWING84, MARK_FOLLOWING85, MARK_FOLLOWING86, MARK_FOLLOWING87, MARK_FOLLOWING88, MARK_FOLLOWING89, MARK_FOLLOWING90, MARK_FOLLOWING91, MARK_FOLLOWING92, MARK_FOLLOWING93, MARK_FOLLOWING94, MARK_FOLLOWING95, MARK_FOLLOWING96, MARK_FOLLOWING97, MARK_FOLLOWING98, MARK_FOLLOWING99, MARK_FOLLOWING100, MARK_FOLLOWING101, MARK_FOLLOWING102, MARK_FOLLOWING103, MARK_FOLLOWING104, MARK_FOLLOWING105, MARK_FOLLOWING106, MARK_FOLLOWING107, MARK_FOLLOWING108, MARK_FOLLOWING109, MARK_FOLLOWING110, MARK_FOLLOWING111, MARK_FOLLOWING112, MARK_FOLLOWING113, MARK_FOLLOWING114, MARK_FOLLOWING115, MARK_FOLLOWING116, MARK_FOLLOWING117, MARK_FOLLOWING118, MARK_FOLLOWING119, MARK_FOLLOWING120, MARK_FOLLOWING121, MARK_FOLLOWING122, MARK_FOLLOWING123, MARK_FOLLOWING124, MARK_FOLLOWING125, MARK_FOLLOWING126, MARK_FOLLOWING127, MARK_FOLLOWING128, MARK_FOLLOWING129, MARK_FOLLOWING130, MARK_FOLLOWING131, MARK_FOLLOWING132, MARK_FOLLOWING133, MARK_FOLLOWING134, MARK_FOLLOWING135, MARK_FOLLOWING136, MARK_FOLLOWING137, MARK_FOLLOWING138, MARK_FOLLOWING139, MARK_FOLLOWING140, MARK_FOLLOWING141, MARK_FOLLOWING142, MARK_FOLLOWING143, MARK_FOLLOWING144, MARK_FOLLOWING145, MARK_FOLLOWING146, MARK_FOLLOWING147, MARK_FOLLOWING148, MARK_FOLLOWING149, MARK_FOLLOWING150, MARK_FOLLOWING151, MARK_FOLLOWING152, MARK_FOLLOWING153, MARK_FOLLOWING154, MARK_FOLLOWING155, MARK_FOLLOWING156, MARK_FOLLOWING157, MARK_FOLLOWING158, MARK_FOLLOWING159, MARK_FOLLOWING160, MARK_FOLLOWING161, MARK_FOLLOWING162, MARK_FOLLOWING163, MARK_FOLLOWING164, MARK_FOLLOWING165, MARK_FOLLOWING166, MARK_FOLLOWING167, MARK_FOLLOWING168, MARK_FOLLOWING169, MARK_FOLLOWING170, MARK_FOLLOWING171, MARK_FOLLOWING172, MARK_FOLLOWING173, MARK_FOLLOWING174, MARK_FOLLOWING175, MARK_FOLLOWING176, MARK_FOLLOWING177, MARK_FOLLOWING178, MARK_FOLLOWING179, MARK_FOLLOWING180, MARK_FOLLOWING181, MARK_FOLLOWING182, MARK_FOLLOWING183, MARK_FOLLOWING184, MARK_FOLLOWING185, MARK_FOLLOWING186, MARK_FOLLOWING187, MARK_FOLLOWING188, MARK_FOLLOWING189, MARK_FOLLOWING190, MARK_FOLLOWING191, MARK_FOLLOWING192, MARK_FOLLOWING193, MARK_FOLLOWING194, MARK_FOLLOWING195, MARK_FOLLOWING196, MARK_FOLLOWING197, MARK_FOLLOWING198, MARK_FOLLOWING199, MARK_FOLLOWING200, MARK_FOLLOWING201, MARK_FOLLOWING202, MARK_FOLLOWING203, MARK_FOLLOWING204, MARK_FOLLOWING205, MARK_FOLLOWING206, MARK_FOLLOWING207, MARK_FOLLOWING208, MARK_FOLLOWING209, MARK_FOLLOWING210, MARK_FOLLOWING211, MARK_FOLLOWING212, MARK_FOLLOWING213, MARK_FOLLOWING214, MARK_FOLLOWING215, MARK_FOLLOWING216, MARK_FOLLOWING217, MARK_FOLLOWING218, MARK_FOLLOWING219, MARK_FOLLOWING220, MARK_FOLLOWING221, MARK_FOLLOWING222, MARK_FOLLOWING223, MARK_FOLLOWING224, MARK_FOLLOWING225, MARK_FOLLOWING226, MARK_FOLLOWING227, MARK_FOLLOWING228, MARK_FOLLOWING229, MARK_FOLLOWING230, MARK_FOLLOWING231, MARK_FOLLOWING232, MARK_FOLLOWING233, MARK_FOLLOWING234, MARK_FOLLOWING235, MARK_FOLLOWING236, MARK_FOLLOWING237, MARK_FOLLOWING238, MARK_FOLLOWING239, MARK_FOLLOWING240, MARK_FOLLOWING241, MARK_FOLLOWING242, MARK_FOLLOWING243, MARK_FOLLOWING244, MARK_FOLLOWING245, MARK_FOLLOWING246, MARK_FOLLOWING247, MARK_FOLLOWING248, MARK_FOLLOWING249, MARK_FOLLOWING250, MARK_FOLLOWING251, MARK_FOLLOWING252, MARK_FOLLOWING253, MARK_FOLLOWING254, MARK_FOLLOWING255, MARK_FOLLOWING256, MARK_FOLLOWING257, MARK_FOLLOWING258, MARK_FOLLOWING259, MARK_FOLLOWING260, MARK_FOLLOWING261, MARK_FOLLOWING262, MARK_FOLLOWING263, MARK_FOLLOWING264, MARK_FOLLOWING265, MARK_FOLLOWING266, MARK_FOLLOWING267, MARK_FOLLOWING268, MARK_FOLLOWING269, MARK_FOLLOWING270, MARK_FOLLOWING271, MARK_FOLLOWING272, MARK_FOLLOWING273, MARK_FOLLOWING274, MARK_FOLLOWING275, MARK_FOLLOWING276, MARK_FOLLOWING277, MARK_FOLLOWING278, MARK_FOLLOWING279, MARK_FOLLOWING280, MARK_FOLLOWING281, MARK_FOLLOWING282, MARK_FOLLOWING283, MARK_FOLLOWING284, MARK_FOLLOWING285, MARK_FOLLOWING286, MARK_FOLLOWING287, MARK_FOLLOWING288, MARK_FOLLOWING289, MARK_FOLLOWING290, MARK_FOLLOWING291, MARK_FOLLOWING292, MARK_FOLLOWING293, MARK_FOLLOWING294, MARK_FOLLOWING295, MARK_FOLLOWING296, MARK_FOLLOWING297, MARK_FOLLOWING298, MARK_FOLLOWING299, MARK_FOLLOWING300, MARK_FOLLOWING301, MARK_FOLLOWING302, MARK_FOLLOWING303, MARK_FOLLOWING304, MARK_FOLLOWING305, MARK_FOLLOWING306, MARK_FOLLOWING307, MARK_FOLLOWING308, MARK_FOLLOWING309, MARK_FOLLOWING310, MARK_FOLLOWING311, MARK_FOLLOWING312, MARK_FOLLOWING313, MARK_FOLLOWING314, MARK_FOLLOWING315, MARK_FOLLOWING316, MARK_FOLLOWING317, MARK_FOLLOWING318, MARK_FOLLOWING319, MARK_FOLLOWING320, MARK_FOLLOWING321, MARK_FOLLOWING322, MARK_FOLLOWING323, MARK_FOLLOWING324, MARK_FOLLOWING325, MARK_FOLLOWING326, MARK_FOLLOWING327, MARK_FOLLOWING328, MARK_FOLLOWING329, MARK_FOLLOWING330, MARK_FOLLOWING331, MARK_FOLLOWING332, MARK_FOLLOWING333, MARK_FOLLOWING334, MARK_FOLLOWING335, MARK_FOLLOWING336, MARK_FOLLOWING337, MARK_FOLLOWING338, MARK_FOLLOWING339, MARK_FOLLOWING340, MARK_FOLLOWING341, MARK_FOLLOWING342, MARK_FOLLOWING343, MARK_FOLLOWING344, MARK_FOLLOWING345, MARK_FOLLOWING346, MARK_FOLLOWING347, MARK_FOLLOWING348, MARK_FOLLOWING349, MARK_FOLLOWING350, MARK_FOLLOWING351, MARK_FOLLOWING352, MARK_FOLLOWING353, MARK_FOLLOWING354, MARK_FOLLOWING355, MARK_FOLLOWING356, MARK_FOLLOWING357, MARK_FOLLOWING358, MARK_FOLLOWING359, MARK_FOLLOWING360, MARK_FOLLOWING361, MARK_FOLLOWING362, MARK_FOLLOWING363, MARK_FOLLOWING364, MARK_FOLLOWING365, MARK_FOLLOWING366, MARK_FOLLOWING367, MARK_FOLLOWING368, MARK_FOLLOWING369, MARK_FOLLOWING370, MARK_FOLLOWING371, MARK_FOLLOWING372, MARK_FOLLOWING373, MARK_FOLLOWING374, MARK_FOLLOWING375, MARK_FOLLOWING376, MARK_FOLLOWING377, MARK_FOLLOWING378, MARK_FOLLOWING379, MARK_FOLLOWING380, MARK_FOLLOWING381, MARK_FOLLOWING382, MARK_FOLLOWING383, MARK_FOLLOWING384, MARK_FOLLOWING385, MARK_FOLLOWING386, MARK_FOLLOWING387, MARK_FOLLOWING388, MARK_FOLLOWING389, MARK_FOLLOWING390, MARK_FOLLOWING391, MARK_FOLLOWING392, MARK_FOLLOWING393, MARK_FOLLOWING394, MARK_FOLLOWING395, MARK_FOLLOWING396, MARK_FOLLOWING397, MARK_FOLLOWING398, MARK_FOLLOWING399, MARK_FOLLOWING400, MARK_FOLLOWING401, MARK_FOLLOWING402, MARK_FOLLOWING403, MARK_FOLLOWING404, MARK_FOLLOWING405, MARK_FOLLOWING406, MARK_FOLLOWING407, MARK_FOLLOWING408, MARK_FOLLOWING409, MARK_FOLLOWING410, MARK_FOLLOWING411, MARK_FOLLOWING412, MARK_FOLLOWING413, MARK_FOLLOWING414, MARK_FOLLOWING415, MARK_FOLLOWING416, MARK_FOLLOWING417, MARK_FOLLOWING418, MARK_FOLLOWING419, MARK_FOLLOWING420, MARK_FOLLOWING421, MARK_FOLLOWING422, MARK_FOLLOWING423, MARK_FOLLOWING424, MARK_FOLLOWING425, MARK_FOLLOWING426, MARK_FOLLOWING427, MARK_FOLLOWING428, MARK_FOLLOWING429, MARK_FOLLOWING430, MARK_FOLLOWING431, MARK_FOLLOWING432, MARK_FOLLOWING433, MARK_FOLLOWING434, MARK_FOLLOWING435, MARK_FOLLOWING436, MARK_FOLLOWING437, MARK_FOLLOWING438, MARK_FOLLOWING439, MARK_FOLLOWING440, MARK_FOLLOWING441, MARK_FOLLOWING442, MARK_FOLLOWING443, MARK_FOLLOWING444, MARK_FOLLOWING445, MARK_FOLLOWING446, MARK_FOLLOWING447, MARK_FOLLOWING448, MARK_FOLLOWING449, MARK_FOLLOWING450, MARK_FOLLOWING451, MARK_FOLLOWING452, MARK_FOLLOWING453, MARK_FOLLOWING454, MARK_FOLLOWING455, MARK_FOLLOWING456, MARK_FOLLOWING457, MARK_FOLLOWING458, MARK_FOLLOWING459, MARK_FOLLOWING460, MARK_FOLLOWING461, MARK_FOLLOWING462, MARK_FOLLOWING463, MARK_FOLLOWING464, MARK_FOLLOWING465, MARK_FOLLOWING466, MARK_FOLLOWING467, MARK_FOLLOWING468, MARK_FOLLOWING469, MARK_FOLLOWING470, MARK_FOLLOWING471, MARK_FOLLOWING472, MARK_FOLLOWING473, MARK_FOLLOWING474, MARK_FOLLOWING475, MARK_FOLLOWING476, MARK_FOLLOWING477, MARK_FOLLOWING478, MARK_FOLLOWING479, MARK_FOLLOWING480, MARK_FOLLOWING481, MARK_FOLLOWING482, MARK_FOLLOWING483, MARK_FOLLOWING484, MARK_FOLLOWING485, MARK_FOLLOWING486, MARK_FOLLOWING487, MARK_FOLLOWING488, MARK_FOLLOWING489, MARK_FOLLOWING490, MARK_FOLLOWING491, MARK_FOLLOWING492, MARK_FOLLOWING493, MARK_FOLLOWING494, MARK_FOLLOWING495, MARK_FOLLOWING496, MARK_FOLLOWING497, MARK_FOLLOWING498, MARK_FOLLOWING499, MARK_FOLLOWING500, MARK_FOLLOWING501, MARK_FOLLOWING502, MARK_FOLLOWING503, MARK_FOLLOWING504, MARK_FOLLOWING505, MARK_FOLLOWING506, MARK_FOLLOWING507, MARK_FOLLOWING508, MARK_FOLLOWING509, MARK_FOLLOWING510, MARK_FOLLOWING511, MARK_FOLLOWING512, MARK_FOLLOWING513, MARK_FOLLOWING514, MARK_FOLLOWING515, MARK_FOLLOWING516, MARK_FOLLOWING517, MARK_FOLLOWING518, MARK_FOLLOWING519, MARK_FOLLOWING520, MARK_FOLLOWING521, MARK_FOLLOWING522, MARK_FOLLOWING523, MARK_FOLLOWING524, MARK_FOLLOWING525, MARK_FOLLOWING526, MARK_FOLLOWING527, MARK_FOLLOWING528, MARK_FOLLOWING529, MARK_FOLLOWING530, MARK_FOLLOWING531, MARK_FOLLOWING532, MARK_FOLLOWING533, MARK_FOLLOWING534, MARK_FOLLOWING535, MARK_FOLLOWING536, MARK_FOLLOWING537, MARK_FOLLOWING538, MARK_FOLLOWING539, MARK_FOLLOWING540, MARK_FOLLOWING541, MARK_FOLLOWING542, MARK_FOLLOWING543, MARK_FOLLOWING544, MARK_FOLLOWING545, MARK_FOLLOWING546, MARK_FOLLOWING547, MARK_FOLLOWING548, MARK_FOLLOWING549, MARK_FOLLOWING550, MARK_FOLLOWING551, MARK_FOLLOWING552, MARK_FOLLOWING553, MARK_FOLLOWING554, MARK_FOLLOWING555, MARK_FOLLOWING556, MARK_FOLLOWING557, MARK_FOLLOWING558, MARK_FOLLOWING559, MARK_FOLLOWING560, MARK_FOLLOWING561, MARK_FOLLOWING562, MARK_FOLLOWING563, MARK_FOLLOWING564, MARK_FOLLOWING565, MARK_FOLLOWING566, MARK_FOLLOWING567, MARK_FOLLOWING568, MARK_FOLLOWING569, MARK_FOLLOWING570, MARK_FOLLOWING571, MARK_FOLLOWING572, MARK_FOLLOWING573, MARK_FOLLOWING574, MARK_FOLLOWING575, MARK_FOLLOWING576, MARK_FOLLOWING577, MARK_FOLLOWING578, MARK_FOLLOWING579, MARK_FOLLOWING580, MARK_FOLLOWING581, MARK_FOLLOWING582, MARK_FOLLOWING583, MARK_FOLLOWING584, MARK_FOLLOWING585, MARK_FOLLOWING586, MARK_FOLLOWING587, MARK_FOLLOWING588, MARK_FOLLOWING589, MARK_FOLLOWING590, MARK_FOLLOWING591, MARK_FOLLOWING592, MARK_FOLLOWING593, MARK_FOLLOWING594, MARK_FOLLOWING595, MARK_FOLLOWING596, MARK_FOLLOWING597, MARK_FOLLOWING598, MARK_FOLLOWING599, MARK_FOLLOWING600, MARK_FOLLOWING601, MARK_FOLLOWING602, MARK_FOLLOWING603, MARK_FOLLOWING604, MARK_FOLLOWING605, MARK_FOLLOWING606, MARK_FOLLOWING607, MARK_FOLLOWING608, MARK_FOLLOWING609, MARK_FOLLOWING610, MARK_FOLLOWING611, MARK_FOLLOWING612, MARK_FOLLOWING613, MARK_FOLLOWING614, MARK_FOLLOWING615, MARK_FOLLOWING616, MARK_FOLLOWING617, MARK_FOLLOWING618, MARK_FOLLOWING619, MARK_FOLLOWING620, MARK_FOLLOWING621, MARK_FOLLOWING622, MARK_FOLLOWING623, MARK_FOLLOWING624, MARK_FOLLOWING625, MARK_FOLLOWING626, MARK_FOLLOWING627, MARK_FOLLOWING628, MARK_FOLLOWING629, MARK_FOLLOWING630, MARK_FOLLOWING631, MARK_FOLLOWING632, MARK_FOLLOWING633, MARK_FOLLOWING634, MARK_FOLLOWING635, MARK_FOLLOWING636, MARK_FOLLOWING637, MARK_FOLLOWING638, MARK_FOLLOWING639, MARK_FOLLOWING640, MARK_FOLLOWING641, MARK_FOLLOWING642, MARK_FOLLOWING643, MARK_FOLLOWING644, MARK_FOLLOWING645, MARK_FOLLOWING646, MARK_FOLLOWING647, MARK_FOLLOWING648, MARK_FOLLOWING649, MARK_FOLLOWING650, MARK_FOLLOWING651, MARK_FOLLOWING652, MARK_FOLLOWING653, MARK_FOLLOWING654, MARK_FOLLOWING655, MARK_FOLLOWING656, MARK_FOLLOWING657, MARK_FOLLOWING658, MARK_FOLLOWING659, MARK_FOLLOWING660, MARK_FOLLOWING661, MARK_FOLLOWING662, MARK_FOLLOWING663, MARK_FOLLOWING664, MARK_FOLLOWING665, MARK_FOLLOWING666, MARK_FOLLOWING667, MARK_FOLLOWING668, MARK_FOLLOWING669, MARK_FOLLOWING670, MARK_FOLLOWING671, MARK_FOLLOWING672, MARK_FOLLOWING673, MARK_FOLLOWING674, MARK_FOLLOWING675, MARK_FOLLOWING676, MARK_FOLLOWING677, MARK_FOLLOWING678, MARK_FOLLOWING679, MARK_FOLLOWING680, MARK_FOLLOWING681, MARK_FOLLOWING682, MARK_FOLLOWING683, MARK_FOLLOWING684, MARK_FOLLOWING685, MARK_FOLLOWING686, MARK_FOLLOWING687, MARK_FOLLOWING688, MARK_FOLLOWING689, MARK_FOLLOWING690, MARK_FOLLOWING691, MARK_FOLLOWING692, MARK_FOLLOWING693, MARK_FOLLOWING694, MARK_FOLLOWING695, MARK_FOLLOWING696, MARK_FOLLOWING697, MARK_FOLLOWING698, MARK_FOLLOWING699, MARK_FOLLOWING700, MARK_FOLLOWING701, MARK_FOLLOWING702, MARK_FOLLOWING703, MARK_FOLLOWING704, MARK_FOLLOWING705, MARK_FOLLOWING706, MARK_FOLLOWING707, MARK_FOLLOWING708, MARK_FOLLOWING709, MARK_FOLLOWING710, MARK_FOLLOWING711, MARK_FOLLOWING712, MARK_FOLLOWING713, MARK_FOLLOWING714, MARK_FOLLOWING715, MARK_FOLLOWING716, MARK_FOLLOWING717, MARK_FOLLOWING718, MARK_FOLLOWING719, MARK_FOLLOWING720, MARK_FOLLOWING721, MARK_FOLLOWING722, MARK_FOLLOWING723, MARK_FOLLOWING724, MARK_FOLLOWING725, MARK_FOLLOWING726, MARK_FOLLOWING727, MARK_FOLLOWING728, MARK_FOLLOWING729, MARK_FOLLOWING730, MARK_FOLLOWING731, MARK_FOLLOWING732, MARK_FOLLOWING733, MARK_FOLLOWING734, MARK_FOLLOWING735, MARK_FOLLOWING736, MARK_FOLLOWING737, MARK_FOLLOWING738, MARK_FOLLOWING739, MARK_FOLLOWING740, MARK_FOLLOWING741, MARK_FOLLOWING742, MARK_FOLLOWING743, MARK_FOLLOWING744, MARK_FOLLOWING745, MARK_FOLLOWING746, MARK_FOLLOWING747, MARK_FOLLOWING748, MARK_FOLLOWING749, MARK_FOLLOWING750, MARK_FOLLOWING751, MARK_FOLLOWING752, MARK_FOLLOWING753, MARK_FOLLOWING754, MARK_FOLLOWING755, MARK_FOLLOWING756, MARK_FOLLOWING757, MARK_FOLLOWING758, MARK_FOLLOWING759, MARK_FOLLOWING760, MARK_FOLLOWING761, MARK_FOLLOWING762, MARK_FOLLOWING763, MARK_FOLLOWING764, MARK_FOLLOWING765, MARK_FOLLOWING766, MARK_FOLLOWING767, MARK_FOLLOWING768, MARK_FOLLOWING769, MARK_FOLLOWING770, MARK_FOLLOWING771, MARK_FOLLOWING772, MARK_FOLLOWING773, MARK_FOLLOWING774, MARK_FOLLOWING775, MARK_FOLLOWING776, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}