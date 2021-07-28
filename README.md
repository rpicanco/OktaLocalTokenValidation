# OktaLocalTokenValidation
A local token validation functionality for tokens issued by Okta Authorization Server. 

### Prerequisites

1. Create an account in Okta website;
2. Create an app;
3. Generate a token for the app;

## Usage

Program accepts as input in this sequence:

1. The Api default.
e.g.
```api://default```
2. The issuer.
e.g
```https://dev-<<XXXXXXXX>>.okta.com/oauth2/default```
3. The token to be verified.
e.g
```eyJraWQiOiJWSXJkLVRabGJqZW53MFVwV0tMQUl2YmlOVDNKRFh6OE94Sk1fUHJMekIwIiwiYWxnIjoiUlMyNTYifQ.eyJ2ZXIiOjEsImp0aSI6IkFULnlnS0ZJS3FoZUpMelBTeHBFZ3cwMnhJXzRsR3A3Tms3bExwdFVNMmE2dTQiLCJpc3MiOiJodHRwczovL2Rldi05MDE3NTA3NC5va3RhLmNvbS9vYXV0aDIvZGVmYXVsdCIsImF1ZCI6ImFwaTovL2RlZmF1bHQiLCJpYXQiOjE2MjU3NTM4ODQsImV4cCI6MTYyNTc1NzQ4NCwiY2lkIjoiMG9hMTYxdHJqNTZFY0hCNU81ZDciLCJ1aWQiOiIwMHUxNXFybnNhNlU0blEzbzVkNyIsInNjcCI6WyJwaG90b3MiXSwic3ViIjoicm9icGljYW5jb0BnbWFpbC5jb20ifQ.uHm7VPsZoEHZywKn3xgGiNDDfwMXJtl2uXAJg55qvo8zqR6QbRIJpY_2gkObhEdSKFz9rO0aSKP4fvT5qHHvKFyIZR3R6Xc5Gd7Rp7cvU9X_3PC-fXhzVS35zNXe7WnBEVDr6uDqoY6GknFumdrItSyxrcUc2LDsfCRhgcoN7UMplgvGdzD1MEQ7ztJN8u7wWMspzXvIIBw3On6_iwW4ii09MvXLp6J8zVabi6RkZ1nDe9wVfbO2efw3S5e7881j6IrGa3x6ZaOWILVzHsKnHlLJFX3RePdqu-H5cAbpB7sP9oJ9r_RuQck_Q_YYRlwKDU6Q6fYToFdiGrWMReUKsw```

