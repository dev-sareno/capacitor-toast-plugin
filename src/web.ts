import { WebPlugin } from '@capacitor/core';
import { ToastPluginPlugin } from './definitions';

export class ToastPluginWeb extends WebPlugin implements ToastPluginPlugin {
  constructor() {
    super({
      name: 'ToastPlugin',
      platforms: ['web']
    });
  }

  async echo(options: { value: string }): Promise<{value: string}> {
    console.log('ECHO', options);
    return options;
  }
}

const ToastPlugin = new ToastPluginWeb();

export { ToastPlugin };

import { registerWebPlugin } from '@capacitor/core';
registerWebPlugin(ToastPlugin);
