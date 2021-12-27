package com.websquare.plugins.zendesksupport

import com.getcapacitor.Plugin
import com.getcapacitor.annotation.CapacitorPlugin
import com.websquare.plugins.zendesksupport.ZendeskSupport
import com.getcapacitor.PluginMethod
import com.getcapacitor.PluginCall
import org.json.JSONArray
import org.json.JSONException
import java.lang.Exception
import java.util.ArrayList

@CapacitorPlugin(name = "ZendeskSupport")
class ZendeskSupportPlugin : Plugin() {
    private val implementation = ZendeskSupport()
    @PluginMethod
    fun initialize(call: PluginCall) {
        val appId = call.getString("appId", "")
        val clientId = call.getString("clientId", "")
        val zendeskUrl = call.getString("zendeskUrl", "")
        val debugLog = call.getBoolean("debugLog", false)
        try {
            implementation.initialize(activity.applicationContext, zendeskUrl, appId, clientId, debugLog)
            call.resolve()
        } catch (e: Exception) {
            call.reject(e.message, e)
        }
    }

    @PluginMethod
    fun setAnonymousIdentity(call: PluginCall) {
        val name = call.getString("name", "")
        val email = call.getString("email", "")
        implementation.setAnonymousIdentity(name, email)
        call.resolve()
    }

    @PluginMethod
    fun setIdentity(call: PluginCall) {
        val token = call.getString("token", "")
        implementation.setIdentity(token)
        call.resolve()
    }

    @PluginMethod
    fun showHelpCenter(call: PluginCall) {
        val groupBy = call.getString("groupBy", "")
        var groupIds: List<Long?> = ArrayList()
        var labels: List<String?> = ArrayList()
        if (call.hasOption("groupIds")) {
            groupIds = jsonArrayToList(call.getArray("groupIds"))
        }
        if (call.hasOption("labels")) {
            labels = jsonArrayToList(call.getArray("labels"))
        }
        implementation.showHelpCenter(activity, groupBy, groupIds, labels)
        call.resolve()
    }

    @PluginMethod
    fun showHelpCenterArticle(call: PluginCall) {
        val articleId = call.getString("articleId", "")
        implementation.showHelpCenterArticle(activity, articleId)
        call.resolve()
    }

    @PluginMethod
    fun showTicketRequest(call: PluginCall) {
        val subject = call.getString("subject", "")
        var tags: List<String?> = ArrayList()
        var fields: List<String?> = ArrayList()
        if (call.hasOption("tags")) {
            tags = jsonArrayToList(call.getArray("tags"))
        }
        if (call.hasOption("fields")) {
            fields = jsonArrayToList(call.getArray("fields"))
        }
        implementation.showTicketRequest(activity, subject, tags, fields)
        call.resolve()
    }

    @PluginMethod
    fun showUserTickets(call: PluginCall) {
        implementation.showUserTickets(activity)
        call.resolve()
    }

    private fun <T> jsonArrayToList(jsonArray: JSONArray): List<T> {
        val arrayList: MutableList<T> = ArrayList()
        for (i in 0 until jsonArray.length()) {
            try {
                arrayList.add(jsonArray[i] as T)
            } catch (e: JSONException) {
                e.printStackTrace()
            }
        }
        return arrayList
    }
}