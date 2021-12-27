import { Component } from '@angular/core';
import { ZendeskSupport } from "capacitor-plugin-zendesk-support";

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  constructor() {}

  async initialize() {
    await ZendeskSupport.initialize({appId: 'c17460eb60cfa285accdb580d2dadf104f96f2d2d630e76b', clientId: 'mobile_sdk_client_cab705e2c6ff2b9f32a8', zendeskUrl: 'https://purematrimony.zendesk.com', debugLog: false});
  }

  async openHelpCenter() {
    try {
      await ZendeskSupport.initialize({appId: 'c17460eb60cfa285accdb580d2dadf104f96f2d2d630e76b', clientId: 'mobile_sdk_client_cab705e2c6ff2b9f32a8', zendeskUrl: 'https://purematrimony.zendesk.com', debugLog: false});
      await ZendeskSupport.setIdentity({token: '200182'});
      await ZendeskSupport.showHelpCenter();
    } catch (error) {
      console.log(error);
    }
  }

}
