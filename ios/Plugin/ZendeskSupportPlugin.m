#import <Foundation/Foundation.h>
#import <Capacitor/Capacitor.h>

// Define the plugin using the CAP_PLUGIN Macro, and
// each method the plugin supports using the CAP_PLUGIN_METHOD macro.
CAP_PLUGIN(ZendeskSupportPlugin, "ZendeskSupport",
           CAP_PLUGIN_METHOD(initialize, CAPPluginReturnPromise);
           CAP_PLUGIN_METHOD(setAnonymousIdentity, CAPPluginReturnPromise);
           CAP_PLUGIN_METHOD(setIdentity, CAPPluginReturnPromise);
           CAP_PLUGIN_METHOD(showHelpCenter, CAPPluginReturnPromise);
           CAP_PLUGIN_METHOD(showHelpCenterArticle, CAPPluginReturnPromise);
           CAP_PLUGIN_METHOD(showTicketRequest, CAPPluginReturnPromise);
           CAP_PLUGIN_METHOD(showUserTickets, CAPPluginReturnPromise);
)
