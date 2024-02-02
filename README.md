# Simple Mail Sender DEMO
Simple API that sends Emails (DEMO)

## Documentation
sends a simple email

```http
  POST /mail/send/{mailrecipient}
```
| RequestBody   | Type       | Description                           |
| :---------- | :--------- | :---------------------------------- |
| `subject` | `string` | The subject of the email |
| `message` | `string` | The message of the email |
