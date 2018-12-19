# Go web service that allows you to upload files via POST

This came about when I needed to get files off a remote container not in my control. The only tool I had access to was curl so this was a POC that ended up working.

## Using curl to upload files example

### Uploading a single file

```bash
curl -F 'uploadfile=@/tmp/token-working.rb' http://localhost:9092/upload
```
