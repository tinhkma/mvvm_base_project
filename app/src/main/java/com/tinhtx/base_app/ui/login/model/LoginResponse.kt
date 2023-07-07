/*
 * *
 *  * Created by tinhtx on 7/6/23, 11:27 AM
 *  * Copyright (c) 2023 . All rights reserved.
 *  * Last modified 7/6/23, 11:27 AM
 *
 */

package com.tinhtx.base_app.ui.login.model


import com.google.gson.annotations.SerializedName
import com.tinhtx.base_app.repository.api.ApiResponse

data class LoginResponse(
    @SerializedName("data")
    val employeeData: EmployeeData,
    @SerializedName("message")
    val message: Int,
    @SerializedName("success")
    val success: Boolean
): ApiResponse() {
    data class EmployeeData(
        @SerializedName("expires_in")
        val expiresIn: String,
        @SerializedName("token")
        val token: String,
        @SerializedName("token_type")
        val tokenType: String,
        @SerializedName("user")
        val user: User
    ) {
        data class User(
            @SerializedName("actions")
            val actions: List<Action>,
            @SerializedName("auth_type")
            val authType: Int,
            @SerializedName("avatar")
            val avatar: Any,
            @SerializedName("created_at")
            val createdAt: String,
            @SerializedName("created_by")
            val createdBy: Int,
            @SerializedName("deleted_at")
            val deletedAt: Any,
            @SerializedName("deleted_by")
            val deletedBy: Any,
            @SerializedName("email")
            val email: String,
            @SerializedName("employee")
            val employee: Employee,
            @SerializedName("employee_birthday_checker")
            val employeeBirthdayChecker: Any,
            @SerializedName("employee_id")
            val employeeId: Int,
            @SerializedName("full_name")
            val fullName: String,
            @SerializedName("id")
            val id: Int,
            @SerializedName("is_first_login")
            val isFirstLogin: Int,
            @SerializedName("status")
            val status: Int,
            @SerializedName("updated_at")
            val updatedAt: String,
            @SerializedName("updated_by")
            val updatedBy: Int,
            @SerializedName("username")
            val username: String
        ) {
            data class Action(
                @SerializedName("code")
                val code: String,
                @SerializedName("id")
                val id: Int,
                @SerializedName("module_code")
                val moduleCode: String,
                @SerializedName("module_name")
                val moduleName: String,
                @SerializedName("name")
                val name: String,
                @SerializedName("object_code")
                val objectCode: String,
                @SerializedName("object_name")
                val objectName: String,
                @SerializedName("pivot")
                val pivot: Pivot
            ) {
                data class Pivot(
                    @SerializedName("action_id")
                    val actionId: Int,
                    @SerializedName("created_at")
                    val createdAt: Any,
                    @SerializedName("updated_at")
                    val updatedAt: Any,
                    @SerializedName("user_id")
                    val userId: Int
                )
            }

            data class Employee(
                @SerializedName("avatar")
                val avatar: Any,
                @SerializedName("birth_day")
                val birthDay: String,
                @SerializedName("check_in_date")
                val checkInDate: String,
                @SerializedName("email")
                val email: String,
                @SerializedName("employee_address")
                val employeeAddress: Any,
                @SerializedName("employee_code")
                val employeeCode: String,
                @SerializedName("employee_contract")
                val employeeContract: Any,
                @SerializedName("full_name")
                val fullName: String,
                @SerializedName("id")
                val id: Int
            )
        }
    }
}