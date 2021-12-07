# PremiumUsersApi

All URIs are relative to *https://pasty.ir/spotify/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFriend**](PremiumUsersApi.md#addFriend) | **POST** /add_friend/{friend_username} | Add a friend (request for friendship or accept the request) (just for premium users)
[**getFriendPlaylists**](PremiumUsersApi.md#getFriendPlaylists) | **GET** /playlists/{friend_username} | Get playlists of a friend
[**getFriendRequests**](PremiumUsersApi.md#getFriendRequests) | **GET** /friend_requests | Get username of users who have requested for friendship (just for premium users)
[**getFriends**](PremiumUsersApi.md#getFriends) | **GET** /friends | Get username of friends (just for premium users)

<a name="addFriend"></a>
# **addFriend**
> InlineResponse2006 addFriend(friendUsername)

Add a friend (request for friendship or accept the request) (just for premium users)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PremiumUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");


PremiumUsersApi apiInstance = new PremiumUsersApi();
String friendUsername = "friendUsername_example"; // String | The username of the friend
try {
    InlineResponse2006 result = apiInstance.addFriend(friendUsername);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PremiumUsersApi#addFriend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **friendUsername** | **String**| The username of the friend |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFriendPlaylists"></a>
# **getFriendPlaylists**
> Playlists getFriendPlaylists(friendUsername)

Get playlists of a friend

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PremiumUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");


PremiumUsersApi apiInstance = new PremiumUsersApi();
String friendUsername = "friendUsername_example"; // String | The username of the playlist
try {
    Playlists result = apiInstance.getFriendPlaylists(friendUsername);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PremiumUsersApi#getFriendPlaylists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **friendUsername** | **String**| The username of the playlist |

### Return type

[**Playlists**](Playlists.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFriendRequests"></a>
# **getFriendRequests**
> List&lt;String&gt; getFriendRequests()

Get username of users who have requested for friendship (just for premium users)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PremiumUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");


PremiumUsersApi apiInstance = new PremiumUsersApi();
try {
    List<String> result = apiInstance.getFriendRequests();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PremiumUsersApi#getFriendRequests");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFriends"></a>
# **getFriends**
> List&lt;String&gt; getFriends()

Get username of friends (just for premium users)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PremiumUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");


PremiumUsersApi apiInstance = new PremiumUsersApi();
try {
    List<String> result = apiInstance.getFriends();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PremiumUsersApi#getFriends");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

