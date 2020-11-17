package com.lifeline.preferences

import android.content.Context
import androidx.core.content.edit


class UserPreferences {

    companion object {
        val instance: UserPreferences by lazy { UserPreferences() }
        private const val USER = "USER"
        private const val POSTS = "POSTS"
        private const val ORDER = "ORDER"
        private const val BUYSELLORDER = "BUYSELLORDER"
        private const val IS_LOGGED_IN = "IS_LOGGED_IN"
        private const val IS_PROFILE_UPDATED = "IS_PROFILE_UPDATED"
        private const val PREFERENCE_NAME = "user.preferences"
        private const val SAVED_TOKEN = "TOKEN"
        private const val REFRESH_TOKEN = "REFRESHTOKEN"
        private const val CHANCE_ID = "CHANCEID"
    }

/*    fun saveUser(context: Context, user: User) {
        val preferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
        preferences.edit {
            putString(USER, user.toJson())
            putBoolean(IS_LOGGED_IN, true)
            apply()
        }
    }*/

/*
    fun getUser(context: Context): User? {
        val userStr = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
            .getString(USER, null)
        return userStr?.fromJson()
    }
*/

    fun logout(context: Context) {
        val preferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
        preferences.edit().clear().commit()
    }

    fun clear(context: Context) {
        val preferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
        preferences.edit { clear() }
    }

    fun isLoggedIn(context: Context): Boolean {
        val preferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
        return preferences.getBoolean(IS_LOGGED_IN, false)
    }

    fun setLoggedIn(context: Context) {
        val preferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
        preferences.edit {
            putBoolean(IS_LOGGED_IN, true)
            apply()
        }
    }

    fun isProfileUpdated(context: Context): Boolean {
        val preferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
        return preferences.getBoolean(IS_PROFILE_UPDATED, false)
    }

    fun setProfileUpdated(context: Context) {
        val preferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
        preferences.edit {
            putBoolean(IS_PROFILE_UPDATED, true)
            apply()
        }
    }

    fun saveToken(context: Context, token: String?) {
        val preferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
        preferences.edit() {
            putString(SAVED_TOKEN, token)
            apply()
        }
    }

    fun getTokken(context: Context): String? {
        val tokenn = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
            .getString(SAVED_TOKEN, null)
        return tokenn
    }

    fun saveRefreshToken(context: Context, token: String?) {
        val preferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
        preferences.edit() {
            putString(REFRESH_TOKEN, token)
            apply()
        }
    }

    fun getRefreshTokken(context: Context): String? {
        val tokenn = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
            .getString(REFRESH_TOKEN, null)
        return tokenn
    }
}