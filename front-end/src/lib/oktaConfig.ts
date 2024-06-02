export const oktaConfig = {
  clientId: '0oaheoympy2LsYl3P5d7',
  issuer: 'https://dev-88167135.okta.com/oauth2/default',
  redirectUri: 'http://localhost:3000/login/callback',
  scopes: ['openid', 'profile', 'email'],
  pkce: true,
  disableHttpsCheck: true,
}