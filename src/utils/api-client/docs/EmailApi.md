# EmailApi

All URIs are relative to *http://localhost*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**emailPost**](#emailpost) | **POST** /Email | |

# **emailPost**
> EmailResponse emailPost()


### Example

```typescript
import {
    EmailApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new EmailApi(configuration);

let emailAddress: string; // (optional) (default to undefined)
let message: string; // (optional) (default to undefined)

const { status, data } = await apiInstance.emailPost(
    emailAddress,
    message
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **emailAddress** | [**string**] |  | (optional) defaults to undefined|
| **message** | [**string**] |  | (optional) defaults to undefined|


### Return type

**EmailResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**201** | Created |  -  |
|**400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

