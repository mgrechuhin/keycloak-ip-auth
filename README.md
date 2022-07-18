# keycloak-ip-http-header-auth

```
curl -v -H 'MF-DEVICE-IP: 1.1.1.1' -H 'MF-DEVICE-IP-PROOF: proof' 'http://localhost:8080/realms/MyRealm/protocol/openid-connect/auth?client_id=myclient&redirect_uri=http%3A%2F%2Fdummy&state=dummy_state&response_mode=fragment&response_type=code&scope=openid'

curl -v -d "code=
66eff229-79f0-4900-9d92-5b24eadcaf3e.1278d718-4ce0-4d6d-838d-46e94d41765d.0455e4a3-99a9-4293-8c93-cd9245fa8328
&client_id=myclient&client_secret=wX5Gd8cDZb3QIeNQIvESskyWaKsUp8S1&redirect_uri=http%3A%2F%2Fdummy&grant_type=authorization_code" http://localhost:8080/realms/C/protocol/openid-connect/token

curl -v -d "code=38f34ed5-2dac-4fd4-9bb4-7ab71eb5fb31.4964be0f-cd3d-4c5e-9489-8a60e391374b.f7af5437-73e7-486f-bc07-2539735d1cc1&client_id=myclient&client_secret=wX5Gd8cDZb3QIeNQIvESskyWaKsUp8S1&redirect_uri=http%3A%2F%2Fdummy&grant_type=authorization_code" http://localhost:8080/realms/MyRealm/protocol/openid-connect/token


&code_challenge=WIwW8sZaGckIxtqi_L2h4-Mgk06-X2ffV95NdDo1_bw&code_challenge_method=S256


&code_verifier=jWJS7olsI78LF-hcNHO1QBMqVX06iN5Z837vD6UXO3g
```
