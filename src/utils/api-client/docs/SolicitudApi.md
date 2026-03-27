# SolicitudApi

All URIs are relative to *http://localhost*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**solicitudComprobarSolicitudGet**](#solicitudcomprobarsolicitudget) | **GET** /Solicitud/ComprobarSolicitud | |
|[**solicitudGetSolicitudesUsuarioGet**](#solicitudgetsolicitudesusuarioget) | **GET** /Solicitud/GetSolicitudesUsuario | |
|[**solicitudSolicitarPost**](#solicitudsolicitarpost) | **POST** /Solicitud/Solicitar | |

# **solicitudComprobarSolicitudGet**
> Array<number> solicitudComprobarSolicitudGet()


### Example

```typescript
import {
    SolicitudApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SolicitudApi(configuration);

let nombreUsuario: string; // (optional) (default to undefined)
let tok: number; // (optional) (default to undefined)

const { status, data } = await apiInstance.solicitudComprobarSolicitudGet(
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

**Array<number>**

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

# **solicitudGetSolicitudesUsuarioGet**
> Array<number> solicitudGetSolicitudesUsuarioGet()


### Example

```typescript
import {
    SolicitudApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SolicitudApi(configuration);

let nombreUsuario: string; // (optional) (default to undefined)

const { status, data } = await apiInstance.solicitudGetSolicitudesUsuarioGet(
    nombreUsuario
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **nombreUsuario** | [**string**] |  | (optional) defaults to undefined|


### Return type

**Array<number>**

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

# **solicitudSolicitarPost**
> object solicitudSolicitarPost()


### Example

```typescript
import {
    SolicitudApi,
    Configuration,
    Solicitud
} from './api';

const configuration = new Configuration();
const apiInstance = new SolicitudApi(configuration);

let nombreUsuario: string; // (optional) (default to undefined)
let solicitud: Solicitud; // (optional)

const { status, data } = await apiInstance.solicitudSolicitarPost(
    nombreUsuario,
    solicitud
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **solicitud** | **Solicitud**|  | |
| **nombreUsuario** | [**string**] |  | (optional) defaults to undefined|


### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**201** | Created |  -  |
|**400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

