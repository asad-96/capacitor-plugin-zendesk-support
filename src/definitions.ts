export interface ZendeskSupportPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
