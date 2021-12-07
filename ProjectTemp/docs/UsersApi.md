# UsersApi

All URIs are relative to *https://pasty.ir/spotify/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTrackToPlaylist**](UsersApi.md#addTrackToPlaylist) | **PUT** /playlists/{playlist_id}/{track_id} | Add a track to a playlist
[**createPlaylist**](UsersApi.md#createPlaylist) | **POST** /playlists | Create new playlist
[**deletePlaylist**](UsersApi.md#deletePlaylist) | **DELETE** /playlists/{playlist_id} | Delete a playlist
[**getPlaylistsInfo**](UsersApi.md#getPlaylistsInfo) | **GET** /playlists | Get playlists info
[**getProfileInfo**](UsersApi.md#getProfileInfo) | **GET** /profile | Get profile info
[**getTracksInfo**](UsersApi.md#getTracksInfo) | **GET** /tracks | Get tracks info
[**removeTrackFromPlaylist**](UsersApi.md#removeTrackFromPlaylist) | **DELETE** /playlists/{playlist_id}/{track_id} | Remove a track from a playlist
[**upgradeToPremium**](UsersApi.md#upgradeToPremium) | **GET** /upgrade | Upgrade to premium with a chance of 10%
[**upgradeToPremiumTest**](UsersApi.md#upgradeToPremiumTest) | **GET** /upgrade/test | Upgrade to premium with a chance of 100% (just for testing)

<a name="addTrackToPlaylist"></a>
# **addTrackToPlaylist**
> InlineResponse2001 addTrackToPlaylist(playlistId, trackId)

Add a track to a playlist

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");


UsersApi apiInstance = new UsersApi();
Integer playlistId = 56; // Integer | The ID of the playlist
String trackId = "trackId_example"; // String | The ID of the track
try {
    InlineResponse2001 result = apiInstance.addTrackToPlaylist(playlistId, trackId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#addTrackToPlaylist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlistId** | **Integer**| The ID of the playlist |
 **trackId** | **String**| The ID of the track |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPlaylist"></a>
# **createPlaylist**
> InlineResponse2004 createPlaylist(body)

Create new playlist

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");


UsersApi apiInstance = new UsersApi();
PlaylistsBody body = new PlaylistsBody(); // PlaylistsBody | 
try {
    InlineResponse2004 result = apiInstance.createPlaylist(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#createPlaylist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PlaylistsBody**](PlaylistsBody.md)|  |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePlaylist"></a>
# **deletePlaylist**
> InlineResponse2001 deletePlaylist(playlistId)

Delete a playlist

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");


UsersApi apiInstance = new UsersApi();
Integer playlistId = 56; // Integer | The ID of the playlist
try {
    InlineResponse2001 result = apiInstance.deletePlaylist(playlistId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deletePlaylist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlistId** | **Integer**| The ID of the playlist |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPlaylistsInfo"></a>
# **getPlaylistsInfo**
> Playlists getPlaylistsInfo()

Get playlists info

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");


UsersApi apiInstance = new UsersApi();
try {
    Playlists result = apiInstance.getPlaylistsInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getPlaylistsInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Playlists**](Playlists.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProfileInfo"></a>
# **getProfileInfo**
> InlineResponse2003 getProfileInfo()

Get profile info

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");


UsersApi apiInstance = new UsersApi();
try {
    InlineResponse2003 result = apiInstance.getProfileInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getProfileInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTracksInfo"></a>
# **getTracksInfo**
> Tracks getTracksInfo()

Get tracks info

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");


UsersApi apiInstance = new UsersApi();
try {
    Tracks result = apiInstance.getTracksInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getTracksInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Tracks**](Tracks.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeTrackFromPlaylist"></a>
# **removeTrackFromPlaylist**
> InlineResponse2001 removeTrackFromPlaylist(playlistId, trackId)

Remove a track from a playlist

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");


UsersApi apiInstance = new UsersApi();
Integer playlistId = 56; // Integer | The ID of the playlist
String trackId = "trackId_example"; // String | The ID of the track
try {
    InlineResponse2001 result = apiInstance.removeTrackFromPlaylist(playlistId, trackId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#removeTrackFromPlaylist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlistId** | **Integer**| The ID of the playlist |
 **trackId** | **String**| The ID of the track |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="upgradeToPremium"></a>
# **upgradeToPremium**
> InlineResponse2005 upgradeToPremium()

Upgrade to premium with a chance of 10%

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");


UsersApi apiInstance = new UsersApi();
try {
    InlineResponse2005 result = apiInstance.upgradeToPremium();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#upgradeToPremium");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="upgradeToPremiumTest"></a>
# **upgradeToPremiumTest**
> InlineResponse2005 upgradeToPremiumTest()

Upgrade to premium with a chance of 100% (just for testing)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");


UsersApi apiInstance = new UsersApi();
try {
    InlineResponse2005 result = apiInstance.upgradeToPremiumTest();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#upgradeToPremiumTest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

