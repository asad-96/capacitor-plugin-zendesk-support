import { WebPlugin } from '@capacitor/core';

import type { ZendeskSupportPlugin } from './definitions';

export class ZendeskSupportWeb
  extends WebPlugin
  implements ZendeskSupportPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
