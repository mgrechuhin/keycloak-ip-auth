# keycloak-ip-http-header-auth

```
curl -v -H "MF-DEVICE-IP: 1.1.1.1" -H "MF-DEVICE-IP-PROOF: proof" "http://localhost:8080/realms/C/protocol/openid-connect/auth?client_id=c&redirect_uri=http%3A%2F%2Fdummy&state=dummy_state&response_mode=fragment&response_type=code&scope=openid"

curl -v -d "code=
66eff229-79f0-4900-9d92-5b24eadcaf3e.1278d718-4ce0-4d6d-838d-46e94d41765d.0455e4a3-99a9-4293-8c93-cd9245fa8328
&client_id=c&client_secret=hNguhRIQ0YDYpZB35oY3FADOgt2HK4q3&redirect_uri=http%3A%2F%2Fdummy&grant_type=authorization_code" http://localhost:8080/realms/C/protocol/openid-connect/token


&code_challenge=WIwW8sZaGckIxtqi_L2h4-Mgk06-X2ffV95NdDo1_bw&code_challenge_method=S256


&code_verifier=jWJS7olsI78LF-hcNHO1QBMqVX06iN5Z837vD6UXO3g
```