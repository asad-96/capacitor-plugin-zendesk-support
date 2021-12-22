import { registerPlugin } from '@capacitor/core';

import type { ZendeskSupportPlugin } from './definitions';

const ZendeskSupport = registerPlugin<ZendeskSupportPlugin>('ZendeskSupport', {
  web: () => import('./web').then(m => new m.ZendeskSupportWeb()),
});

export * from './definitions';
export { ZendeskSupport };
