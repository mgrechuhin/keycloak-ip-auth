# keycloak-ip-auth

```
C:\kc\007\001>curl -v "http://localhost:8080/realms/C/protocol/openid-connect/auth?client_id=c&redirect_uri=http%3A%2F%2Fdummy&state=e68ad220-74a2-4814-8a09-0f90d5984790&response_mode=fragment&response_type=code&scope=openid"
*   Trying ::1...
* TCP_NODELAY set
*   Trying 127.0.0.1...
* TCP_NODELAY set
* Connected to localhost (127.0.0.1) port 8080 (#0)
> GET /realms/C/protocol/openid-connect/auth?client_id=c&redirect_uri=http%3A%2F%2Fdummy&state=e68ad220-74a2-4814-8a09-0f90d5984790&response_mode=fragment&response_type=code&scope=openid HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.55.1
> Accept: */*
>
< HTTP/1.1 302 Found
< Referrer-Policy: no-referrer
< Strict-Transport-Security: max-age=31536000; includeSubDomains
< Cache-Control: no-store, must-revalidate, max-age=0
< X-Content-Type-Options: nosniff
< Set-Cookie: AUTH_SESSION_ID=1e157783-0fb0-48c2-8e33-07a889e39108; Version=1; Path=/realms/C/; SameSite=None; Secure; HttpOnly
< Set-Cookie: AUTH_SESSION_ID_LEGACY=1e157783-0fb0-48c2-8e33-07a889e39108; Version=1; Path=/realms/C/; HttpOnly
< Set-Cookie: KC_RESTART=eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICI3Y2YxNGYwMi0yY2MwLTQ4MDYtYWE3OC0zMzNkZTExYTkwM2IifQ.eyJjaWQiOiJjIiwicHR5Ijoib3BlbmlkLWNvbm5lY3QiLCJydXJpIjoiaHR0cDovL2R1bW15IiwiYWN0IjoiQVVUSEVOVElDQVRFIiwibm90ZXMiOnsic2NvcGUiOiJvcGVuaWQiLCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjgwODAvcmVhbG1zL0MiLCJyZXNwb25zZV90eXBlIjoiY29kZSIsInJlZGlyZWN0X3VyaSI6Imh0dHA6Ly9kdW1teSIsInN0YXRlIjoiZTY4YWQyMjAtNzRhMi00ODE0LThhMDktMGY5MGQ1OTg0NzkwIiwicmVzcG9uc2VfbW9kZSI6ImZyYWdtZW50In19.yUE6SIg_DYsGhTIfzAASr24foVgCpOKi4Kf5kEehOf8; Version=1; Path=/realms/C/; HttpOnly
< Set-Cookie: KEYCLOAK_LOCALE=; Version=1; Comment=Expiring cookie; Expires=Thu, 01-Jan-1970 00:00:10 GMT; Max-Age=0; Path=/realms/C/; HttpOnly
< Set-Cookie: KC_RESTART=; Version=1; Expires=Thu, 01-Jan-1970 00:00:10 GMT; Max-Age=0; Path=/realms/C/; HttpOnly
< Set-Cookie: KEYCLOAK_IDENTITY=eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICI3Y2YxNGYwMi0yY2MwLTQ4MDYtYWE3OC0zMzNkZTExYTkwM2IifQ.eyJleHAiOjE2NTc1ODU1NzAsImlhdCI6MTY1NzU0OTU3MCwianRpIjoiYWNmMDM1MDQtOTg3NC00ZGMzLWFjMzktNTBiYTM5NzFkNzFhIiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwL3JlYWxtcy9DIiwic3ViIjoiODhmZmJjNzUtNWEyMC00NzRiLThjZTAtMDE5MTFiOTAzNDBkIiwidHlwIjoiU2VyaWFsaXplZC1JRCIsInNlc3Npb25fc3RhdGUiOiIxZTE1Nzc4My0wZmIwLTQ4YzItOGUzMy0wN2E4ODllMzkxMDgiLCJzaWQiOiIxZTE1Nzc4My0wZmIwLTQ4YzItOGUzMy0wN2E4ODllMzkxMDgiLCJzdGF0ZV9jaGVja2VyIjoidHExRGoyd21FaXJla2dmT2FDQ2tidTNZM1o5TDFrUFAwbHZFOFBBSWpqMCJ9.ajQ-yzku1v8VAL2P84AFBCEs_fmbnRLlKYp0xIDlacM; Version=1; Path=/realms/C/; SameSite=None; Secure; HttpOnly
< Set-Cookie: KEYCLOAK_IDENTITY_LEGACY=eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICI3Y2YxNGYwMi0yY2MwLTQ4MDYtYWE3OC0zMzNkZTExYTkwM2IifQ.eyJleHAiOjE2NTc1ODU1NzAsImlhdCI6MTY1NzU0OTU3MCwianRpIjoiYWNmMDM1MDQtOTg3NC00ZGMzLWFjMzktNTBiYTM5NzFkNzFhIiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwL3JlYWxtcy9DIiwic3ViIjoiODhmZmJjNzUtNWEyMC00NzRiLThjZTAtMDE5MTFiOTAzNDBkIiwidHlwIjoiU2VyaWFsaXplZC1JRCIsInNlc3Npb25fc3RhdGUiOiIxZTE1Nzc4My0wZmIwLTQ4YzItOGUzMy0wN2E4ODllMzkxMDgiLCJzaWQiOiIxZTE1Nzc4My0wZmIwLTQ4YzItOGUzMy0wN2E4ODllMzkxMDgiLCJzdGF0ZV9jaGVja2VyIjoidHExRGoyd21FaXJla2dmT2FDQ2tidTNZM1o5TDFrUFAwbHZFOFBBSWpqMCJ9.ajQ-yzku1v8VAL2P84AFBCEs_fmbnRLlKYp0xIDlacM; Version=1; Path=/realms/C/; HttpOnly
< Set-Cookie: KEYCLOAK_SESSION=C/88ffbc75-5a20-474b-8ce0-01911b90340d/1e157783-0fb0-48c2-8e33-07a889e39108; Version=1; Expires=Tue, 12-Jul-2022 00:26:10 GMT; Max-Age=36000; Path=/realms/C/; SameSite=None; Secure
< Set-Cookie: KEYCLOAK_SESSION_LEGACY=C/88ffbc75-5a20-474b-8ce0-01911b90340d/1e157783-0fb0-48c2-8e33-07a889e39108; Version=1; Expires=Tue, 12-Jul-2022 00:26:10 GMT; Max-Age=36000; Path=/realms/C/
< Set-Cookie: KEYCLOAK_REMEMBER_ME=; Version=1; Comment=Expiring cookie; Expires=Thu, 01-Jan-1970 00:00:10 GMT; Max-Age=0; Path=/realms/C/; HttpOnly
< P3P: CP="This is not a P3P policy!"
< X-XSS-Protection: 1; mode=block
< Location: http://dummy#state=e68ad220-74a2-4814-8a09-0f90d5984790&session_state=1e157783-0fb0-48c2-8e33-07a889e39108&code=d114ae66-b6ce-4997-9e61-b2f19d27ccaf.1e157783-0fb0-48c2-8e33-07a889e39108.0455e4a3-99a9-4293-8c93-cd9245fa8328
< content-length: 0
<
* Connection #0 to host localhost left intact

C:\kc\007\001>curl -v -d "code=d114ae66-b6ce-4997-9e61-b2f19d27ccaf.1e157783-0fb0-48c2-8e33-07a889e39108.0455e4a3-99a9-4293-8c93-cd9245fa8328&client_id=c&client_secret=hNguhRIQ0YDYpZB35oY3FADOgt2HK4q3&redirect_uri=http%3A%2F%2Fdummy&grant_type=authorization_code" http://localhost:8080/realms/C/protocol/openid-connect/token
*   Trying ::1...
* TCP_NODELAY set
*   Trying 127.0.0.1...
* TCP_NODELAY set
* Connected to localhost (127.0.0.1) port 8080 (#0)
> POST /realms/C/protocol/openid-connect/token HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.55.1
> Accept: */*
> Content-Length: 236
> Content-Type: application/x-www-form-urlencoded
>
* upload completely sent off: 236 out of 236 bytes
  < HTTP/1.1 200 OK
  < Referrer-Policy: no-referrer
  < X-Frame-Options: SAMEORIGIN
  < Strict-Transport-Security: max-age=31536000; includeSubDomains
  < Cache-Control: no-store
  < X-Content-Type-Options: nosniff
  < Pragma: no-cache
  < X-XSS-Protection: 1; mode=block
  < Content-Type: application/json
  < content-length: 3108
  <
  {"access_token":"eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJLMGJpdV9sRG9XU3dpXzV3UjRCYjdqMV9kMDZoWkljanJjdl9jQ1lNdG44In0.eyJleHAiOjE2NTc1NDk5MDEsImlhdCI6MTY1NzU0OTYwMSwiYXV0aF90aW1lIjoxNjU3NTQ5NTcwLCJqdGkiOiJmMmNkZmI0ZS1mMTBlLTRjNjQtODk4NC00MDMwY2E0YTY1MWMiLCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjgwODAvcmVhbG1zL0MiLCJhdWQiOiJhY2NvdW50Iiwic3ViIjoiODhmZmJjNzUtNWEyMC00NzRiLThjZTAtMDE5MTFiOTAzNDBkIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiYyIsInNlc3Npb25fc3RhdGUiOiIxZTE1Nzc4My0wZmIwLTQ4YzItOGUzMy0wN2E4ODllMzkxMDgiLCJhY3IiOiIxIiwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbImRlZmF1bHQtcm9sZXMtYyIsIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6Im9wZW5pZCBlbWFpbCBwcm9maWxlIiwic2lkIjoiMWUxNTc3ODMtMGZiMC00OGMyLThlMzMtMDdhODg5ZTM5MTA4IiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJtZSJ9.H9Hl7l1Sd6-iVqjkV3u1Dj8qLfeLwCKBpAHgx1hEttuTzaKwdBK7koihBU0EBhq8YQTw72J8w8DytkpsnKqR0ETitLs1H4QqTZYXQxcNA1KOgjdvBhS2fUeexcP-8veUFlVzUW_ey9DgYAgrqlYVG1OC7qQgDKoStDoaE2rMWE3n29UDzwHpYSR-4ES4bS58pEBL8o97hnkMbRJ5vMONp_am4slJNv-MS-UwaaNfmqN5upo4eiyTBMpMJAaRo5IB1GkqiLmnXV_095wCWd0a_5ffRT4szpTeVaFF-fYC3OKsju3jYaygAFm3L5Bk8slxzwz7obNn3pkBRXY70Rp8ZA","expires_in":300,"refresh_expires_in":1800,"refresh_token":"eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICI3Y2YxNGYwMi0yY2MwLTQ4MDYtYWE3OC0zMzNkZTExYTkwM2IifQ.eyJleHAiOjE2NTc1NTE0MDEsImlhdCI6MTY1NzU0OTYwMSwianRpIjoiZmE0MmMyNzQtODhkMC00Yzg5LWI5ZTItYTBiMmM3ZTJkMTAwIiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwL3JlYWxtcy9DIiwiYXVkIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwL3JlYWxtcy9DIiwic3ViIjoiODhmZmJjNzUtNWEyMC00NzRiLThjZTAtMDE5MTFiOTAzNDBkIiwidHlwIjoiUmVmcmVzaCIsImF6cCI6ImMiLCJzZXNzaW9uX3N0YXRlIjoiMWUxNTc3ODMtMGZiMC00OGMyLThlMzMtMDdhODg5ZTM5MTA4Iiwic2NvcGUiOiJvcGVuaWQgZW1haWwgcHJvZmlsZSIsInNpZCI6IjFlMTU3NzgzLTBmYjAtNDhjMi04ZTMzLTA3YTg4OWUzOTEwOCJ9.y6PSk9yFknOeMc4IsupNR7SzeLh3u3BxDsWFqVMHHkg","token_type":"Bearer","id_token":"eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJLMGJpdV9sRG9XU3dpXzV3UjRCYjdqMV9kMDZoWkljanJjdl9jQ1lNdG44In0.eyJleHAiOjE2NTc1NDk5MDEsImlhdCI6MTY1NzU0OTYwMSwiYXV0aF90aW1lIjoxNjU3NTQ5NTcwLCJqdGkiOiJkZGMyNDdiOC1iMjJjLTQ1MzgtYmU5NC00Zjk3Yjc4MjA2ZTMiLCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjgwODAvcmVhbG1zL0MiLCJhdWQiOiJjIiwic3ViIjoiODhmZmJjNzUtNWEyMC00NzRiLThjZTAtMDE5MTFiOTAzNDBkIiwidHlwIjoiSUQiLCJhenAiOiJjIiwic2Vzc2lvbl9zdGF0ZSI6IjFlMTU3NzgzLTBmYjAtNDhjMi04ZTMzLTA3YTg4OWUzOTEwOCIsImF0X2hhc2giOiJpczh2TVBGWEd5UnFWbTYweWNuS1V3IiwiYWNyIjoiMSIsInNpZCI6IjFlMTU3NzgzLTBmYjAtNDhjMi04ZTMzLTA3YTg4OWUzOTEwOCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwicHJlZmVycmVkX3VzZXJuYW1lIjoibWUifQ.a3VzP0_xC6SN7iKoXBIopeqWmjygRBJTI3-Ae7q4QYuM31ZAvuZTYDF32mgXQOOWrI4FDLoDuLl2l0EEuBZjsc9f5KLJZIbZPaAzFxPmVuB7Ow_kPEz27rIarf2XgKy_sa6-surVV4VlHG3TevujLw6d-3J-R_l470LpKDiNIOVfRsHQcyj7Y28-9P3BFlSSRx1KZ1bQqCnBQsb8SsA2BqanZQoDeRs3UdFEIZ7_qZB7__tHjhbmXuoSe0MlztmXxT2_Pzx8F-YdIcbSQ5vAlZxW1mBhG5b1uTtJ7mD6IFp7spLOfaqFy68Yzpc_AoUEmbxuIKIYteUpUl2wkbySJQ","not-before-policy":0,"session_state":"1e157783-0fb0-48c2-8e33-07a889e39108","scope":"openid email profile"}* Connection #0 to host localhost left intact

C:\kc\007\001>
```