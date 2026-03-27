# ResultadosApi

All URIs are relative to *http://localhost*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**resultadosPost**](#resultadospost) | **POST** /Resultados | |

# **resultadosPost**
> object resultadosPost()


### Example

```typescript
import {
    ResultadosApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ResultadosApi(configuration);

let nombreUsuario: string; // (optional) (default to undefined)
let tok: number; // (optional) (default to undefined)

const { status, data } = await apiInstance.resultadosPost(
    nombreUsuario,
    tok
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **nombreUsuario** | [**string**] |  | (optional) defaults to undefined|
| **tok** | [**number**] |  | (optional) defaults to undefined|


### Return type

**object**

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

