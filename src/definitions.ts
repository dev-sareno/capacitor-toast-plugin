declare module "@capacitor/core" {
  interface PluginRegistry {
    ToastPlugin: ToastPluginPlugin;
  }
}

export interface ToastPluginPlugin {
  echo(options: { value: string }): Promise<{value: string}>;
}
