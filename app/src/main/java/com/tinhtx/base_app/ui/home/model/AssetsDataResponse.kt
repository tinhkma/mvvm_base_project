/*
 * *
 *  * Created by tinhtx on 7/7/23, 2:37 PM
 *  * Copyright (c) 2023 . All rights reserved.
 *  * Last modified 7/7/23, 2:37 PM
 *
 */

package com.tinhtx.base_app.ui.home.model


import com.google.gson.annotations.SerializedName
import com.tinhtx.base_app.repository.api.ApiResponse

data class AssetsDataResponse(
    @SerializedName("ACTIONS") val aCTIONS: ACTIONS,
    @SerializedName("APP_CONFIG") val aPPCONFIG: APPCONFIG,
    @SerializedName("AUTO") val aUTO: AUTO,
    @SerializedName("BROWSE_DATA_TIMEKEEPING") val bROWSEDATATIMEKEEPING: BROWSEDATATIMEKEEPING,
    @SerializedName("CATEGORIES") val cATEGORIES: CATEGORIES,
    @SerializedName("CATEGORY_DATAS") val cATEGORYDATAS: CATEGORYDATAS,
    @SerializedName("CHANGE_PASSWORD") val cHANGEPASSWORD: CHANGEPASSWORD,
    @SerializedName("CHANGE_PROFILE") val cHANGEPROFILE: CHANGEPROFILE,
    @SerializedName("COMMON") val cOMMON: COMMON,
    @SerializedName("COMPANY") val cOMPANY: String,
    @SerializedName("CONFIRM_SAVE") val cONFIRMSAVE: CONFIRMSAVE,
    @SerializedName("CUSTOM") val cUSTOM: CUSTOM,
    @SerializedName("DASHBOARD") val dASHBOARD: DASHBOARD,
    @SerializedName("DATA_KEEPING") val dATAKEEPING: DATAKEEPING,
    @SerializedName("DEPARTMENTS") val dEPARTMENTS: DEPARTMENTS,
    @SerializedName("DETAIL_WORK_PLAN") val dETAILWORKPLAN: DETAILWORKPLAN,
    @SerializedName("EMPLOYEE_GROUP") val eMPLOYEEGROUP: EMPLOYEEGROUP,
    @SerializedName("EMPLOYEES") val eMPLOYEES: EMPLOYEES,
    @SerializedName("ERRORS") val eRRORS: ERRORS,
    @SerializedName("EXAMDATA") val eXAMDATA: EXAMDATA,
    @SerializedName("EXPORT_FILE") val eXPORTFILE: EXPORTFILE,
    @SerializedName("FILES") val fILES: FILES,
    @SerializedName("GRANT_RULE_REQUEST_EMPLOYEE") val gRANTRULEREQUESTEMPLOYEE: GRANTRULEREQUESTEMPLOYEE,
    @SerializedName("GRANT_RULE_TIMESHEET_EMPLOYEE") val gRANTRULETIMESHEETEMPLOYEE: GRANTRULETIMESHEETEMPLOYEE,
    @SerializedName("HISTORY_UPDATE") val hISTORYUPDATE: HISTORYUPDATE,
    @SerializedName("JOB_STATUS") val jOBSTATUS: JOBSTATUS,
    @SerializedName("LEAVE_REQUEST") val lEAVEREQUEST: LEAVEREQUEST,
    @SerializedName("LOGIN_PAGE") val lOGINPAGE: LOGINPAGE,
    @SerializedName("MANAGEMENT_HOLIDAY") val mANAGEMENTHOLIDAY: MANAGEMENTHOLIDAY,
    @SerializedName("MENU_ADMINISTRATION") val mENUADMINISTRATION: MENUADMINISTRATION,
    @SerializedName("MENU_CATEGORIES") val mENUCATEGORIES: MENUCATEGORIES,
    @SerializedName("MENU.MOBILE_APP") val mENUMOBILEAPP: MENUMOBILEAPP,
    @SerializedName("MENU_OT") val mENUOT: MENUOT,
    @SerializedName("MENU_TIMEKEEPING") val mENUTIMEKEEPING: MENUTIMEKEEPING,
    @SerializedName("MENU_TRAINING") val mENUTRAINING: MENUTRAINING,
    @SerializedName("MENU_USERS") val mENUUSERS: MENUUSERS,
    @SerializedName("NOTFOUND") val nOTFOUND: NOTFOUND,
    @SerializedName("OFFICE") val oFFICE: OFFICE,
    @SerializedName("OFFICIALHOLIDAY") val oFFICIALHOLIDAY: OFFICIALHOLIDAY,
    @SerializedName("OVERTIME") val oVERTIME: OVERTIME,
    @SerializedName("POSITIONS") val pOSITIONS: POSITIONS,
    @SerializedName("PROJECT") val pROJECT: PROJECT,
    @SerializedName("RULE_APPROVAL_TIMESHEET") val rULEAPPROVALTIMESHEET: RULEAPPROVALTIMESHEET,
    @SerializedName("RULE_HOLIDAYS") val rULEHOLIDAYS: RULEHOLIDAYS,
    @SerializedName("RULES_APPROVE") val rULESAPPROVE: RULESAPPROVE,
    @SerializedName("RULE_VIEW_INFOS") val rULEVIEWINFOS: RULEVIEWINFOS,
    @SerializedName("SET_RULES") val sETRULES: SETRULES,
    @SerializedName("SET_RULE_VIEW_INFOS") val sETRULEVIEWINFOS: SETRULEVIEWINFOS,
    @SerializedName("SPECIALIZE") val sPECIALIZE: SPECIALIZE,
    @SerializedName("STATISTICAL_OT") val sTATISTICALOT: STATISTICALOT,
    @SerializedName("SUCCESSES") val sUCCESSES: SUCCESSES,
    @SerializedName("SYSTEM_SETTING") val sYSTEMSETTING: SYSTEMSETTING,
    @SerializedName("TABLE_FIELDS") val tABLEFIELDS: TABLEFIELDS,
    @SerializedName("TEMPLATES") val tEMPLATES: TEMPLATES,
    @SerializedName("TIMEKEEPING") val tIMEKEEPING: TIMEKEEPING,
    @SerializedName("TIMESHEET") val tIMESHEET: TIMESHEET,
    @SerializedName("TIMESHEET_PERMISSION") val tIMESHEETPERMISSION: TIMESHEETPERMISSION,
    @SerializedName("TITLE_ERROR") val tITLEERROR: TITLEERROR,
    @SerializedName("USERS") val uSERS: USERS,
    @SerializedName("WORKING_STATUS") val wORKINGSTATUS: WORKINGSTATUS,
    @SerializedName("WORK_PLAN") val wORKPLAN: WORKPLAN,
    @SerializedName("WORK_PLANS_GRANTS") val wORKPLANSGRANTS: WORKPLANSGRANTS
) : ApiResponse() {
    data class ACTIONS(
        @SerializedName("CODE") val cODE: String,
        @SerializedName("ID") val iD: String,
        @SerializedName("MODULE_CODE") val mODULECODE: String,
        @SerializedName("MODULE_NAME") val mODULENAME: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("OBJECT_CODE") val oBJECTCODE: String,
        @SerializedName("OBJECT_NAME") val oBJECTNAME: String,
        @SerializedName("TITLE") val tITLE: String
    )

    data class APPCONFIG(
        @SerializedName("CUSTOM") val cUSTOM: String,
        @SerializedName("EMPLOYEE") val eMPLOYEE: String
    )

    data class AUTO(
        @SerializedName("CONDITIONS") val cONDITIONS: String,
        @SerializedName("FIELD") val fIELD: String,
        @SerializedName("INFO") val iNFO: String,
        @SerializedName("VALUE") val vALUE: String
    )

    data class BROWSEDATATIMEKEEPING(
        @SerializedName("DATE_UPLOAD") val dATEUPLOAD: String,
        @SerializedName("DATE_WORKING") val dATEWORKING: String,
        @SerializedName("EMPLOYEE_CODE") val eMPLOYEECODE: String,
        @SerializedName("EMPLOYEE_NAME") val eMPLOYEENAME: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("ID") val iD: String,
        @SerializedName("IM_EX_TITLE") val iMEXTITLE: String,
        @SerializedName("IMPORT") val iMPORT: String,
        @SerializedName("IN") val iN: String,
        @SerializedName("NAME_FILE") val nAMEFILE: String,
        @SerializedName("NAME_UPLOAD") val nAMEUPLOAD: String,
        @SerializedName("OUT") val oUT: String,
        @SerializedName("TIME") val tIME: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("TITLE_DETAIL") val tITLEDETAIL: String,
        @SerializedName("TITLE_EDIT") val tITLEEDIT: String
    ) {
        data class ERRORS(
            @SerializedName("ER0030") val eR0030: String
        )
    }

    data class CATEGORIES(
        @SerializedName("ALIAS") val aLIAS: String,
        @SerializedName("CODE") val cODE: String,
        @SerializedName("CONTENT") val cONTENT: String,
        @SerializedName("DESCRIPTION") val dESCRIPTION: String,
        @SerializedName("ICON") val iCON: String,
        @SerializedName("ID") val iD: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("ORDERING") val oRDERING: String,
        @SerializedName("PARENT_ID") val pARENTID: String,
        @SerializedName("SCOPE") val sCOPE: String,
        @SerializedName("STATUS") val sTATUS: String,
        @SerializedName("THUMBNAIL") val tHUMBNAIL: String,
        @SerializedName("TITLE") val tITLE: String
    )

    data class CATEGORYDATAS(
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("ID") val iD: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("OBJECT") val oBJECT: String,
        @SerializedName("OBJECT_ID") val oBJECTID: String,
        @SerializedName("OBJECT_NAME") val oBJECTNAME: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("TYPE") val tYPE: String
    ) {
        data class ERRORS(
            @SerializedName("ERC008") val eRC008: String
        )
    }

    data class CHANGEPASSWORD(
        @SerializedName("CONTENT_LDAP") val cONTENTLDAP: String,
        @SerializedName("CURRENT_PASSWORD") val cURRENTPASSWORD: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("GUIDE") val gUIDE: String,
        @SerializedName("MEW_PASSWORD") val mEWPASSWORD: String,
        @SerializedName("NEW_PASSWORD_COMFIRM") val nEWPASSWORDCOMFIRM: String,
        @SerializedName("SAVE") val sAVE: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("TITLE_LDAP") val tITLELDAP: String,
        @SerializedName("UPDATE") val uPDATE: String,
        @SerializedName("UPDATE_SUCCESS") val uPDATESUCCESS: String
    ) {
        data class ERRORS(
            @SerializedName("CONFIRM") val cONFIRM: String,
            @SerializedName("ER0010") val eR0010: String,
            @SerializedName("ER0048") val eR0048: String,
            @SerializedName("PATTERN") val pATTERN: String,
            @SerializedName("REQUIRED") val rEQUIRED: String
        )
    }

    data class CHANGEPROFILE(
        @SerializedName("ERRORS") val eRRORS: ERRORS
    ) {
        data class ERRORS(
            @SerializedName("MALFORMED") val mALFORMED: String,
            @SerializedName("PATTERN") val pATTERN: String
        )
    }

    data class COMMON(
        @SerializedName("ACCEPT") val aCCEPT: String,
        @SerializedName("ADD") val aDD: String,
        @SerializedName("ADJUST_ITEM") val aDJUSTITEM: String,
        @SerializedName("ALERT_LOG_TIME_PAST") val aLERTLOGTIMEPAST: String,
        @SerializedName("ALL") val aLL: String,
        @SerializedName("APPLY") val aPPLY: String,
        @SerializedName("BACK") val bACK: String,
        @SerializedName("CANCEL") val cANCEL: String,
        @SerializedName("CHANGE_PASSWORD") val cHANGEPASSWORD: String,
        @SerializedName("CHANGING_CONTENTS") val cHANGINGCONTENTS: String,
        @SerializedName("CLOSE") val cLOSE: String,
        @SerializedName("CONDITION") val cONDITION: String,
        @SerializedName("CONFIRM_CHANGE") val cONFIRMCHANGE: String,
        @SerializedName("CONFIRM_DELETE") val cONFIRMDELETE: String,
        @SerializedName("CONFIRM_LOGOUT") val cONFIRMLOGOUT: String,
        @SerializedName("CUSTOM_INFO") val cUSTOMINFO: String,
        @SerializedName("DELETE") val dELETE: String,
        @SerializedName("DELETE_CONTENT") val dELETECONTENT: String,
        @SerializedName("DELETE_CONTENTS") val dELETECONTENTS: String,
        @SerializedName("DELETE_LOG_TIME") val dELETELOGTIME: String,
        @SerializedName("DELETE_SUCCESSFUL") val dELETESUCCESSFUL: String,
        @SerializedName("DELETE_TITLE") val dELETETITLE: String,
        @SerializedName("DEPARTMENT") val dEPARTMENT: String,
        @SerializedName("EDIT") val eDIT: String,
        @SerializedName("EDIT_LOG_TIME") val eDITLOGTIME: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("EXIT") val eXIT: String,
        @SerializedName("EXPORT") val eXPORT: String,
        @SerializedName("FILTER") val fILTER: String,
        @SerializedName("FILTER_CONDITION") val fILTERCONDITION: FILTERCONDITION,
        @SerializedName("IMPORT") val iMPORT: String,
        @SerializedName("IMPORT_CSV_FAIL") val iMPORTCSVFAIL: String,
        @SerializedName("IMPORT_EXCEL_FAIL") val iMPORTEXCELFAIL: String,
        @SerializedName("IMPORT_FAIL") val iMPORTFAIL: String,
        @SerializedName("IMPORT_FAIL_FORMAT") val iMPORTFAILFORMAT: String,
        @SerializedName("IMPORT_SUCCESS") val iMPORTSUCCESS: String,
        @SerializedName("ITEM") val iTEM: String,
        @SerializedName("LIMIT") val lIMIT: String,
        @SerializedName("LINE_N") val lINEN: String,
        @SerializedName("LIST_ERRORS") val lISTERRORS: String,
        @SerializedName("LOGOUT") val lOGOUT: String,
        @SerializedName("MARK_ALL_AS_READ") val mARKALLASREAD: String,
        @SerializedName("MY_PROFILE") val mYPROFILE: String,
        @SerializedName("NEW") val nEW: String,
        @SerializedName("NOTIFICATIONS") val nOTIFICATIONS: String,
        @SerializedName("OK") val oK: String,
        @SerializedName("REJECT") val rEJECT: String,
        @SerializedName("RESET") val rESET: String,
        @SerializedName("RESTORE") val rESTORE: String,
        @SerializedName("SAVE") val sAVE: String,
        @SerializedName("SAVE_FAILED") val sAVEFAILED: String,
        @SerializedName("SAVE_SUCCESSFUL") val sAVESUCCESSFUL: String,
        @SerializedName("SET_ROLE") val sETROLE: String,
        @SerializedName("SET_ROLE_WITH_GROUP") val sETROLEWITHGROUP: String,
        @SerializedName("SYNC_FAIL") val sYNCFAIL: String,
        @SerializedName("SYNC_SUCCESS") val sYNCSUCCESS: String,
        @SerializedName("TOTAL") val tOTAL: String,
        @SerializedName("VIEW_ALL") val vIEWALL: String
    ) {
        data class ERRORS(
            @SerializedName("EMAIL") val eMAIL: String,
            @SerializedName("MALFORMED") val mALFORMED: String,
            @SerializedName("MAXLENGTH") val mAXLENGTH: String,
            @SerializedName("MIN") val mIN: String,
            @SerializedName("PATTERN") val pATTERN: String,
            @SerializedName("REQUIRED") val rEQUIRED: String
        )

        data class FILTERCONDITION(
            @SerializedName("AFTER") val aFTER: String,
            @SerializedName("BEFORE") val bEFORE: String,
            @SerializedName("CONTAINS") val cONTAINS: String,
            @SerializedName("EQUAL") val eQUAL: String,
            @SerializedName("GREATER") val gREATER: String,
            @SerializedName("GREATER_OR_EQUAL") val gREATEROREQUAL: String,
            @SerializedName("LESS") val lESS: String,
            @SerializedName("LESS_OR_EQUAL") val lESSOREQUAL: String,
            @SerializedName("MONTH") val mONTH: String,
            @SerializedName("NOT_CONTAIN") val nOTCONTAIN: String,
            @SerializedName("NOT_EQUAL") val nOTEQUAL: String,
            @SerializedName("START_WITH") val sTARTWITH: String,
            @SerializedName("YEAR") val yEAR: String
        )
    }

    data class CONFIRMSAVE(
        @SerializedName("ADD") val aDD: String,
        @SerializedName("CONFIRM") val cONFIRM: String,
        @SerializedName("DEL") val dEL: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("UPDATE") val uPDATE: String
    )

    data class CUSTOM(
        @SerializedName("CREATED_BY") val cREATEDBY: String,
        @SerializedName("CUSTOM_DATA_TYPE") val cUSTOMDATATYPE: CUSTOMDATATYPE,
        @SerializedName("DATA_TYPE") val dATATYPE: String,
        @SerializedName("DELETED_BY") val dELETEDBY: String,
        @SerializedName("ID") val iD: String,
        @SerializedName("LABEL_FIELD") val lABELFIELD: String,
        @SerializedName("MAX_LENGTH") val mAXLENGTH: String,
        @SerializedName("MIN_LENGTH") val mINLENGTH: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("NOTE") val nOTE: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("UPDATED_BY") val uPDATEDBY: String
    ) {
        data class CUSTOMDATATYPE(
            @SerializedName("BOOLEAN") val bOOLEAN: String,
            @SerializedName("DATE") val dATE: String,
            @SerializedName("TEXT") val tEXT: String
        )
    }

    data class DASHBOARD(
        @SerializedName("APPLICATION_PENDING_APPROVAL") val aPPLICATIONPENDINGAPPROVAL: String,
        @SerializedName("BIRTHDAY_IN_MONTH") val bIRTHDAYINMONTH: String,
        @SerializedName("CONTRACT") val cONTRACT: String,
        @SerializedName("DATE") val dATE: String,
        @SerializedName("EMPLOYEES_CHECKIN") val eMPLOYEESCHECKIN: String,
        @SerializedName("EXCELLENT_EMPLOYEES") val eXCELLENTEMPLOYEES: String,
        @SerializedName("KEEPING_MONTH") val kEEPINGMONTH: String,
        @SerializedName("LATE") val lATE: String,
        @SerializedName("LEAVE_IN_MONTH") val lEAVEINMONTH: String,
        @SerializedName("MONTH") val mONTH: String,
        @SerializedName("NEWS") val nEWS: String,
        @SerializedName("PERMISSION_FOR_YEAR") val pERMISSIONFORYEAR: String,
        @SerializedName("PERMISSION_OT") val pERMISSIONOT: String,
        @SerializedName("UNEXCUSED_ABSENCE") val uNEXCUSEDABSENCE: String,
        @SerializedName("WORKING_DAY_TOTAL") val wORKINGDAYTOTAL: String,
        @SerializedName("YEAR") val yEAR: String
    )

    data class DATAKEEPING(
        @SerializedName("DATE") val dATE: String,
        @SerializedName("DEPARTMENT") val dEPARTMENT: String,
        @SerializedName("EMPLOYEE_CODE") val eMPLOYEECODE: String,
        @SerializedName("EMPLOYEE_NAME") val eMPLOYEENAME: String,
        @SerializedName("HOUR") val hOUR: String,
        @SerializedName("ID") val iD: String,
        @SerializedName("LATE") val lATE: String,
        @SerializedName("LEAVE_EARLY") val lEAVEEARLY: String,
        @SerializedName("MINUTE") val mINUTE: String,
        @SerializedName("POSITION") val pOSITION: String,
        @SerializedName("TIME_IN") val tIMEIN: String,
        @SerializedName("TIME_OUT") val tIMEOUT: String,
        @SerializedName("TITLE") val tITLE: String
    )

    data class DEPARTMENTS(
        @SerializedName("CHARGE") val cHARGE: String,
        @SerializedName("CLICK_OPEN") val cLICKOPEN: String,
        @SerializedName("DESCRIPTION") val dESCRIPTION: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("GROUP_EMPLOYEE") val gROUPEMPLOYEE: String,
        @SerializedName("GROUP_ID") val gROUPID: String,
        @SerializedName("ID") val iD: String,
        @SerializedName("IM_EX_TITLE") val iMEXTITLE: String,
        @SerializedName("IS_CHARGE") val iSCHARGE: String,
        @SerializedName("MESSAGE_GROUP") val mESSAGEGROUP: String,
        @SerializedName("MESSAGE_NAME") val mESSAGENAME: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("PARENT") val pARENT: String,
        @SerializedName("SELECT") val sELECT: String,
        @SerializedName("SELECT_DEPARTMENT_CHILD") val sELECTDEPARTMENTCHILD: String,
        @SerializedName("SELECT_SUB") val sELECTSUB: String,
        @SerializedName("SHOW_ALL_USERS") val sHOWALLUSERS: String,
        @SerializedName("SHOW_USERS") val sHOWUSERS: String,
        @SerializedName("SUBS") val sUBS: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("UNLINK_PARENT") val uNLINKPARENT: String
    ) {
        data class ERRORS(
            @SerializedName("ERC008_GROUP") val eRC008GROUP: String,
            @SerializedName("ERC008_NAME") val eRC008NAME: String,
            @SerializedName("REQUIRED") val rEQUIRED: String
        )
    }

    data class DETAILWORKPLAN(
        @SerializedName("BUTTON_EXPORT") val bUTTONEXPORT: String,
        @SerializedName("BUTTON_IMPORT") val bUTTONIMPORT: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("WORK_PLAN_PERSONAL") val wORKPLANPERSONAL: WORKPLANPERSONAL,
        @SerializedName("WORK_PLAN_TOTAL") val wORKPLANTOTAL: WORKPLANTOTAL
    ) {
        data class WORKPLANPERSONAL(
            @SerializedName("DATE") val dATE: String,
            @SerializedName("ID") val iD: String,
            @SerializedName("TITLE") val tITLE: String,
            @SerializedName("TOTAL_TIME") val tOTALTIME: String,
            @SerializedName("WORK_PLAN_HOUR") val wORKPLANHOUR: String,
            @SerializedName("WORK_PLAN_LUNCH") val wORKPLANLUNCH: String
        )

        data class WORKPLANTOTAL(
            @SerializedName("CODE") val cODE: String,
            @SerializedName("DATE") val dATE: String,
            @SerializedName("EMPLOYEE") val eMPLOYEE: String,
            @SerializedName("TITLE") val tITLE: String,
            @SerializedName("TOTAL_TIME") val tOTALTIME: String,
            @SerializedName("WORK_PLAN_HOUR") val wORKPLANHOUR: String,
            @SerializedName("WORK_PLAN_LUNCH") val wORKPLANLUNCH: String
        )
    }

    data class EMPLOYEEGROUP(
        @SerializedName("AUTO") val aUTO: String,
        @SerializedName("CHILD_GROUP") val cHILDGROUP: String,
        @SerializedName("CLOSE_CONTENT") val cLOSECONTENT: String,
        @SerializedName("CLOSE_TITLE") val cLOSETITLE: String,
        @SerializedName("DESCRIPTION") val dESCRIPTION: String,
        @SerializedName("EMPLOYEE_CODE") val eMPLOYEECODE: String,
        @SerializedName("EMPLOYEE_EMAIL") val eMPLOYEEEMAIL: String,
        @SerializedName("EMPLOYEE_ID") val eMPLOYEEID: String,
        @SerializedName("EMPLOYEE_LIST") val eMPLOYEELIST: String,
        @SerializedName("EMPLOYEE_NAME") val eMPLOYEENAME: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("GROUP_CHILD") val gROUPCHILD: String,
        @SerializedName("GROUP_EMPLOYEE") val gROUPEMPLOYEE: String,
        @SerializedName("GROUP_GROUP") val gROUPGROUP: String,
        @SerializedName("GROUP_NAME") val gROUPNAME: String,
        @SerializedName("GROUP_PARENT") val gROUPPARENT: String,
        @SerializedName("ID") val iD: String,
        @SerializedName("IM_EX_TITLE") val iMEXTITLE: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("RELOAD") val rELOAD: String,
        @SerializedName("RELOAD_CONTENT") val rELOADCONTENT: String,
        @SerializedName("RELOAD_SAVE_SUCCESSFUL") val rELOADSAVESUCCESSFUL: String,
        @SerializedName("RELOAD_TITLE") val rELOADTITLE: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("TITLE_ADD") val tITLEADD: String,
        @SerializedName("TITLE_ADD_INFO") val tITLEADDINFO: String,
        @SerializedName("TITLE_EDIT") val tITLEEDIT: String
    ) {
        data class ERRORS(
            @SerializedName("CONTENT_ER0128") val cONTENTER0128: String,
            @SerializedName("ER0128") val eR0128: String,
            @SerializedName("ER0129") val eR0129: String,
            @SerializedName("GROUP_NAME_CONTENT") val gROUPNAMECONTENT: String,
            @SerializedName("GROUP_NAME_ERC008") val gROUPNAMEERC008: String,
            @SerializedName("REQUIRED") val rEQUIRED: String
        )
    }

    data class EMPLOYEES(
        @SerializedName("BASIC_INFO") val bASICINFO: String,
        @SerializedName("CHANGE_MY_PROFILE") val cHANGEMYPROFILE: String,
        @SerializedName("CONTACT") val cONTACT: String,
        @SerializedName("CONTRACT") val cONTRACT: String,
        @SerializedName("CUSTOM") val cUSTOM: String,
        @SerializedName("EDUCATION") val eDUCATION: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("FAMILY_INFORMATION") val fAMILYINFORMATION: String,
        @SerializedName("FIELDS") val fIELDS: FIELDS,
        @SerializedName("GENDER_FEMALE") val gENDERFEMALE: String,
        @SerializedName("GENDER_MALE") val gENDERMALE: String,
        @SerializedName("GENDER_OTHER") val gENDEROTHER: String,
        @SerializedName("GENERAL_INFORMATION") val gENERALINFORMATION: String,
        @SerializedName("IM_EX_TITLE") val iMEXTITLE: String,
        @SerializedName("INSURANCE") val iNSURANCE: String,
        @SerializedName("LINK_HANOI") val lINKHANOI: String,
        @SerializedName("LINK_HCM") val lINKHCM: String,
        @SerializedName("MONTH") val mONTH: String,
        @SerializedName("MY_PROFILE") val mYPROFILE: String,
        @SerializedName("NEW_INFO_TITLE") val nEWINFOTITLE: String,
        @SerializedName("NEW_UPDATE") val nEWUPDATE: String,
        @SerializedName("OLD_INFO_TITLE") val oLDINFOTITLE: String,
        @SerializedName("PERSONAL") val pERSONAL: String,
        @SerializedName("PERSONAL_INFORMATION") val pERSONALINFORMATION: String,
        @SerializedName("PERSONAL_PROFILE_INFORMATION") val pERSONALPROFILEINFORMATION: String,
        @SerializedName("PLACEHOLDER") val pLACEHOLDER: PLACEHOLDER,
        @SerializedName("PROFILE") val pROFILE: String,
        @SerializedName("TABLES") val tABLES: TABLES,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("TITLE_ADD") val tITLEADD: String,
        @SerializedName("TITLE_CONTRACT") val tITLECONTRACT: String,
        @SerializedName("TITLE_HANOI") val tITLEHANOI: String,
        @SerializedName("TITLE_HCM") val tITLEHCM: String,
        @SerializedName("UPDATE") val uPDATE: String,
        @SerializedName("WORKING_DATE") val wORKINGDATE: String
    ) {
        data class ERRORS(
            @SerializedName("BANK_NUMBER") val bANKNUMBER: BANKNUMBER,
            @SerializedName("CONTACT_USER") val cONTACTUSER: CONTACTUSER,
            @SerializedName("CONTRIBUTOR_START_DATE_REQUIRED") val cONTRIBUTORSTARTDATEREQUIRED: String,
            @SerializedName("DATE_REGEX_VALIDATOR") val dATEREGEXVALIDATOR: DATEREGEXVALIDATOR,
            @SerializedName("EMAIL") val eMAIL: EMAIL,
            @SerializedName("FULL_NAME") val fULLNAME: FULLNAME,
            @SerializedName("IDENTIFICATION_NUMBER") val iDENTIFICATIONNUMBER: IDENTIFICATIONNUMBER,
            @SerializedName("IDENTIFICATION_PLACE_OF") val iDENTIFICATIONPLACEOF: IDENTIFICATIONPLACEOF,
            @SerializedName("INTERNSHIP_START_DATE_REQUIRED") val iNTERNSHIPSTARTDATEREQUIRED: String,
            @SerializedName("OFFICIAL_WORKING_DAY_REQUIRED") val oFFICIALWORKINGDAYREQUIRED: String,
            @SerializedName("PATTERN") val pATTERN: String,
            @SerializedName("PERSONAL_EMAIL") val pERSONALEMAIL: PERSONALEMAIL,
            @SerializedName("PROBATIONARY_DATE_REQUIRED") val pROBATIONARYDATEREQUIRED: String,
            @SerializedName("REQUIRED") val rEQUIRED: String,
            @SerializedName("TAX_CODE") val tAXCODE: TAXCODE,
            @SerializedName("VILLAGE") val vILLAGE: VILLAGE
        ) {
            data class BANKNUMBER(
                @SerializedName("PATTERN") val pATTERN: String
            )

            data class CONTACTUSER(
                @SerializedName("PATTERN") val pATTERN: String
            )

            data class DATEREGEXVALIDATOR(
                @SerializedName("PATTERN") val pATTERN: String
            )

            data class EMAIL(
                @SerializedName("PATTERN") val pATTERN: String
            )

            data class FULLNAME(
                @SerializedName("PATTERN") val pATTERN: String
            )

            data class IDENTIFICATIONNUMBER(
                @SerializedName("PATTERN") val pATTERN: String
            )

            data class IDENTIFICATIONPLACEOF(
                @SerializedName("PATTERN") val pATTERN: String
            )

            data class PERSONALEMAIL(
                @SerializedName("PATTERN") val pATTERN: String
            )

            data class TAXCODE(
                @SerializedName("PATTERN") val pATTERN: String
            )

            data class VILLAGE(
                @SerializedName("PATTERN") val pATTERN: String
            )
        }

        data class FIELDS(
            @SerializedName("ACTIVE_CONTRACT") val aCTIVECONTRACT: String,
            @SerializedName("ACTIVE_TITLE") val aCTIVETITLE: String,
            @SerializedName("ADDRESS") val aDDRESS: String,
            @SerializedName("ADDRESS_1") val aDDRESS1: String,
            @SerializedName("ADDRESS_2") val aDDRESS2: String,
            @SerializedName("ADDRESS_3") val aDDRESS3: String,
            @SerializedName("ADDRESS_DETAIL") val aDDRESSDETAIL: String,
            @SerializedName("ADDRESS_HOST") val aDDRESSHOST: String,
            @SerializedName("ADDRESS_IN_REGISTRATION_BOOK") val aDDRESSINREGISTRATIONBOOK: String,
            @SerializedName("APPRENTICESHIP_CONTRACT_NUMBER") val aPPRENTICESHIPCONTRACTNUMBER: String,
            @SerializedName("APPRENTICESHIP_CONTRACT_START_DATE") val aPPRENTICESHIPCONTRACTSTARTDATE: String,
            @SerializedName("APPRENTICESHIP_CONTRACT_TIME") val aPPRENTICESHIPCONTRACTTIME: String,
            @SerializedName("BANK_BRANCH") val bANKBRANCH: String,
            @SerializedName("BANK_NAME") val bANKNAME: String,
            @SerializedName("BANK_NUMBER") val bANKNUMBER: String,
            @SerializedName("BANK_USER_NAME") val bANKUSERNAME: String,
            @SerializedName("BHXH") val bHXH: String,
            @SerializedName("BIRTH_DAY") val bIRTHDAY: String,
            @SerializedName("BIRTHDAY") val bIRTHDAYOFMONTH: String,
            @SerializedName("BIRTHDAY_HOST") val bIRTHDAYHOST: String,
            @SerializedName("CATEGORY") val cATEGORY: String,
            @SerializedName("CHATWORK_ACCOUNT") val cHATWORKACCOUNT: String,
            @SerializedName("CHECK_IN_DATE") val cHECKINDATE: String,
            @SerializedName("CHECK_OUT_DATE") val cHECKOUTDATE: String,
            @SerializedName("CHILDREN_HAVING") val cHILDRENHAVING: String,
            @SerializedName("CMND") val cMND: String,
            @SerializedName("COMMUNE") val cOMMUNE: String,
            @SerializedName("CONCURRENT_TITLE") val cONCURRENTTITLE: String,
            @SerializedName("CONFIDENTIALITY_CONTRACT") val cONFIDENTIALITYCONTRACT: String,
            @SerializedName("CONFIDENTIALITY_CONTRACT_CODE") val cONFIDENTIALITYCONTRACTCODE: String,
            @SerializedName("CONFIRM_HEALTH_INSURANCE") val cONFIRMHEALTHINSURANCE: String,
            @SerializedName("CONTACT_USER") val cONTACTUSER: String,
            @SerializedName("CONTRACT") val cONTRACT: String,
            @SerializedName("CONTRACT_END_DATE") val cONTRACTENDDATE: String,
            @SerializedName("CONTRACT_NUMBER") val cONTRACTNUMBER: String,
            @SerializedName("CONTRACTS_1") val cONTRACTS1: String,
            @SerializedName("CONTRACTS_2") val cONTRACTS2: String,
            @SerializedName("CONTRACTS_3") val cONTRACTS3: String,
            @SerializedName("CONTRACTS_4") val cONTRACTS4: String,
            @SerializedName("CONTRACTS_5") val cONTRACTS5: String,
            @SerializedName("CONTRACT_START_DATE") val cONTRACTSTARTDATE: String,
            @SerializedName("CONTRACT_TIME") val cONTRACTTIME: String,
            @SerializedName("CONTRACT_TYPE") val cONTRACTTYPE: String,
            @SerializedName("COPY_OF_BIRTH_CERTIFICATE") val cOPYOFBIRTHCERTIFICATE: String,
            @SerializedName("COPY_OF_DEGREE") val cOPYOFDEGREE: String,
            @SerializedName("COPY_OF_IDENTIFY_CARD") val cOPYOFIDENTIFYCARD: String,
            @SerializedName("COPY_OF_REGISTRATION_BOOK") val cOPYOFREGISTRATIONBOOK: String,
            @SerializedName("CURRICULUM_VITAE") val cURRICULUMVITAE: String,
            @SerializedName("DEGREE") val dEGREE: String,
            @SerializedName("DEPARTMENT") val dEPARTMENT: String,
            @SerializedName("DEPARTMENT_ID") val dEPARTMENTID: String,
            @SerializedName("DISTRICT") val dISTRICT: String,
            @SerializedName("DOT") val dOT: String,
            @SerializedName("EMAIL") val eMAIL: String,
            @SerializedName("EMAIL_COMPANY") val eMAILCOMPANY: String,
            @SerializedName("EMAIL_HEADER") val eMAILHEADER: String,
            @SerializedName("EMPLOYEE_AT") val eMPLOYEEAT: String,
            @SerializedName("EMPLOYEE_CODE") val eMPLOYEECODE: String,
            @SerializedName("EMPLOYEES_FAMILY") val eMPLOYEESFAMILY: String,
            @SerializedName("END_DATE") val eNDDATE: String,
            @SerializedName("ETHNICITY") val eTHNICITY: String,
            @SerializedName("EXTENSION_CONTRACT_NUMBER") val eXTENSIONCONTRACTNUMBER: String,
            @SerializedName("EXTENSION_CONTRACT_START_DATE") val eXTENSIONCONTRACTSTARTDATE: String,
            @SerializedName("EXTENSION_CONTRACT_TIME") val eXTENSIONCONTRACTTIME: String,
            @SerializedName("FACEBOOK_LINK") val fACEBOOKLINK: String,
            @SerializedName("FILTER_BY_NAME_CODE_PLACEHOLDER") val fILTERBYNAMECODEPLACEHOLDER: String,
            @SerializedName("FILTER_BY_NAME_EMAIL_PLACEHOLDER") val fILTERBYNAMEEMAILPLACEHOLDER: String,
            @SerializedName("FOREIGN_LANGUAGE_LEVEL") val fOREIGNLANGUAGELEVEL: String,
            @SerializedName("FULL_NAME") val fULLNAME: String,
            @SerializedName("GENDER") val gENDER: String,
            @SerializedName("GROUP") val gROUP: String,
            @SerializedName("HEALTH_CERTIFICATE") val hEALTHCERTIFICATE: String,
            @SerializedName("HISTORY_UPDATE") val hISTORYUPDATE: String,
            @SerializedName("HISTORY_UPDATE_COUNT") val hISTORYUPDATECOUNT: String,
            @SerializedName("HOST") val hOST: String,
            @SerializedName("ID") val iD: String,
            @SerializedName("IDENTIFICATION_DATE") val iDENTIFICATIONDATE: String,
            @SerializedName("IDENTIFICATION_NUMBER") val iDENTIFICATIONNUMBER: String,
            @SerializedName("IDENTIFICATION_PLACE_OF") val iDENTIFICATIONPLACEOF: String,
            @SerializedName("INFORMATION_BANK_ACCOUNT") val iNFORMATIONBANKACCOUNT: String,
            @SerializedName("INFORMATION_CHILDREN") val iNFORMATIONCHILDREN: String,
            @SerializedName("INSURANCE") val iNSURANCE: String,
            @SerializedName("INSURANCE_ID") val iNSURANCEID: String,
            @SerializedName("JOB_STATUS") val jOBSTATUS: String,
            @SerializedName("JOB_STATUS_ID") val jOBSTATUSID: String,
            @SerializedName("LABOR_CONTRACT_NUMBER") val lABORCONTRACTNUMBER: String,
            @SerializedName("LABOR_CONTRACT_START_DATE") val lABORCONTRACTSTARTDATE: String,
            @SerializedName("LABOR_CONTRACT_TIME") val lABORCONTRACTTIME: String,
            @SerializedName("LANGUAGE_CERTIFICATE") val lANGUAGECERTIFICATE: String,
            @SerializedName("LEVEL") val lEVEL: String,
            @SerializedName("LICENSE_PLATES") val lICENSEPLATES: String,
            @SerializedName("MAJORS") val mAJORS: String,
            @SerializedName("MARITAL_STATUS") val mARITALSTATUS: String,
            @SerializedName("MEDICAL_FACILITY") val mEDICALFACILITY: String,
            @SerializedName("MEMBER_OF_FAMILY") val mEMBEROFFAMILY: String,
            @SerializedName("MONTH_OF_BIRTH") val mONTHOFBIRTH: String,
            @SerializedName("MONTH_OF_CHECK_IN") val mONTHOFCHECKIN: String,
            @SerializedName("NAME") val nAME: String,
            @SerializedName("NAME_COMPANY") val nAMECOMPANY: String,
            @SerializedName("NAME_HOST") val nAMEHOST: String,
            @SerializedName("OFFICE") val oFFICE: String,
            @SerializedName("OFFICE_ID") val oFFICEID: String,
            @SerializedName("OFFICIAL_DATE") val oFFICIALDATE: String,
            @SerializedName("OTHER_CERTIFICATE") val oTHERCERTIFICATE: String,
            @SerializedName("PERMANENT") val pERMANENT: String,
            @SerializedName("PERMANENT_ADDRESS") val pERMANENTADDRESS: String,
            @SerializedName("PERSONAL_EMAIL") val pERSONALEMAIL: String,
            @SerializedName("PHONE_CONTACT_USER") val pHONECONTACTUSER: String,
            @SerializedName("PHONE_NUMBER") val pHONENUMBER: String,
            @SerializedName("PLACE_OF_BIRTH") val pLACEOFBIRTH: String,
            @SerializedName("POSITION") val pOSITION: String,
            @SerializedName("POSITION_ID") val pOSITIONID: String,
            @SerializedName("POSITIONS") val pOSITIONS: String,
            @SerializedName("PROBATIONARY_CONTRACT_NUMBER") val pROBATIONARYCONTRACTNUMBER: String,
            @SerializedName("PROBATIONARY_CONTRACT_START_DATE") val pROBATIONARYCONTRACTSTARTDATE: String,
            @SerializedName("PROBATIONARY_CONTRACT_TIME") val pROBATIONARYCONTRACTTIME: String,
            @SerializedName("PROBATIONARY_DATE") val pROBATIONARYDATE: String,
            @SerializedName("PROJECT") val pROJECT: String,
            @SerializedName("PROVINCE") val pROVINCE: String,
            @SerializedName("PROVINCIAL") val pROVINCIAL: String,
            @SerializedName("RANGE_OF_VEHICLE") val rANGEOFVEHICLE: String,
            @SerializedName("REASON") val rEASON: String,
            @SerializedName("REGISTER_PARKING") val rEGISTERPARKING: String,
            @SerializedName("REGISTER_UPDATE") val rEGISTERUPDATE: String,
            @SerializedName("REGISTRATION_BOOK") val rEGISTRATIONBOOK: String,
            @SerializedName("RELATIONSHIP") val rELATIONSHIP: String,
            @SerializedName("RELATIONSHIP_HOST") val rELATIONSHIPHOST: String,
            @SerializedName("REQUEST_OT_TYPE") val rEQUESTOTTYPE: String,
            @SerializedName("SCHOOL_NAME") val sCHOOLNAME: String,
            @SerializedName("SERVICE_CONTRACT_NUMBER") val sERVICECONTRACTNUMBER: String,
            @SerializedName("SERVICE_CONTRACT_START_DATE") val sERVICECONTRACTSTARTDATE: String,
            @SerializedName("SERVICE_CONTRACT_TIME") val sERVICECONTRACTTIME: String,
            @SerializedName("SKYPE_ACCOUNT") val sKYPEACCOUNT: String,
            @SerializedName("SPECIALIZE") val sPECIALIZE: String,
            @SerializedName("SPECIALIZED_CERTIFICATE") val sPECIALIZEDCERTIFICATE: String,
            @SerializedName("SPECIALIZE_ID") val sPECIALIZEID: String,
            @SerializedName("START_COLLABORATORS") val sTARTCOLLABORATORS: String,
            @SerializedName("START_DATE") val sTARTDATE: String,
            @SerializedName("START_INTERN") val sTARTINTERN: String,
            @SerializedName("STATUS") val sTATUS: String,
            @SerializedName("TAX_CODE") val tAXCODE: String,
            @SerializedName("TEMPORARY") val tEMPORARY: String,
            @SerializedName("TEMPORARY_ADDRESS") val tEMPORARYADDRESS: String,
            @SerializedName("UPDATED_AT") val uPDATEDAT: String,
            @SerializedName("VILLAGE") val vILLAGE: String,
            @SerializedName("WARDS") val wARDS: String,
            @SerializedName("WORK_ADDRESS") val wORKADDRESS: String,
            @SerializedName("WORKING_STATUS") val wORKINGSTATUS: String,
            @SerializedName("WORKING_STATUS_ID") val wORKINGSTATUSID: String,
            @SerializedName("YEAR_OF_BIRTH") val yEAROFBIRTH: String,
            @SerializedName("YEAR_OF_CHECK_IN") val yEAROFCHECKIN: String
        )

        data class PLACEHOLDER(
            @SerializedName("CONTACT_USER") val cONTACTUSER: String,
            @SerializedName("MARITAL_STATUS") val mARITALSTATUS: String,
            @SerializedName("RELATIONSHIP_HOST") val rELATIONSHIPHOST: String
        )

        data class TABLES(
            @SerializedName("ADDRESS") val aDDRESS: String,
            @SerializedName("CATEGORY") val cATEGORY: String,
            @SerializedName("CONTRACTS") val cONTRACTS: String,
            @SerializedName("CUSTOM") val cUSTOM: String,
            @SerializedName("DEPARTMENT") val dEPARTMENT: String,
            @SerializedName("EMPLOYEES") val eMPLOYEES: String,
            @SerializedName("JOB_STATUS") val jOBSTATUS: String,
            @SerializedName("OFFICES") val oFFICES: String,
            @SerializedName("POSITIONS") val pOSITIONS: String,
            @SerializedName("SPECIALIZES") val sPECIALIZES: String,
            @SerializedName("WORKING_STATUS") val wORKINGSTATUS: String
        )
    }

    data class ERRORS(
        @SerializedName("EMPLOYEE_CODE_ERC008") val eMPLOYEECODEERC008: String,
        @SerializedName("EMPLOYEE_EMAIL_ERC008") val eMPLOYEEEMAILERC008: String,
        @SerializedName("ER0009") val eR0009: String,
        @SerializedName("ER00091") val eR00091: String,
        @SerializedName("ER00092") val eR00092: String,
        @SerializedName("ER00093") val eR00093: String,
        @SerializedName("ER00094") val eR00094: String,
        @SerializedName("ER0010") val eR0010: String,
        @SerializedName("ER0011") val eR0011: String,
        @SerializedName("ER00111") val eR00111: String,
        @SerializedName("ER0025") val eR0025: String,
        @SerializedName("ER0029") val eR0029: String,
        @SerializedName("ER0123") val eR0123: String,
        @SerializedName("ER0124") val eR0124: String,
        @SerializedName("ER0125") val eR0125: String,
        @SerializedName("ER0126") val eR0126: String,
        @SerializedName("ER0127") val eR0127: String,
        @SerializedName("ER0130") val eR0130: String,
        @SerializedName("ER0131") val eR0131: String,
        @SerializedName("ERC008") val eRC008: String,
        @SerializedName("import fail") val importFail: String
    )

    data class EXAMDATA(
        @SerializedName("DATE") val dATE: String,
        @SerializedName("DEPARTMENT") val dEPARTMENT: String,
        @SerializedName("ID") val iD: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("NUMBER") val nUMBER: String,
        @SerializedName("STATUS") val sTATUS: String,
        @SerializedName("TITLE") val tITLE: String
    )

    data class EXPORTFILE(
        @SerializedName("ALL_ITEMS") val aLLITEMS: String,
        @SerializedName("BTN_CANCEL") val bTNCANCEL: String,
        @SerializedName("BTN_EXPORT") val bTNEXPORT: String,
        @SerializedName("DATE") val dATE: String,
        @SerializedName("EXCEL") val eXCEL: String,
        @SerializedName("ONLY_DISPLAYED_ITEMS") val oNLYDISPLAYEDITEMS: String,
        @SerializedName("TEMPLATE_ONLY") val tEMPLATEONLY: String
    )

    data class FILES(
        @SerializedName("EXCEL") val eXCEL: String
    )

    data class GRANTRULEREQUESTEMPLOYEE(
        @SerializedName("AFTER_DAY") val aFTERDAY: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("FROM") val fROM: String,
        @SerializedName("FROM_ID") val fROMID: String,
        @SerializedName("ID") val iD: String,
        @SerializedName("LIST_RULE_TITLE") val lISTRULETITLE: String,
        @SerializedName("RULES") val rULES: String,
        @SerializedName("RULES_NAME") val rULESNAME: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("TO") val tO: String,
        @SerializedName("TO_ID") val tOID: String,
        @SerializedName("TYPE") val tYPE: String
    ) {
        data class ERRORS(
            @SerializedName("REQUIRED") val rEQUIRED: String
        )
    }

    data class GRANTRULETIMESHEETEMPLOYEE(
        @SerializedName("ADD") val aDD: String,
        @SerializedName("APPLICABLE_DATE") val aPPLICABLEDATE: String,
        @SerializedName("APPROVAL_BY") val aPPROVALBY: String,
        @SerializedName("APPROVAL_FOR") val aPPROVALFOR: String,
        @SerializedName("EDIT") val eDIT: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("ID") val iD: String,
        @SerializedName("LIST_RULE_TITLE") val lISTRULETITLE: String,
        @SerializedName("PROJECT_DEPARTMENT") val pROJECTDEPARTMENT: String,
        @SerializedName("RULES_NAME") val rULESNAME: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("TYPE") val tYPE: String
    ) {
        data class ERRORS(
            @SerializedName("ER0021") val eR0021: String,
            @SerializedName("REQUIRED") val rEQUIRED: String
        )
    }

    data class HISTORYUPDATE(
        @SerializedName("ALL_HISTORY") val aLLHISTORY: String,
        @SerializedName("APPROVE_ERROR_CONTENT") val aPPROVEERRORCONTENT: String,
        @SerializedName("APPROVE_ERROR_TITLE") val aPPROVEERRORTITLE: String,
        @SerializedName("CANCEL") val cANCEL: String,
        @SerializedName("EMPLOYEE_CODE") val eMPLOYEECODE: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("ID") val iD: String,
        @SerializedName("MY_HISTORY") val mYHISTORY: String,
        @SerializedName("STATUS") val sTATUS: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("TITLE_ADD") val tITLEADD: String,
        @SerializedName("TITLE_APPROVE") val tITLEAPPROVE: String,
        @SerializedName("TITLE_DETAIL") val tITLEDETAIL: String,
        @SerializedName("TITLE_EDIT") val tITLEEDIT: String,
        @SerializedName("UPDATE_DATE") val uPDATEDATE: String
    ) {
        data class ERRORS(
            @SerializedName("BANK_NUMBER") val bANKNUMBER: BANKNUMBER,
            @SerializedName("BANK_USER_NAME") val bANKUSERNAME: BANKUSERNAME,
            @SerializedName("IDENTIFICATION_NUMBER") val iDENTIFICATIONNUMBER: IDENTIFICATIONNUMBER,
            @SerializedName("IDENTIFICATION_PLACE_OF") val iDENTIFICATIONPLACEOF: IDENTIFICATIONPLACEOF,
            @SerializedName("NAME_HOST") val nAMEHOST: NAMEHOST,
            @SerializedName("PHONE_CONTACT_USER") val pHONECONTACTUSER: PHONECONTACTUSER,
            @SerializedName("PHONE_NUMBER") val pHONENUMBER: PHONENUMBER,
            @SerializedName("PLACE_OF_BIRTH") val pLACEOFBIRTH: PLACEOFBIRTH,
            @SerializedName("SCHOOL_NAME") val sCHOOLNAME: SCHOOLNAME,
            @SerializedName("TAX_CODE") val tAXCODE: TAXCODE
        ) {
            data class BANKNUMBER(
                @SerializedName("PATTERN") val pATTERN: String
            )

            data class BANKUSERNAME(
                @SerializedName("PATTERN") val pATTERN: String
            )

            data class IDENTIFICATIONNUMBER(
                @SerializedName("PATTERN") val pATTERN: String
            )

            data class IDENTIFICATIONPLACEOF(
                @SerializedName("PATTERN") val pATTERN: String
            )

            data class NAMEHOST(
                @SerializedName("PATTERN") val pATTERN: String
            )

            data class PHONECONTACTUSER(
                @SerializedName("PATTERN") val pATTERN: String
            )

            data class PHONENUMBER(
                @SerializedName("PATTERN") val pATTERN: String
            )

            data class PLACEOFBIRTH(
                @SerializedName("PATTERN") val pATTERN: String
            )

            data class SCHOOLNAME(
                @SerializedName("PATTERN") val pATTERN: String
            )

            data class TAXCODE(
                @SerializedName("PATTERN") val pATTERN: String
            )
        }
    }

    data class JOBSTATUS(
        @SerializedName("CODE") val cODE: String,
        @SerializedName("DESCRIPTION") val dESCRIPTION: String,
        @SerializedName("ID") val iD: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("TITLE") val tITLE: String
    )

    data class LEAVEREQUEST(
        @SerializedName("ADD_TITLE") val aDDTITLE: String,
        @SerializedName("AGREE") val aGREE: String,
        @SerializedName("ALL_LEAVE") val aLLLEAVE: String,
        @SerializedName("APPROVAL_INFO") val aPPROVALINFO: String,
        @SerializedName("APPROVAL_INFO_TITTLE") val aPPROVALINFOTITTLE: String,
        @SerializedName("APPROVE") val aPPROVE: String,
        @SerializedName("APPROVE_STATUS") val aPPROVESTATUS: String,
        @SerializedName("ARRIVE_LATE") val aRRIVELATE: String,
        @SerializedName("BACK") val bACK: String,
        @SerializedName("BACKUP_PEOPLE") val bACKUPPEOPLE: String,
        @SerializedName("CHECK_IN") val cHECKIN: String,
        @SerializedName("CHECK_IN_TIME") val cHECKINTIME: String,
        @SerializedName("CHECK_OUT") val cHECKOUT: String,
        @SerializedName("CHECK_OUT_TIME") val cHECKOUTTIME: String,
        @SerializedName("CLOSE") val cLOSE: String,
        @SerializedName("DATE") val dATE: String,
        @SerializedName("DATE_REQUEST") val dATEREQUEST: String,
        @SerializedName("DAY_OFF") val dAYOFF: String,
        @SerializedName("DAY_REMEMBER") val dAYREMEMBER: String,
        @SerializedName("DAY_WORK_FROM_HOME") val dAYWORKFROMHOME: String,
        @SerializedName("DAY_WORKING_OUT") val dAYWORKINGOUT: String,
        @SerializedName("DEPARTMENT") val dEPARTMENT: String,
        @SerializedName("DESCRIPTION") val dESCRIPTION: String,
        @SerializedName("DETAIL_TITLE") val dETAILTITLE: String,
        @SerializedName("EDIT_TITLE") val eDITTITLE: String,
        @SerializedName("EMAIL") val eMAIL: String,
        @SerializedName("EMPLOYEE_CODE") val eMPLOYEECODE: String,
        @SerializedName("EMPLOYEES_CODE") val eMPLOYEESCODE: String,
        @SerializedName("EMPLOYEES_REPLACE") val eMPLOYEESREPLACE: String,
        @SerializedName("END_DATE") val eNDDATE: String,
        @SerializedName("END_TIME") val eNDTIME: String,
        @SerializedName("END_TIME_TITTLE") val eNDTIMETITTLE: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("FROM_DATE") val fROMDATE: String,
        @SerializedName("FROM_TIME") val fROMTIME: String,
        @SerializedName("HT") val hT: String,
        @SerializedName("IM_EX_TITLE") val iMEXTITLE: String,
        @SerializedName("LEAVE_EARLY") val lEAVEEARLY: String,
        @SerializedName("MY_LEAVE") val mYLEAVE: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("NEW") val nEW: String,
        @SerializedName("REASON") val rEASON: String,
        @SerializedName("REASON_DETAIL") val rEASONDETAIL: String,
        @SerializedName("REASON_ID") val rEASONID: String,
        @SerializedName("REASON_NAME") val rEASONNAME: String,
        @SerializedName("REJECT") val rEJECT: String,
        @SerializedName("REJECT_REASON") val rEJECTREASON: String,
        @SerializedName("SAVE") val sAVE: String,
        @SerializedName("SEARCH_NAME_DEPARTMENT") val sEARCHNAMEDEPARTMENT: String,
        @SerializedName("SEARCH_NAME_OR_ID") val sEARCHNAMEORID: String,
        @SerializedName("SEND_LEAVE_REQUEST") val sENDLEAVEREQUEST: String,
        @SerializedName("START_DATE") val sTARTDATE: String,
        @SerializedName("START_TIME") val sTARTTIME: String,
        @SerializedName("START_TIME_TITTLE") val sTARTTIMETITTLE: String,
        @SerializedName("STATUS") val sTATUS: String,
        @SerializedName("TIME_CAN_USE") val tIMECANUSE: String,
        @SerializedName("TIME_REQUEST") val tIMEREQUEST: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("TO_DATE") val tODATE: String,
        @SerializedName("TOTAL_REQUEST_WAITING") val tOTALREQUESTWAITING: String,
        @SerializedName("TO_TIME") val tOTIME: String,
        @SerializedName("TYPE") val tYPE: String,
        @SerializedName("TYPE_DETAIL") val tYPEDETAIL: String,
        @SerializedName("TYPE_TITLE") val tYPETITLE: String,
        @SerializedName("WORK_FROM_HOME_AFTERNOON") val wORKFROMHOMEAFTERNOON: String,
        @SerializedName("WORK_FROM_HOME_ALL_DAY") val wORKFROMHOMEALLDAY: String,
        @SerializedName("WORK_FROM_HOME_MORNING") val wORKFROMHOMEMORNING: String,
        @SerializedName("WORKING_IN_THE_AFTERNOON") val wORKINGINTHEAFTERNOON: String,
        @SerializedName("WORKING_IN_THE_MORNING") val wORKINGINTHEMORNING: String,
        @SerializedName("WORKING_OUT_ALL_DAY") val wORKINGOUTALLDAY: String,
        @SerializedName("WORKING_OUT_ON_WORK_TIME") val wORKINGOUTONWORKTIME: String
    ) {
        data class ERRORS(
            @SerializedName("EMAIL_FAIL") val eMAILFAIL: String,
            @SerializedName("ER0025") val eR0025: String,
            @SerializedName("ER0026") val eR0026: String,
            @SerializedName("ER0031") val eR0031: String,
            @SerializedName("INVALIDATED") val iNVALIDATED: String,
            @SerializedName("INVALIDATED_DATE") val iNVALIDATEDDATE: String,
            @SerializedName("INVALIDATED_HOUR") val iNVALIDATEDHOUR: String,
            @SerializedName("INVALID_TYPE") val iNVALIDTYPE: String,
            @SerializedName("MAX_START_DATE") val mAXSTARTDATE: String,
            @SerializedName("MIN_END_DATE") val mINENDDATE: String,
            @SerializedName("NUMBER_ONLY") val nUMBERONLY: String,
            @SerializedName("OVER_DATE_CONTENT") val oVERDATECONTENT: String,
            @SerializedName("OVER_DATE_TITLE") val oVERDATETITLE: String,
            @SerializedName("OVER_HOUR") val oVERHOUR: String,
            @SerializedName("WFH_OVER_THE_NUMBER_OF_HOUR") val wFHOVERTHENUMBEROFHOUR: String
        )
    }

    data class LOGINPAGE(
        @SerializedName("EMAIL") val eMAIL: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("ERROR_TITTLE") val eRRORTITTLE: String,
        @SerializedName("FORGOT_PASSWORD") val fORGOTPASSWORD: String,
        @SerializedName("FORGOT_PASSWORD_CONFIRM_MESSAGE") val fORGOTPASSWORDCONFIRMMESSAGE: String,
        @SerializedName("FORGOT_PASSWORD_LABEL_CONTENT") val fORGOTPASSWORDLABELCONTENT: String,
        @SerializedName("FORGOT_PASSWORD_TITLE") val fORGOTPASSWORDTITLE: String,
        @SerializedName("LOGIN") val lOGIN: String,
        @SerializedName("PASSWORD") val pASSWORD: String,
        @SerializedName("SENDING_EMAIL") val sENDINGEMAIL: String,
        @SerializedName("USER_DELETED") val uSERDELETED: String,
        @SerializedName("USER_NAME") val uSERNAME: String
    ) {
        data class ERRORS(
            @SerializedName("EMAIL_REQUIRED") val eMAILREQUIRED: String,
            @SerializedName("ER0003") val eR0003: String,
            @SerializedName("ER0004") val eR0004: String,
            @SerializedName("ER005_CONTENT") val eR005CONTENT: String,
            @SerializedName("ER005_TITTLE") val eR005TITTLE: String,
            @SerializedName("FORGET_PASSWORD_ERROR_CONTENT") val fORGETPASSWORDERRORCONTENT: String,
            @SerializedName("FORGET_PASSWORD_ERROR_TITTLE") val fORGETPASSWORDERRORTITTLE: String,
            @SerializedName("PASSWORD_REQUIRED") val pASSWORDREQUIRED: String,
            @SerializedName("PATTERN") val pATTERN: String
        )
    }

    data class MANAGEMENTHOLIDAY(
        @SerializedName("CLEAR") val cLEAR: String,
        @SerializedName("CLEAR_OT") val cLEAROT: String,
        @SerializedName("DATE") val dATE: String,
        @SerializedName("DAY_NUMBER") val dAYNUMBER: String,
        @SerializedName("EMAIL") val eMAIL: String,
        @SerializedName("EMPLOYEE_CODE") val eMPLOYEECODE: String,
        @SerializedName("EMPLOYEE_ID") val eMPLOYEEID: String,
        @SerializedName("EMPLOYEE_NAME") val eMPLOYEENAME: String,
        @SerializedName("END_TIME") val eNDTIME: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("EXPORT_EXCEL_TITLE") val eXPORTEXCELTITLE: String,
        @SerializedName("ID") val iD: String,
        @SerializedName("IM_EX_TITLE") val iMEXTITLE: String,
        @SerializedName("LEAVE_LAST_YEAR") val lEAVELASTYEAR: String,
        @SerializedName("LEAVE_THIS_YEAR") val lEAVETHISYEAR: String,
        @SerializedName("MESSAGE") val mESSAGE: String,
        @SerializedName("MONTH") val mONTH: String,
        @SerializedName("MONTH_CLEAR_OT") val mONTHCLEAROT: String,
        @SerializedName("MONTH_YEAR") val mONTHYEAR: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("NUMBER") val nUMBER: String,
        @SerializedName("NUMBER_MINUTE") val nUMBERMINUTE: String,
        @SerializedName("NUMBER_USED") val nUMBERUSED: String,
        @SerializedName("OT_CLEAR_TITLE") val oTCLEARTITLE: String,
        @SerializedName("OT_LAST_YEAR") val oTLASTYEAR: String,
        @SerializedName("OT_THIS_YEAR") val oTTHISYEAR: String,
        @SerializedName("REASON") val rEASON: String,
        @SerializedName("RELOAD_CONTENT") val rELOADCONTENT: String,
        @SerializedName("RELOAD_OT_CONTENT") val rELOADOTCONTENT: String,
        @SerializedName("RELOAD_OT_TITLE") val rELOADOTTITLE: String,
        @SerializedName("RELOAD_SAVE_SUCCESSFUL") val rELOADSAVESUCCESSFUL: String,
        @SerializedName("RELOAD_TITLE") val rELOADTITLE: String,
        @SerializedName("START_TIME") val sTARTTIME: String,
        @SerializedName("TIME_TO_DATE") val tIMETODATE: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("TITLE_CLEAR") val tITLECLEAR: String,
        @SerializedName("TITLE_CONFIRM_PASS") val tITLECONFIRMPASS: String,
        @SerializedName("TYPE") val tYPE: String,
        @SerializedName("UNIT") val uNIT: String,
        @SerializedName("YEAR") val yEAR: String,
        @SerializedName("YEAR_CLEAR_OT") val yEARCLEAROT: String
    ) {
        data class ERRORS(
            @SerializedName("ER0010") val eR0010: String,
            @SerializedName("MAXLENGTH") val mAXLENGTH: String,
            @SerializedName("MINLENGTH") val mINLENGTH: String,
            @SerializedName("PATTERN") val pATTERN: String,
            @SerializedName("REQUIRED") val rEQUIRED: String
        )
    }

    data class MENUADMINISTRATION(
        @SerializedName("ADMIN") val aDMIN: String,
        @SerializedName("ASSIGN_ROLE") val aSSIGNROLE: String,
        @SerializedName("ROLE_ADMIN") val rOLEADMIN: String,
        @SerializedName("SET_APPROVE") val sETAPPROVE: String,
        @SerializedName("SET_ROLE") val sETROLE: String,
        @SerializedName("SET_ROLE_TIMESHEET") val sETROLETIMESHEET: String,
        @SerializedName("SYSTEM_SETTING") val sYSTEMSETTING: String,
        @SerializedName("USER") val uSER: String,
        @SerializedName("WORK_PLANS_GRANTS") val wORKPLANSGRANTS: String
    )

    data class MENUCATEGORIES(
        @SerializedName("CATEGORIES") val cATEGORIES: String,
        @SerializedName("CATEGORIES_OTHER") val cATEGORIESOTHER: String,
        @SerializedName("CATEGORY") val cATEGORY: String,
        @SerializedName("CATEGORY_DATA") val cATEGORYDATA: String,
        @SerializedName("CUSTOM") val cUSTOM: String,
        @SerializedName("DEPARTMENT") val dEPARTMENT: String,
        @SerializedName("GR_EMPLOYEE") val gREMPLOYEE: String,
        @SerializedName("JOB_STATUS") val jOBSTATUS: String,
        @SerializedName("JOB_TYPE") val jOBTYPE: String,
        @SerializedName("OFFICE") val oFFICE: String,
        @SerializedName("OFFICIAL_HOLIDAY") val oFFICIALHOLIDAY: String,
        @SerializedName("POSITION") val pOSITION: String,
        @SerializedName("PROJECT") val pROJECT: String,
        @SerializedName("SCREEN") val sCREEN: String,
        @SerializedName("SPECIALIZE") val sPECIALIZE: String
    )

    data class MENUMOBILEAPP(
        @SerializedName("ANDROID") val aNDROID: String,
        @SerializedName("IOS") val iOS: String,
        @SerializedName("MOBILE_APP") val mOBILEAPP: String
    )

    data class MENUOT(
        @SerializedName("LEAVE_REQUEST_TYPE") val lEAVEREQUESTTYPE: String,
        @SerializedName("LEAVE_TYPE") val lEAVETYPE: String,
        @SerializedName("OT_LEAVE") val oTLEAVE: String,
        @SerializedName("OVER_TIME") val oVERTIME: String
    )

    data class MENUTIMEKEEPING(
        @SerializedName("BROWSE_DATA_TIMEKEEPING") val bROWSEDATATIMEKEEPING: String,
        @SerializedName("DATA_KEEPING") val dATAKEEPING: String,
        @SerializedName("DATA_TIMEKEEPING") val dATATIMEKEEPING: String,
        @SerializedName("DETAIL_WORK_PLAN") val dETAILWORKPLAN: String,
        @SerializedName("EXCEPTION_DAY") val eXCEPTIONDAY: String,
        @SerializedName("MANAGE_TIMEKEEPING") val mANAGETIMEKEEPING: String,
        @SerializedName("MY_TIMEKEEPING") val mYTIMEKEEPING: String,
        @SerializedName("RULE_HOLIDAYS") val rULEHOLIDAYS: String,
        @SerializedName("STATISTICAL_OT") val sTATISTICALOT: String,
        @SerializedName("TIMEKEPPING") val tIMEKEPPING: String,
        @SerializedName("TIMESHEETS_PERSONAL") val tIMESHEETSPERSONAL: String,
        @SerializedName("TIMESHEETS_TOTAL") val tIMESHEETSTOTAL: String,
        @SerializedName("WORK_PLAN") val wORKPLAN: String
    )

    data class MENUTRAINING(
        @SerializedName("LIST_COURSE") val lISTCOURSE: String,
        @SerializedName("TRAINING") val tRAINING: String
    )

    data class MENUUSERS(
        @SerializedName("ADMIN_CHANGE") val aDMINCHANGE: String,
        @SerializedName("EDIT_PROFILE") val eDITPROFILE: String,
        @SerializedName("IMPORT") val iMPORT: String,
        @SerializedName("MY_PROFILE") val mYPROFILE: String,
        @SerializedName("USER") val uSER: String,
        @SerializedName("USER_LIST") val uSERLIST: String
    )

    data class NOTFOUND(
        @SerializedName("MESSAGE") val mESSAGE: String, @SerializedName("TITLE") val tITLE: String
    )

    data class OFFICE(
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("ID") val iD: String,
        @SerializedName("IM_EX_TITLE") val iMEXTITLE: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("POSITION_ID") val pOSITIONID: String,
        @SerializedName("POSITION_NAME") val pOSITIONNAME: String,
        @SerializedName("TITLE") val tITLE: String
    ) {
        data class ERRORS(
            @SerializedName("REQUIRED") val rEQUIRED: String
        )
    }

    data class OFFICIALHOLIDAY(
        @SerializedName("DESCRIPTION") val dESCRIPTION: String,
        @SerializedName("END_DATE") val eNDDATE: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("ID") val iD: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("START_DATE") val sTARTDATE: String,
        @SerializedName("TITLE") val tITLE: String
    ) {
        data class ERRORS(
            @SerializedName("MAX_START_DATE") val mAXSTARTDATE: String,
            @SerializedName("MIN_END_DATE") val mINENDDATE: String
        )
    }

    data class OVERTIME(
        @SerializedName("ADD") val aDD: String,
        @SerializedName("AGREE") val aGREE: String,
        @SerializedName("APPROVE") val aPPROVE: String,
        @SerializedName("CLOSE") val cLOSE: String,
        @SerializedName("CLOSE_FORM") val cLOSEFORM: String,
        @SerializedName("DATE") val dATE: String,
        @SerializedName("DESCRIPTION") val dESCRIPTION: String,
        @SerializedName("EDIT") val eDIT: String,
        @SerializedName("EMPLOYEE_ID") val eMPLOYEEID: String,
        @SerializedName("EMPLOYEE_INFO_TITTLE") val eMPLOYEEINFOTITTLE: String,
        @SerializedName("END_TIME") val eNDTIME: String,
        @SerializedName("ERI_TITLE") val eRITITLE: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("EX_TITLE") val eXTITLE: String,
        @SerializedName("IM_EX_TITLE") val iMEXTITLE: String,
        @SerializedName("LINE") val lINE: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("NAME_COMPANY") val nAMECOMPANY: String,
        @SerializedName("NEW") val nEW: String,
        @SerializedName("NUMBER") val nUMBER: String,
        @SerializedName("OT_APPROVE") val oTAPPROVE: String,
        @SerializedName("OT_FORM") val oTFORM: String,
        @SerializedName("PLACEHOLDER_CREATED_AT") val pLACEHOLDERCREATEDAT: String,
        @SerializedName("PROJECT") val pROJECT: String,
        @SerializedName("REASON") val rEASON: String,
        @SerializedName("REFUSE") val rEFUSE: String,
        @SerializedName("REGIS_FORM") val rEGISFORM: String,
        @SerializedName("REJECT_REASON") val rEJECTREASON: String,
        @SerializedName("REJECT_TITLE") val rEJECTTITLE: String,
        @SerializedName("START_TIME") val sTARTTIME: String,
        @SerializedName("STATUS") val sTATUS: String,
        @SerializedName("SUM") val sUM: String,
        @SerializedName("TITLE_ADD") val tITLEADD: String,
        @SerializedName("TITLE_EDIT") val tITLEEDIT: String,
        @SerializedName("TITLE_LIST") val tITLELIST: String,
        @SerializedName("TITLE_VIEW") val tITLEVIEW: String,
        @SerializedName("TYPE") val tYPE: String,
        @SerializedName("USER_REQUEST") val uSERREQUEST: String,
        @SerializedName("WARNING") val wARNING: String
    ) {
        data class ERRORS(
            @SerializedName("EMAIL") val eMAIL: EMAIL,
            @SerializedName("EMPLOYEE_DUPLICATED_CONTENT") val eMPLOYEEDUPLICATEDCONTENT: String,
            @SerializedName("EMPLOYEE_DUPLICATED_TITLE") val eMPLOYEEDUPLICATEDTITLE: String,
            @SerializedName("END_DATE") val eNDDATE: ENDDATE,
            @SerializedName("ER0025") val eR0025: String,
            @SerializedName("ER0026") val eR0026: String,
            @SerializedName("ER0030") val eR0030: String,
            @SerializedName("ER0122") val eR0122: String,
            @SerializedName("INVALIDATED") val iNVALIDATED: String,
            @SerializedName("INVALIDATED_HOUR") val iNVALIDATEDHOUR: String,
            @SerializedName("INVALIDATED_TIME") val iNVALIDATEDTIME: INVALIDATEDTIME,
            @SerializedName("MAX_START_DATE") val mAXSTARTDATE: String,
            @SerializedName("MIN_END_DATE") val mINENDDATE: String,
            @SerializedName("OT_REQUIRED") val oTREQUIRED: String,
            @SerializedName("OVER_HOUR") val oVERHOUR: String,
            @SerializedName("PROJECT") val pROJECT: String,
            @SerializedName("PROJECT_NAME") val pROJECTNAME: PROJECTNAME,
            @SerializedName("START_DATE") val sTARTDATE: STARTDATE,
            @SerializedName("TYPE") val tYPE: TYPE
        ) {
            data class EMAIL(
                @SerializedName("ERI001") val eRI001: String
            )

            data class ENDDATE(
                @SerializedName("ER0030") val eR0030: String,
                @SerializedName("ERI009") val eRI009: String
            )

            data class INVALIDATEDTIME(
                @SerializedName("ER0026") val eR0026: String
            )

            data class PROJECTNAME(
                @SerializedName("ERI001") val eRI001: String,
                @SerializedName("ERI002") val eRI002: String
            )

            data class STARTDATE(
                @SerializedName("ER0025") val eR0025: String,
                @SerializedName("ERI003") val eRI003: String,
                @SerializedName("ERI004") val eRI004: String,
                @SerializedName("ERI005") val eRI005: String,
                @SerializedName("ERI006") val eRI006: String,
                @SerializedName("ERI007") val eRI007: String,
                @SerializedName("ERI008") val eRI008: String
            )

            data class TYPE(
                @SerializedName("ERI002") val eRI002: String
            )
        }
    }

    data class POSITIONS(
        @SerializedName("CONFIRM_SAVE") val cONFIRMSAVE: CONFIRMSAVE,
        @SerializedName("CREATED_AT") val cREATEDAT: String,
        @SerializedName("DELETED_AT") val dELETEDAT: String,
        @SerializedName("DESCRIPTION") val dESCRIPTION: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("ID") val iD: String,
        @SerializedName("IM_EX_TITLE") val iMEXTITLE: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("UPDATED_AT") val uPDATEDAT: String
    ) {
        data class CONFIRMSAVE(
            @SerializedName("ADD") val aDD: String,
            @SerializedName("CONFIRM") val cONFIRM: String,
            @SerializedName("DEL") val dEL: String,
            @SerializedName("TITLE") val tITLE: String,
            @SerializedName("UPDATE") val uPDATE: String
        )

        data class ERRORS(
            @SerializedName("MAXLENGTH") val mAXLENGTH: String,
            @SerializedName("MIN") val mIN: String
        )
    }

    data class PROJECT(
        @SerializedName("ADD_EMPLOYEE") val aDDEMPLOYEE: String,
        @SerializedName("ADD_GROUP") val aDDGROUP: String,
        @SerializedName("DESCRIPTION") val dESCRIPTION: String,
        @SerializedName("END_DATE") val eNDDATE: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("GROUP") val gROUP: String,
        @SerializedName("ID") val iD: String,
        @SerializedName("IM_EX_TITLE") val iMEXTITLE: String,
        @SerializedName("NUMBER") val nUMBER: String,
        @SerializedName("PROJECT_CLASSIFIED") val pROJECTCLASSIFIED: String,
        @SerializedName("PROJECT_CLASSIFY") val pROJECTCLASSIFY: String,
        @SerializedName("PROJECT_CODE") val pROJECTCODE: String,
        @SerializedName("PROJECT_NAME") val pROJECTNAME: String,
        @SerializedName("PROJECT_SIZE") val pROJECTSIZE: String,
        @SerializedName("PROJECT_TYPE") val pROJECTTYPE: String,
        @SerializedName("SCAN_REDMINE_BACKLOG") val sCANREDMINEBACKLOG: String,
        @SerializedName("START_DATE") val sTARTDATE: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("TITLE_DEPARTMENT") val tITLEDEPARTMENT: String,
        @SerializedName("TITLE_GROUP") val tITLEGROUP: String,
        @SerializedName("TITLE_PROJECT") val tITLEPROJECT: String
    ) {
        data class ERRORS(
            @SerializedName("GROUP_ID_ERC008") val gROUPIDERC008: String,
            @SerializedName("GROUP_ID_MESSAGE") val gROUPIDMESSAGE: String,
            @SerializedName("MALFORMED") val mALFORMED: String,
            @SerializedName("MAX_START_DATE") val mAXSTARTDATE: String,
            @SerializedName("MIN_END_DATE") val mINENDDATE: String,
            @SerializedName("PROJECT_CODE_ERC008") val pROJECTCODEERC008: String,
            @SerializedName("PROJECT_CODE_MESSAGE") val pROJECTCODEMESSAGE: String,
            @SerializedName("REQUIRED") val rEQUIRED: String
        )
    }

    data class RULEAPPROVALTIMESHEET(
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("SET_RULE_APPROVAL_TIMESHEET") val sETRULEAPPROVALTIMESHEET: String,
        @SerializedName("TITLE") val tITLE: String
    ) {
        data class ERRORS(
            @SerializedName("MAXLENGTH") val mAXLENGTH: String
        )
    }

    data class RULEHOLIDAYS(
        @SerializedName("APPLY") val aPPLY: String,
        @SerializedName("ID") val iD: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("NUMBER") val nUMBER: String,
        @SerializedName("REPEAT") val rEPEAT: String,
        @SerializedName("START_TIME") val sTARTTIME: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("TYPE") val tYPE: String,
        @SerializedName("UNIT") val uNIT: String
    )

    data class RULESAPPROVE(
        @SerializedName("COME_BACK_SOON") val cOMEBACKSOON: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("FORGOT_CHECKIN") val fORGOTCHECKIN: String,
        @SerializedName("FORGOT_CHECKOUT") val fORGOTCHECKOUT: String,
        @SerializedName("GO_OUT") val gOOUT: String,
        @SerializedName("ID") val iD: String,
        @SerializedName("LATE") val lATE: String,
        @SerializedName("LEAVE_MANY_DAYS") val lEAVEMANYDAYS: String,
        @SerializedName("LEAVE_ONE_DAY") val lEAVEONEDAY: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("OVER_TIME") val oVERTIME: String,
        @SerializedName("OVER_TIME_GM") val oVERTIMEGM: String,
        @SerializedName("SET_RULE_EMPLOYEE") val sETRULEEMPLOYEE: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("WORK_OUTSIDE") val wORKOUTSIDE: String
    ) {
        data class ERRORS(
            @SerializedName("NAME_REQUIRED") val nAMEREQUIRED: String
        )
    }

    data class RULEVIEWINFOS(
        @SerializedName("ACADEMIC_LEVEL") val aCADEMICLEVEL: String,
        @SerializedName("CUSTOM") val cUSTOM: String,
        @SerializedName("CUSTOM_INFORMATION") val cUSTOMINFORMATION: String,
        @SerializedName("DATE_WORKING") val dATEWORKING: String,
        @SerializedName("EMPLOYEE_INFO") val eMPLOYEEINFO: String,
        @SerializedName("EMPLOYEES_INFOS") val eMPLOYEESINFOS: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("ID") val iD: String,
        @SerializedName("INFO") val iNFO: String,
        @SerializedName("INFO_PERSONAL") val iNFOPERSONAL: String,
        @SerializedName("INFOS_BASIC") val iNFOSBASIC: String,
        @SerializedName("INFOS_CONTACT") val iNFOSCONTACT: String,
        @SerializedName("INFOS_CONTRACT") val iNFOSCONTRACT: String,
        @SerializedName("INSURANCE_INFOS") val iNSURANCEINFOS: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("NAME_FIELDS") val nAMEFIELDS: NAMEFIELDS,
        @SerializedName("PROFILE_INFOS") val pROFILEINFOS: String,
        @SerializedName("SET_RULE_VIEW_INFOS") val sETRULEVIEWINFOS: String,
        @SerializedName("TIMEKEEPING") val tIMEKEEPING: String,
        @SerializedName("TIME_KEEPING") val tIMEKEEPINGTABLE: String,
        @SerializedName("TITLE") val tITLE: String
    ) {
        data class ERRORS(
            @SerializedName("NAME_REQUIRED") val nAMEREQUIRED: String
        )

        data class NAMEFIELDS(
            @SerializedName("absent_permit") val absentPermit: String,
            @SerializedName("absent_without_permit") val absentWithoutPermit: String,
            @SerializedName("actual_work_day") val actualWorkDay: String,
            @SerializedName("address") val address: String,
            @SerializedName("address_host") val addressHost: String,
            @SerializedName("bank_branch") val bankBranch: String,
            @SerializedName("bank_name") val bankName: String,
            @SerializedName("bank_number") val bankNumber: String,
            @SerializedName("bank_user_name") val bankUserName: String,
            @SerializedName("birth_day") val birthDay: String,
            @SerializedName("birthday_host") val birthdayHost: String,
            @SerializedName("chatwork_account") val chatworkAccount: String,
            @SerializedName("check_in_date") val checkInDate: String,
            @SerializedName("check_out_date") val checkOutDate: String,
            @SerializedName("children_having") val childrenHaving: String,
            @SerializedName("company_id") val companyId: String,
            @SerializedName("conditions_ot") val conditionsOt: String,
            @SerializedName("confidentiality_contract") val confidentialityContract: String,
            @SerializedName("contact_user") val contactUser: String,
            @SerializedName("contract_end_date") val contractEndDate: String,
            @SerializedName("contract_number") val contractNumber: String,
            @SerializedName("contract_start_date") val contractStartDate: String,
            @SerializedName("contract_time") val contractTime: String,
            @SerializedName("contracts") val contracts: String,
            @SerializedName("contributor_start_date") val contributorStartDate: String,
            @SerializedName("copy_of_birth_certificate") val copyOfBirthCertificate: String,
            @SerializedName("copy_of_degree") val copyOfDegree: String,
            @SerializedName("copy_of_identify_card") val copyOfIdentifyCard: String,
            @SerializedName("copy_of_registration_book") val copyOfRegistrationBook: String,
            @SerializedName("curriculum_vitae") val curriculumVitae: String,
            @SerializedName("day_off_accumulated_in_month_ot") val dayOffAccumulatedInMonthOt: String,
            @SerializedName("day_off_accumulated_in_month_permit") val dayOffAccumulatedInMonthPermit: String,
            @SerializedName("day_off_accumulated_ot") val dayOffAccumulatedOt: String,
            @SerializedName("day_off_accumulated_permit") val dayOffAccumulatedPermit: String,
            @SerializedName("day_off_ot_with_pay_in_month") val dayOffOtWithPayInMonth: String,
            @SerializedName("day_off_remain_in_month_ot") val dayOffRemainInMonthOt: String,
            @SerializedName("day_off_remain_in_month_permit") val dayOffRemainInMonthPermit: String,
            @SerializedName("day_off_with_pay") val dayOffWithPay: String,
            @SerializedName("day_off_with_pay_in_month") val dayOffWithPayInMonth: String,
            @SerializedName("day_off_without_pay") val dayOffWithoutPay: String,
            @SerializedName("degree") val degree: String,
            @SerializedName("department") val department: String,
            @SerializedName("department_id") val departmentId: String,
            @SerializedName("departments") val departments: String,
            @SerializedName("diligence") val diligence: String,
            @SerializedName("email") val email: String,
            @SerializedName("employee_code") val employeeCode: String,
            @SerializedName("ethnicity") val ethnicity: String,
            @SerializedName("facebook_link") val facebookLink: String,
            @SerializedName("families") val families: String,
            @SerializedName("foreign_language_level") val foreignLanguageLevel: String,
            @SerializedName("full_name") val fullName: String,
            @SerializedName("gender") val gender: String,
            @SerializedName("health_certificate") val healthCertificate: String,
            @SerializedName("history_update_count") val historyUpdateCount: String,
            @SerializedName("identification_date") val identificationDate: String,
            @SerializedName("identification_number") val identificationNumber: String,
            @SerializedName("identification_place_of") val identificationPlaceOf: String,
            @SerializedName("insurance_id") val insuranceId: String,
            @SerializedName("internship_start_date") val internshipStartDate: String,
            @SerializedName("job_status") val jobStatus: String,
            @SerializedName("language_certificate") val languageCertificate: String,
            @SerializedName("license_plates") val licensePlates: String,
            @SerializedName("majors") val majors: String,
            @SerializedName("marital_status") val maritalStatus: String,
            @SerializedName("medical_facility") val medicalFacility: String,
            @SerializedName("month_of_birth") val monthOfBirth: String,
            @SerializedName("month_of_check_in") val monthOfCheckIn: String,
            @SerializedName("name_host") val nameHost: String,
            @SerializedName("note") val note: String,
            @SerializedName("offices") val offices: String,
            @SerializedName("official_working_day") val officialWorkingDay: String,
            @SerializedName("ot_info") val otInfo: String,
            @SerializedName("ot_number_payable") val otNumberPayable: String,
            @SerializedName("ot_on_holiday") val otOnHoliday: String,
            @SerializedName("ot_on_weekdays") val otOnWeekdays: String,
            @SerializedName("ot_on_weekend") val otOnWeekend: String,
            @SerializedName("other_certificate") val otherCertificate: String,
            @SerializedName("personal_email") val personalEmail: String,
            @SerializedName("phone_contact_user") val phoneContactUser: String,
            @SerializedName("phone_number") val phoneNumber: String,
            @SerializedName("place_of_birth") val placeOfBirth: String,
            @SerializedName("positions") val positions: String,
            @SerializedName("probationary_date") val probationaryDate: String,
            @SerializedName("profile_update_date") val profileUpdateDate: String,
            @SerializedName("range_of_vehicle") val rangeOfVehicle: String,
            @SerializedName("register_parking") val registerParking: String,
            @SerializedName("relationship_host") val relationshipHost: String,
            @SerializedName("school_name") val schoolName: String,
            @SerializedName("skype_account") val skypeAccount: String,
            @SerializedName("specialized_certificate") val specializedCertificate: String,
            @SerializedName("specializes") val specializes: String,
            @SerializedName("tax_code") val taxCode: String,
            @SerializedName("time_holiday") val timeHoliday: String,
            @SerializedName("time_holiday_on") val timeHolidayOn: String,
            @SerializedName("time_sheets") val timeSheets: String,
            @SerializedName("time_weekday") val timeWeekday: String,
            @SerializedName("time_weekday_on") val timeWeekdayOn: String,
            @SerializedName("time_weekday_ot_on") val timeWeekdayOtOn: String,
            @SerializedName("time_weekly") val timeWeekly: String,
            @SerializedName("time_weekly_on") val timeWeeklyOn: String,
            @SerializedName("work_address") val workAddress: String,
            @SerializedName("work_day") val workDay: String,
            @SerializedName("working_status") val workingStatus: String,
            @SerializedName("year_of_birth") val yearOfBirth: String,
            @SerializedName("year_of_check_in") val yearOfCheckIn: String
        )
    }

    data class SETRULES(
        @SerializedName("EMPLOYEE_SELECTED") val eMPLOYEESELECTED: String,
        @SerializedName("GROUP_SELECTED") val gROUPSELECTED: String,
        @SerializedName("NAME_RULE") val nAMERULE: String,
        @SerializedName("OBJECT_SELECTED") val oBJECTSELECTED: String,
        @SerializedName("TITLE") val tITLE: String
    )

    data class SETRULEVIEWINFOS(
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("FROM") val fROM: String,
        @SerializedName("FROM_ID") val fROMID: String,
        @SerializedName("ID") val iD: String,
        @SerializedName("RULE_ID") val rULEID: String,
        @SerializedName("RULES_NAME") val rULESNAME: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("TO") val tO: String,
        @SerializedName("TO_ID") val tOID: String,
        @SerializedName("TYPE") val tYPE: String
    ) {
        data class ERRORS(
            @SerializedName("REQUIRED") val rEQUIRED: String
        )
    }

    data class SPECIALIZE(
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("ID") val iD: String,
        @SerializedName("IM_EX_TITLE") val iMEXTITLE: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("OFFICE_ID") val oFFICEID: String,
        @SerializedName("OFFICE_NAME") val oFFICENAME: String,
        @SerializedName("TITLE") val tITLE: String
    ) {
        data class ERRORS(
            @SerializedName("REQUIRED") val rEQUIRED: String
        )
    }

    data class STATISTICALOT(
        @SerializedName("APPROVAL") val aPPROVAL: String,
        @SerializedName("APPROVE_TITLE") val aPPROVETITLE: String,
        @SerializedName("CONFIRM_APPROVE") val cONFIRMAPPROVE: String,
        @SerializedName("DEPARTMENT") val dEPARTMENT: String,
        @SerializedName("DESCRIPTION") val dESCRIPTION: String,
        @SerializedName("EMAIL") val eMAIL: String,
        @SerializedName("EMAIL_EMPLOYEE_CREATE") val eMAILEMPLOYEECREATE: String,
        @SerializedName("EMPLOYEE_CREATE") val eMPLOYEECREATE: String,
        @SerializedName("END_TIME") val eNDTIME: String,
        @SerializedName("HOLIDAY") val hOLIDAY: String,
        @SerializedName("HOLIDAY_AT_NIGHT") val hOLIDAYATNIGHT: String,
        @SerializedName("IM_EX_TITLE") val iMEXTITLE: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("NO_DATA") val nODATA: String,
        @SerializedName("OT_TYPE_NAME") val oTTYPENAME: String,
        @SerializedName("REJECT") val rEJECT: String,
        @SerializedName("REJECT_REASON") val rEJECTREASON: String,
        @SerializedName("REQUIRED_REJECT") val rEQUIREDREJECT: String,
        @SerializedName("START_TIME") val sTARTTIME: String,
        @SerializedName("STATISTICAL_OT_BTN") val sTATISTICALOTBTN: String,
        @SerializedName("STATISTICAL_OT_FAILURE") val sTATISTICALOTFAILURE: String,
        @SerializedName("STATISTICAL_OT_SUCCESSFUL") val sTATISTICALOTSUCCESSFUL: String,
        @SerializedName("STATUS") val sTATUS: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("TOTAL_HOLIDAY") val tOTALHOLIDAY: String,
        @SerializedName("TOTAL_OT") val tOTALOT: String,
        @SerializedName("TOTAL_WEEKDAY") val tOTALWEEKDAY: String,
        @SerializedName("TOTAL_WEEKEND") val tOTALWEEKEND: String,
        @SerializedName("WEEKDAY") val wEEKDAY: String,
        @SerializedName("WEEKDAY_NOT_OVERTIME") val wEEKDAYNOTOVERTIME: String,
        @SerializedName("WEEKDAY_OVERTIME") val wEEKDAYOVERTIME: String,
        @SerializedName("WEEKEND") val wEEKEND: String,
        @SerializedName("WEEKEND_AT_NIGHT") val wEEKENDATNIGHT: String,
        @SerializedName("WORK_AT") val wORKAT: String
    )

    data class SUCCESSES(
        @SerializedName("SC0009") val sC0009: String,
        @SerializedName("SC0010") val sC0010: String,
        @SerializedName("SC0011") val sC0011: String
    )

    data class SYSTEMSETTING(
        @SerializedName("CHARACTER") val cHARACTER: String,
        @SerializedName("CHILD_MARRIED") val cHILDMARRIED: String,
        @SerializedName("DATE") val dATE: String,
        @SerializedName("EMAIL") val eMAIL: String,
        @SerializedName("EMAIL_FORM") val eMAILFORM: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("EXPIRY_REPORT") val eXPIRYREPORT: String,
        @SerializedName("HOUR") val hOUR: String,
        @SerializedName("HR_EMAIL") val hREMAIL: String,
        @SerializedName("HR_NAME") val hRNAME: String,
        @SerializedName("LEAVE_DUE_DEATH") val lEAVEDUEDEATH: String,
        @SerializedName("LIMIT_DATE") val lIMITDATE: String,
        @SerializedName("LOG_REQUEST") val lOGREQUEST: String,
        @SerializedName("MARRIED") val mARRIED: String,
        @SerializedName("MONTH") val mONTH: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("OPEN_SYSTEM") val oPENSYSTEM: String,
        @SerializedName("OPEN_TIME") val oPENTIME: String,
        @SerializedName("OVERTIME") val oVERTIME: String,
        @SerializedName("OVERTIME_STANDARD") val oVERTIMESTANDARD: String,
        @SerializedName("PAID_LEAVE") val pAIDLEAVE: String,
        @SerializedName("RESPOND_DATE") val rESPONDDATE: String,
        @SerializedName("RESPOND_TIME") val rESPONDTIME: String,
        @SerializedName("SALARY_EMAIL_SETTING_INFO") val sALARYEMAILSETTINGINFO: String,
        @SerializedName("TEMPLATE_EMAIL") val tEMPLATEEMAIL: String,
        @SerializedName("TIME_AUTO_OFF") val tIMEAUTOOFF: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("TO") val tO: String,
        @SerializedName("WIFE_BORN") val wIFEBORN: String,
        @SerializedName("YEAR") val yEAR: String
    ) {
        data class ERRORS(
            @SerializedName("INVALIDATED") val iNVALIDATED: String,
            @SerializedName("MALFORMED") val mALFORMED: String,
            @SerializedName("MAX_START_DATE") val mAXSTARTDATE: String,
            @SerializedName("MIN_END_DATE") val mINENDDATE: String
        )
    }

    data class TABLEFIELDS(
        @SerializedName("FIELD") val fIELD: String,
        @SerializedName("ID") val iD: String,
        @SerializedName("TABLE") val tABLE: String,
        @SerializedName("TITLE") val tITLE: String
    )

    data class TEMPLATES(
        @SerializedName("IMPORT") val iMPORT: String
    )

    data class TIMEKEEPING(
        @SerializedName("ACTIONS") val aCTIONS: String,
        @SerializedName("ADD_LEAVE_REQUEST") val aDDLEAVEREQUEST: String,
        @SerializedName("ADD_LOG_TIME") val aDDLOGTIME: String,
        @SerializedName("ADD_NOTE") val aDDNOTE: String,
        @SerializedName("BCC_STATISTIC") val bCCSTATISTIC: String,
        @SerializedName("BCC_STATISTIC_FAILURE") val bCCSTATISTICFAILURE: String,
        @SerializedName("BCC_STATISTIC_SUCCESSFUL") val bCCSTATISTICSUCCESSFUL: String,
        @SerializedName("CALC_SALARY_HOLIDAY") val cALCSALARYHOLIDAY: String,
        @SerializedName("CALC_SALARY_WEEKDAY") val cALCSALARYWEEKDAY: String,
        @SerializedName("CALC_SALARY_WEEKEND") val cALCSALARYWEEKEND: String,
        @SerializedName("CHECK_IN_DATE") val cHECKINDATE: String,
        @SerializedName("CHOOSING_MONTH") val cHOOSINGMONTH: String,
        @SerializedName("CODE") val cODE: String,
        @SerializedName("COMPLEMENTARY") val cOMPLEMENTARY: String,
        @SerializedName("DAY_OFF") val dAYOFF: String,
        @SerializedName("DAY_OFF_LICENSE") val dAYOFFLICENSE: String,
        @SerializedName("DAY_OFF_LICENSE_TITLE") val dAYOFFLICENSETITLE: String,
        @SerializedName("DAY_OFF_PERMIT") val dAYOFFPERMIT: String,
        @SerializedName("DEPARTMENT") val dEPARTMENT: String,
        @SerializedName("DETAIL_LOG_TIME") val dETAILLOGTIME: String,
        @SerializedName("DOWNLOAD_ALL_DATA") val dOWNLOADALLDATA: String,
        @SerializedName("DOWNLOAD__DATA_IN_PAGE") val dOWNLOADDATAINPAGE: String,
        @SerializedName("EARLY_LICENSE") val eARLYLICENSE: String,
        @SerializedName("EARLY_PERMIT") val eARLYPERMIT: String,
        @SerializedName("EMAIL") val eMAIL: String,
        @SerializedName("EMAIL_SENDING_ACTION") val eMAILSENDINGACTION: String,
        @SerializedName("EMAIL_SENDING_ACTION_TITLE") val eMAILSENDINGACTIONTITLE: String,
        @SerializedName("ENJOY_SALARY") val eNJOYSALARY: String,
        @SerializedName("FROM") val fROM: String,
        @SerializedName("FULL_NAME") val fULLNAME: String,
        @SerializedName("GO_OUT_PERMIT") val gOOUTPERMIT: String,
        @SerializedName("GO_OUT_WITHOUT_PERMIT") val gOOUTWITHOUTPERMIT: String,
        @SerializedName("HOLIDAY") val hOLIDAY: String,
        @SerializedName("HOLIDAY_ON") val hOLIDAYON: String,
        @SerializedName("IN_OUT") val iNOUT: String,
        @SerializedName("INVALID_OT_TIME") val iNVALIDOTTIME: String,
        @SerializedName("JOB_STATUS") val jOBSTATUS: String,
        @SerializedName("100k") val moneyFirstk: String,
        @SerializedName("300k") val moneyLastk: String,
        @SerializedName("LATE_LICENSE") val lATELICENSE: String,
        @SerializedName("LATE_PERMIT") val lATEPERMIT: String,
        @SerializedName("LEAVE_REGIME") val lEAVEREGIME: String,
        @SerializedName("LEAVE_REQUEST_DATA_TITLE") val lEAVEREQUESTDATATITLE: String,
        @SerializedName("LICENSE") val lICENSE: String,
        @SerializedName("LOCK_ALL_EMPLOYEE") val lOCKALLEMPLOYEE: String,
        @SerializedName("LOCK_CONTENT") val lOCKCONTENT: String,
        @SerializedName("LOCK_SUCCESSFUL") val lOCKSUCCESSFUL: String,
        @SerializedName("LOCK_TITLE") val lOCKTITLE: String,
        @SerializedName("MINUS_ATTENDANCE_ALLOWANCE") val mINUSATTENDANCEALLOWANCE: String,
        @SerializedName("MINUTE") val mINUTE: String,
        @SerializedName("MONTH_AND_YEAR") val mONTHANDYEAR: String,
        @SerializedName("NO_SALARY") val nOSALARY: String,
        @SerializedName("NOT_ALLOWED_CALC_SALARY") val nOTALLOWEDCALCSALARY: String,
        @SerializedName("NOT_CALC_SALARY") val nOTCALCSALARY: String,
        @SerializedName("NOTE") val nOTE: String,
        @SerializedName("NUMBER_OFF_DAY_IN_MONTH") val nUMBEROFFDAYINMONTH: String,
        @SerializedName("NUMBER_OFF_DAY_SALARY_IN_MONTH") val nUMBEROFFDAYSALARYINMONTH: String,
        @SerializedName("NUMBER_OFF_WITHOUT_LICENSE") val nUMBEROFFWITHOUTLICENSE: String,
        @SerializedName("NUMBER_OFF_WITH_PERMIT") val nUMBEROFFWITHPERMIT: String,
        @SerializedName("NUMBER_OF_WORKDAYS_IN_MONTH") val nUMBEROFWORKDAYSINMONTH: String,
        @SerializedName("OT") val oT: String,
        @SerializedName("OT_LAST_YEAR") val oTLASTYEAR: String,
        @SerializedName("OT_REQUEST_DATA_TITLE") val oTREQUESTDATATITLE: String,
        @SerializedName("OT_TOTAL") val oTTOTAL: String,
        @SerializedName("OVERTIME_STANDARD_REMAIN") val oVERTIMESTANDARDREMAIN: String,
        @SerializedName("OVERTIME_STANDARD_REMAIN_BUTTON") val oVERTIMESTANDARDREMAINBUTTON: String,
        @SerializedName("OVERTIME_STANDARD_REMAIN_FAILURE") val oVERTIMESTANDARDREMAINFAILURE: String,
        @SerializedName("OVERTIME_STANDARD_REMAIN_SUCCESSFUL") val oVERTIMESTANDARDREMAINSUCCESSFUL: String,
        @SerializedName("PAID_LEAVE_OT") val pAIDLEAVEOT: String,
        @SerializedName("PAID_LEAVE_YEAR") val pAIDLEAVEYEAR: String,
        @SerializedName("POSITION") val pOSITION: String,
        @SerializedName("REALITY") val rEALITY: String,
        @SerializedName("REASON") val rEASON: String,
        @SerializedName("REJECT_OT") val rEJECTOT: String,
        @SerializedName("RESULTS_ACCUMULATE") val rESULTSACCUMULATE: String,
        @SerializedName("RESULTS_ACCUMULATE_OLD") val rESULTSACCUMULATEOLD: String,
        @SerializedName("SALARY_DAYS") val sALARYDAYS: String,
        @SerializedName("SEND_INFORMATION_TIME_SHEET_TO_EMPLOYEE") val sENDINFORMATIONTIMESHEETTOEMPLOYEE: String,
        @SerializedName("SENT_EMAIL_ALL_MESSAGE") val sENTEMAILALLMESSAGE: String,
        @SerializedName("SENT_EMAIL_MESSAGE") val sENTEMAILMESSAGE: String,
        @SerializedName("SENT_EMAIL_SUCCESSFUL") val sENTEMAILSUCCESSFUL: String,
        @SerializedName("SENT_EMAIL_TITLE") val sENTEMAILTITLE: String,
        @SerializedName("STT") val sTT: String,
        @SerializedName("TERMINAL_DAY_IN_MONTH") val tERMINALDAYINMONTH: String,
        @SerializedName("TIME_OT_IN_MONTH") val tIMEOTINMONTH: String,
        @SerializedName("TITLE_LEAVE") val tITLELEAVE: String,
        @SerializedName("TITLE_OT") val tITLEOT: String,
        @SerializedName("TITLE_TABLE") val tITLETABLE: String,
        @SerializedName("TO") val tO: String,
        @SerializedName("TOTAL_HOLIDAY") val tOTALHOLIDAY: String,
        @SerializedName("TOTAL_WEEKDAY") val tOTALWEEKDAY: String,
        @SerializedName("TOTAL_WEEKEND") val tOTALWEEKEND: String,
        @SerializedName("TWELVE") val tWELVE: String,
        @SerializedName("UNLOCK_ALL_EMPLOYEE") val uNLOCKALLEMPLOYEE: String,
        @SerializedName("UNLOCK_SUCCESSFUL") val uNLOCKSUCCESSFUL: String,
        @SerializedName("UNLOCK_TITLE") val uNLOCKTITLE: String,
        @SerializedName("UNPAID_LEAVE") val uNPAIDLEAVE: String,
        @SerializedName("UNSENT_EMAIL_EMPLOYEE_LIST") val uNSENTEMAILEMPLOYEELIST: String,
        @SerializedName("UNSENT_EMAIL_EMPLOYEE_LIST_TITLE") val uNSENTEMAILEMPLOYEELISTTITLE: String,
        @SerializedName("UPDATE_LOG_TIME") val uPDATELOGTIME: String,
        @SerializedName("VIEW_DETAIL") val vIEWDETAIL: String,
        @SerializedName("WEEKEND") val wEEKEND: String,
        @SerializedName("WEEKEND_ON") val wEEKENDON: String,
        @SerializedName("WEEKLY_DAY") val wEEKLYDAY: String,
        @SerializedName("WEEKLY_DAY_ON") val wEEKLYDAYON: String,
        @SerializedName("WEEKLY_DAY_OT_ON") val wEEKLYDAYOTON: String,
        @SerializedName("WORK_FROM_HOME_PERMIT") val wORKFROMHOMEPERMIT: String,
        @SerializedName("WORKING_OT") val wORKINGOT: String,
        @SerializedName("WORKING_OUT_ACTUAL") val wORKINGOUTACTUAL: String,
        @SerializedName("WORKING_OUT_PERMIT") val wORKINGOUTPERMIT: String,
        @SerializedName("WORKING_OUT_STANDARD") val wORKINGOUTSTANDARD: String,
        @SerializedName("WORKING_STATUS") val wORKINGSTATUS: String
    )

    data class TIMESHEET(
        @SerializedName("APPROVAL") val aPPROVAL: String,
        @SerializedName("APPROVAL_TIMESHEET") val aPPROVALTIMESHEET: String,
        @SerializedName("CHOOSE_PROJECT") val cHOOSEPROJECT: String,
        @SerializedName("CODE_EMPLOYEE") val cODEEMPLOYEE: String,
        @SerializedName("CONFIRM") val cONFIRM: CONFIRM,
        @SerializedName("DATE") val dATE: String,
        @SerializedName("DEPARTMENT") val dEPARTMENT: String,
        @SerializedName("DESCRIPTION") val dESCRIPTION: String,
        @SerializedName("EMAIL") val eMAIL: String,
        @SerializedName("END_TIME") val eNDTIME: String,
        @SerializedName("ERROR") val eRROR: ERROR,
        @SerializedName("FULL_NAME") val fULLNAME: String,
        @SerializedName("LIST_TIMESHEET_REVIEW") val lISTTIMESHEETREVIEW: String,
        @SerializedName("PROJECT") val pROJECT: String,
        @SerializedName("PROJECT_DEPARTMENT") val pROJECTDEPARTMENT: String,
        @SerializedName("REASON_FOR_REJECT") val rEASONFORREJECT: String,
        @SerializedName("REJECT") val rEJECT: String,
        @SerializedName("REVIEW") val rEVIEW: String,
        @SerializedName("REVIEW_TIMESHEET") val rEVIEWTIMESHEET: String,
        @SerializedName("SEARCH") val sEARCH: String,
        @SerializedName("START_TIME") val sTARTTIME: String,
        @SerializedName("STATUS") val sTATUS: String,
        @SerializedName("STT") val sTT: String,
        @SerializedName("SUBJECT") val sUBJECT: String,
        @SerializedName("SUCCESS") val sUCCESS: SUCCESS,
        @SerializedName("TOTAL_TIME") val tOTALTIME: String
    ) {
        data class CONFIRM(
            @SerializedName("SAVE_SUCCESSFUL") val sAVESUCCESSFUL: String
        )

        data class ERROR(
            @SerializedName("ADD_LOG_TIME") val aDDLOGTIME: String,
            @SerializedName("DELETE_LOG_TIME") val dELETELOGTIME: String,
            @SerializedName("EMPTY_INPUT") val eMPTYINPUT: String,
            @SerializedName("ER0001") val eR0001: String,
            @SerializedName("ER0002") val eR0002: String,
            @SerializedName("ER0003") val eR0003: String,
            @SerializedName("ER0004") val eR0004: String,
            @SerializedName("ER0005") val eR0005: String,
            @SerializedName("ER0006") val eR0006: String,
            @SerializedName("ER00122") val eR00122: String,
            @SerializedName("ER00123") val eR00123: String,
            @SerializedName("ER00124") val eR00124: String,
            @SerializedName("ER0026") val eR0026: String,
            @SerializedName("ER0027") val eR0027: String,
            @SerializedName("ER0028") val eR0028: String,
            @SerializedName("ER0029") val eR0029: String,
            @SerializedName("ER0030") val eR0030: String,
            @SerializedName("ER0031") val eR0031: String,
            @SerializedName("ER0032") val eR0032: String,
            @SerializedName("ER0033") val eR0033: String,
            @SerializedName("ER0034") val eR0034: String,
            @SerializedName("ER0035") val eR0035: String,
            @SerializedName("ER0036") val eR0036: String,
            @SerializedName("ERC002_1000") val eRC0021000: String,
            @SerializedName("ERC002_500") val eRC002500: String,
            @SerializedName("INPUT_TIME") val iNPUTTIME: String,
            @SerializedName("REQUIRED") val rEQUIRED: String,
            @SerializedName("SC0007") val sC0007: String,
            @SerializedName("UPDATE_LOG_TIME") val uPDATELOGTIME: String
        )

        data class SUCCESS(
            @SerializedName("ADD_LOG_TIME") val aDDLOGTIME: String,
            @SerializedName("DELETE_LOG_TIME") val dELETELOGTIME: String,
            @SerializedName("UPDATE_LOG_TIME") val uPDATELOGTIME: String
        )
    }

    data class TIMESHEETPERMISSION(
        @SerializedName("ALL_STATUS") val aLLSTATUS: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("REJECT_REASON") val rEJECTREASON: String,
        @SerializedName("SUCCESS") val sUCCESS: SUCCESS
    ) {
        data class ERRORS(
            @SerializedName("MAX_START_DATE") val mAXSTARTDATE: String,
            @SerializedName("MIN_END_DATE") val mINENDDATE: String
        )

        data class SUCCESS(
            @SerializedName("APPROVAL") val aPPROVAL: String,
            @SerializedName("REJECT") val rEJECT: String
        )
    }

    data class TITLEERROR(
        @SerializedName("ALREADY_EXIST_EMPLOYEE_CODE") val aLREADYEXISTEMPLOYEECODE: String,
        @SerializedName("EMPLOYEE_EMAIL_EXISTED") val eMPLOYEEEMAILEXISTED: String,
        @SerializedName("INVALIDATED_HOUR") val iNVALIDATEDHOUR: String,
        @SerializedName("LEAVE_REQUEST_REGISTER_FAILED") val lEAVEREQUESTREGISTERFAILED: String,
        @SerializedName("LOG_LEAVE_REQUEST") val lOGLEAVEREQUEST: String,
        @SerializedName("OT_LEAVE_REQUEST") val oTLEAVEREQUEST: String,
        @SerializedName("TIME_EQUATION") val tIMEEQUATION: String,
        @SerializedName("TIME_LEAVE_REQUEST") val tIMELEAVEREQUEST: String
    )

    data class USERS(
        @SerializedName("ACTION") val aCTION: String,
        @SerializedName("ACTIVE") val aCTIVE: String,
        @SerializedName("ASSIGN") val aSSIGN: String,
        @SerializedName("ASSIGN_WITH_GROUP") val aSSIGNWITHGROUP: String,
        @SerializedName("AUTH_TYPE") val aUTHTYPE: String,
        @SerializedName("AVATAR") val aVATAR: String,
        @SerializedName("EMAIL") val eMAIL: String,
        @SerializedName("ERROR") val eRROR: ERROR,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("FULL_NAME") val fULLNAME: String,
        @SerializedName("ID") val iD: String,
        @SerializedName("IM_EX_TITLE") val iMEXTITLE: String,
        @SerializedName("INFO") val iNFO: String,
        @SerializedName("MESSAGE") val mESSAGE: String,
        @SerializedName("NAME_ACTIONS") val nAMEACTIONS: NAMEACTIONS,
        @SerializedName("NAME_MODULE") val nAMEMODULE: NAMEMODULE,
        @SerializedName("OBJECT_NAME") val oBJECTNAME: OBJECTNAME,
        @SerializedName("PASSWORD") val pASSWORD: String,
        @SerializedName("RESTORE") val rESTORE: String,
        @SerializedName("RESTORE_SUCCESS_TITLE") val rESTORESUCCESSTITLE: String,
        @SerializedName("RESTORE_TITLE") val rESTORETITLE: String,
        @SerializedName("ROLE_PERSONAL") val rOLEPERSONAL: String,
        @SerializedName("ROLE_WITH_GROUP") val rOLEWITHGROUP: String,
        @SerializedName("STATUS") val sTATUS: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("USER_NAME") val uSERNAME: String
    ) {
        data class ERROR(
            @SerializedName("ERC008") val eRC008: String
        )

        data class ERRORS(
            @SerializedName("FULL_NAME") val fULLNAME: FULLNAME,
            @SerializedName("PASSWORD") val pASSWORD: PASSWORD,
            @SerializedName("USER_NAME") val uSERNAME: USERNAME
        ) {
            data class FULLNAME(
                @SerializedName("PATTERN") val pATTERN: String
            )

            data class PASSWORD(
                @SerializedName("MAXLENGTH") val mAXLENGTH: String,
                @SerializedName("MINLENGTH") val mINLENGTH: String
            )

            data class USERNAME(
                @SerializedName("PATTERN") val pATTERN: String
            )
        }

        data class NAMEACTIONS(
            @SerializedName("access-denied") val accessDenied: String,
            @SerializedName("add-children") val addChildren: String,
            @SerializedName("add-employees") val addEmployees: String,
            @SerializedName("add-roles") val addRoles: String,
            @SerializedName("approval") val approval: String,
            @SerializedName("approval_by_bud") val approvalByBud: String,
            @SerializedName("approval_by_gm") val approvalByGm: String,
            @SerializedName("approval-many") val approvalMany: String,
            @SerializedName("approval-many-leave") val approvalManyLeave: String,
            @SerializedName("birthday") val birthday: String,
            @SerializedName("cancel") val cancel: String,
            @SerializedName("change-password") val changePassword: String,
            @SerializedName("checkin") val checkin: String,
            @SerializedName("choice.select-list") val choiceSelectList: String,
            @SerializedName("clear-holidays") val clearHolidays: String,
            @SerializedName("clear-ot-holidays") val clearOtHolidays: String,
            @SerializedName("create") val create: String,
            @SerializedName("customs-for-employees") val customsForEmployees: String,
            @SerializedName("deleteMany") val deleteMany: String,
            @SerializedName("destroy") val destroy: String,
            @SerializedName("destroy-approved-leave-request") val destroyApprovedLeaveRequest: String,
            @SerializedName("detail-basic") val detailBasic: String,
            @SerializedName("detail-contact") val detailContact: String,
            @SerializedName("detail-contract") val detailContract: String,
            @SerializedName("detail-custom") val detailCustom: String,
            @SerializedName("detail-education") val detailEducation: String,
            @SerializedName("detail-personal") val detailPersonal: String,
            @SerializedName("detail-personnel-profile") val detailPersonnelProfile: String,
            @SerializedName("detail-social-insurance") val detailSocialInsurance: String,
            @SerializedName("detail-workday") val detailWorkday: String,
            @SerializedName("edit") val edit: String,
            @SerializedName("export-csv") val exportCsv: String,
            @SerializedName("export-excel") val exportExcel: String,
            @SerializedName("field-filter") val fieldFilter: String,
            @SerializedName("filter-employees") val filterEmployees: String,
            @SerializedName("get-all-employees") val getAllEmployees: String,
            @SerializedName("get-children") val getChildren: String,
            @SerializedName("get-data-master") val getDataMaster: String,
            @SerializedName("get-detail") val getDetail: String,
            @SerializedName("get-district") val getDistrict: String,
            @SerializedName("get-employee") val getEmployee: String,
            @SerializedName("get-employee-paginate") val getEmployeePaginate: String,
            @SerializedName("get-people-approval") val getPeopleApproval: String,
            @SerializedName("get-permission-view") val getPermissionView: String,
            @SerializedName("get-roles") val getRoles: String,
            @SerializedName("get-streets") val getStreets: String,
            @SerializedName("get-wards") val getWards: String,
            @SerializedName("import-csv") val importCsv: String,
            @SerializedName("import-excel") val importExcel: String,
            @SerializedName("index") val index: String,
            @SerializedName("list-field") val listField: String,
            @SerializedName("list-group-join") val listGroupJoin: String,
            @SerializedName("list-posistion") val listPosistion: String,
            @SerializedName("list-position") val listPosition: String,
            @SerializedName("logout") val logout: String,
            @SerializedName("my-history-change") val myHistoryChange: String,
            @SerializedName("my-leave-permit") val myLeavePermit: String,
            @SerializedName("my_leave_request_waiting") val myLeaveRequestWaiting: String,
            @SerializedName("my_number_absent_without_permit") val myNumberAbsentWithoutPermit: String,
            @SerializedName("my_number_actual_work_day") val myNumberActualWorkDay: String,
            @SerializedName("my_number_day_off_in_month") val myNumberDayOffInMonth: String,
            @SerializedName("my_number_late_in_month") val myNumberLateInMonth: String,
            @SerializedName("my-ot") val myOt: String,
            @SerializedName("my-request") val myRequest: String,
            @SerializedName("my_timekeeping") val myTimekeeping: String,
            @SerializedName("my_work_plan") val myWorkPlan: String,
            @SerializedName("reject") val reject: String,
            @SerializedName("reject_by_bud") val rejectByBud: String,
            @SerializedName("reject_by_gm") val rejectByGm: String,
            @SerializedName("reject-many") val rejectMany: String,
            @SerializedName("reject-many-leave") val rejectManyLeave: String,
            @SerializedName("restore") val restore: String,
            @SerializedName("saveMany") val saveMany: String,
            @SerializedName("select-list") val selectList: String,
            @SerializedName("select-list-backup") val selectListBackup: String,
            @SerializedName("send_mail_salary") val sendMailSalary: String,
            @SerializedName("send_mail_salary_has_choose") val sendMailSalaryHasChoose: String,
            @SerializedName("show") val show: String,
            @SerializedName("standard") val standard: String,
            @SerializedName("statistical_ot") val statisticalOt: String,
            @SerializedName("store") val store: String,
            @SerializedName("timekeeping_all") val timekeepingAll: String,
            @SerializedName("timekeeping_lock") val timekeepingLock: String,
            @SerializedName("timekeeping_note") val timekeepingNote: String,
            @SerializedName("timekeeping_open") val timekeepingOpen: String,
            @SerializedName("type") val type: String,
            @SerializedName("update") val update: String,
            @SerializedName("update-basic-information") val updateBasicInformation: String,
            @SerializedName("update-contact-information") val updateContactInformation: String,
            @SerializedName("update-contract-information") val updateContractInformation: String,
            @SerializedName("update-education-information") val updateEducationInformation: String,
            @SerializedName("update-information-custom") val updateInformationCustom: String,
            @SerializedName("update-information-personnel-profile") val updateInformationPersonnelProfile: String,
            @SerializedName("update-personal-information") val updatePersonalInformation: String,
            @SerializedName("update-social-insurance-information") val updateSocialInsuranceInformation: String,
            @SerializedName("update-work-day-information") val updateWorkDayInformation: String,
            @SerializedName("user-info") val userInfo: String,
            @SerializedName("work_plan_total") val workPlanTotal: String
        )

        data class NAMEMODULE(
            @SerializedName("M1") val m1: String,
            @SerializedName("M2") val m2: String,
            @SerializedName("M3") val m3: String,
            @SerializedName("M4") val m4: String,
            @SerializedName("M5") val m5: String
        )

        data class OBJECTNAME(
            @SerializedName("actions") val actions: String,
            @SerializedName("categories") val categories: String,
            @SerializedName("category_datas") val categoryDatas: String,
            @SerializedName("checkinout") val checkinout: String,
            @SerializedName("checkinouts") val checkinouts: String,
            @SerializedName("customs") val customs: String,
            @SerializedName("departments") val departments: String,
            @SerializedName("display_order_fields") val displayOrderFields: String,
            @SerializedName("districts") val districts: String,
            @SerializedName("employees") val employees: String,
            @SerializedName("employees_not_received_mail") val employeesNotReceivedMail: String,
            @SerializedName("file_data_checkin_checkouts") val fileDataCheckinCheckouts: String,
            @SerializedName("groups") val groups: String,
            @SerializedName("history_update_employees") val historyUpdateEmployees: String,
            @SerializedName("holidays_employees") val holidaysEmployees: String,
            @SerializedName("holidays_employees_useds") val holidaysEmployeesUseds: String,
            @SerializedName("job_status") val jobStatus: String,
            @SerializedName("leave_reasons") val leaveReasons: String,
            @SerializedName("leave_request_types") val leaveRequestTypes: String,
            @SerializedName("leave_requests") val leaveRequests: String,
            @SerializedName("leave_types") val leaveTypes: String,
            @SerializedName("notifications") val notifications: String,
            @SerializedName("offices") val offices: String,
            @SerializedName("official_holidays") val officialHolidays: String,
            @SerializedName("overtime_requests") val overtimeRequests: String,
            @SerializedName("permission_approval") val permissionApproval: String,
            @SerializedName("permission_view_infos") val permissionViewInfos: String,
            @SerializedName("positions") val positions: String,
            @SerializedName("projects") val projects: String,
            @SerializedName("provinces") val provinces: String,
            @SerializedName("rule_holidays") val ruleHolidays: String,
            @SerializedName("rules") val rules: String,
            @SerializedName("rules_approvals") val rulesApprovals: String,
            @SerializedName("rules_timesheets") val rulesTimesheets: String,
            @SerializedName("settings") val settings: String,
            @SerializedName("specializes") val specializes: String,
            @SerializedName("statistical_overtimes") val statisticalOvertimes: String,
            @SerializedName("streets") val streets: String,
            @SerializedName("timekeeping") val timekeeping: String,
            @SerializedName("timekeeping-data") val timekeepingData: String,
            @SerializedName("timesheets") val timesheets: String,
            @SerializedName("users") val users: String,
            @SerializedName("wards") val wards: String,
            @SerializedName("work_plan_grants") val workPlanGrants: String,
            @SerializedName("work_plan_on_dates") val workPlanOnDates: String,
            @SerializedName("work_plans") val workPlans: String,
            @SerializedName("working_status") val workingStatus: String
        )
    }

    data class WORKINGSTATUS(
        @SerializedName("CODE") val cODE: String,
        @SerializedName("DESCRIPTION") val dESCRIPTION: String,
        @SerializedName("ID") val iD: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("TITLE") val tITLE: String
    )

    data class WORKPLAN(
        @SerializedName("AFTERNOON") val aFTERNOON: String,
        @SerializedName("APPLY") val aPPLY: String,
        @SerializedName("BREAKS") val bREAKS: String,
        @SerializedName("DAY_MONTH") val dAYMONTH: String,
        @SerializedName("DAY_WEEK") val dAYWEEK: String,
        @SerializedName("END_TIME") val eNDTIME: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("FLEXIBLE") val fLEXIBLE: String,
        @SerializedName("MIN_TIME") val mINTIME: String,
        @SerializedName("MINUTE") val mINUTE: String,
        @SerializedName("MONTH") val mONTH: String,
        @SerializedName("MORNING") val mORNING: String,
        @SerializedName("NAME") val nAME: String,
        @SerializedName("PERMANENT") val pERMANENT: String,
        @SerializedName("REDZONE") val rEDZONE: String,
        @SerializedName("START_TIME") val sTARTTIME: String,
        @SerializedName("TIME_ZONE") val tIMEZONE: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("TO") val tO: String,
        @SerializedName("TODATE") val tODATE: String,
        @SerializedName("TOTAL_TIME") val tOTALTIME: String,
        @SerializedName("WEEK") val wEEK: String,
        @SerializedName("WORKING_DAY") val wORKINGDAY: String,
        @SerializedName("WORK_PLAN_GRANTS") val wORKPLANGRANTS: String,
        @SerializedName("WORK_TIME") val wORKTIME: String
    ) {
        data class ERRORS(
            @SerializedName("MAX_HOUR_CHECKIN_START") val mAXHOURCHECKINSTART: String,
            @SerializedName("MAX_LUNCH_BREAK_START") val mAXLUNCHBREAKSTART: String,
            @SerializedName("MAX_START_DATE") val mAXSTARTDATE: String,
            @SerializedName("MIN_END_DATE") val mINENDDATE: String,
            @SerializedName("MIN_HOUR_CHECKOUT_START") val mINHOURCHECKOUTSTART: String,
            @SerializedName("MIN_LUNCH_BREAK_END") val mINLUNCHBREAKEND: String
        )
    }

    data class WORKPLANSGRANTS(
        @SerializedName("APPLY") val aPPLY: String,
        @SerializedName("ERRORS") val eRRORS: ERRORS,
        @SerializedName("ID") val iD: String,
        @SerializedName("PRIORITY") val pRIORITY: String,
        @SerializedName("TITLE") val tITLE: String,
        @SerializedName("TYPE") val tYPE: String,
        @SerializedName("WORK_PLANS") val wORKPLANS: String,
        @SerializedName("WORK_PLANS_NAME") val wORKPLANSNAME: String
    ) {
        data class ERRORS(
            @SerializedName("MALFORMED") val mALFORMED: String,
            @SerializedName("REQUIRED") val rEQUIRED: String
        )
    }
}