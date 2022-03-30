package io.ionic.starter

import com.getcapacitor.BridgeActivity
import android.os.Bundle
import com.websquare.plugins.zendesksupport.ZendeskSupportPlugin

class MainActivity : BridgeActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerPlugin(ZendeskSupportPlugin::class.java)
    }
}
