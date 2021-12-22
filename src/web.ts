import { WebPlugin } from '@capacitor/core';

import type { AnonymousOptions, HelpCenterOptions, IdentityOption, InitializeOptions, TicketRequestOptions, ZendeskSupportPlugin } from './definitions';

export class ZendeskSupportWeb
  extends WebPlugin
  implements ZendeskSupportPlugin {

  async initialize(options: InitializeOptions): Promise<void> {
  }

  async setAnonymousIdentity(options: AnonymousOptions): Promise<void> {
  }

  async setIdentity(option: IdentityOption): Promise<void> {
  }

  async showHelpCenter(options: HelpCenterOptions): Promise<void> {
  }

  async showTicketRequest(options: TicketRequestOptions): Promise<void> {
  }

  async showUserTickets(): Promise<void> {
  }
}
