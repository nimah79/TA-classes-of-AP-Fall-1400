import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.AuthApi;
import io.swagger.client.api.DefaultApi;
import io.swagger.client.api.PremiumUsersApi;
import io.swagger.client.api.UsersApi;
import io.swagger.client.auth.ApiKeyAuth;
import io.swagger.client.auth.OAuth;
import io.swagger.client.model.AuthLoginBody;
import io.swagger.client.model.PlaylistsBody;

public class Example {

    public static void main(String[] args) throws ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("{You API key}");
        DefaultApi defaultApi = new DefaultApi();
        /* Check User API Key */
//        defaultApi.ping();
//        System.out.println(defaultApi.reset().isSuccess());

        /* Auth API Section */
        AuthApi authApi = new AuthApi(defaultClient);

        /* SignUp */
//        try {
//            AuthSignupBody authSignupBody = new AuthSignupBody();
//            authSignupBody.setUsername("admin");
//            authSignupBody.setPassword("1234@Sa!");
//            System.out.println(authApi.signUp(authSignupBody));
//        } catch (ApiException apiException) {
//            System.out.println(apiException.getResponseBody());
//        }

        /* Login */
        String token = "";
//        try {
//            AuthLoginBody authLoginBody = new AuthLoginBody();
//            authLoginBody.setUsername("mra");
//            authLoginBody.setPassword("1234@Sa!");
//            token = (authApi.login(authLoginBody).getToken());
//        } catch (ApiException apiException) {
//            System.out.println(apiException.getResponseBody());
//        }
//
        /* After logging in or signing up, set client's token */
//        defaultClient.setAccessToken(token);
//        OAuth bearerAuth = (OAuth) defaultClient.getAuthentication("bearerAuth");
//        bearerAuth.setAccessToken(token);

        /* User API's Section */
        UsersApi usersApi = new UsersApi(defaultClient);

        /* Get Profile Info */
//        try {
//            System.out.println(usersApi.getProfileInfo().toString());
//        } catch (ApiException apiException) {
//            System.out.println(apiException.getResponseBody());
//        }

        /* Get Tracks Info */
//        try {
//            System.out.println(usersApi.getTracksInfo().toString());
//        } catch (ApiException apiException) {
//            System.out.println(apiException.getResponseBody());
//        }

        /* Make new Playlist *.
//        try {
//            PlaylistsBody playlistsBody = new PlaylistsBody();
//            playlistsBody.setName("My Favorite Songs");
//            System.out.println(usersApi.createPlaylist(playlistsBody).getId());
//        } catch (ApiException apiException) {
//            System.out.println(apiException.getResponseBody());
//        }

        /* Add new Song to Playlist */
//        try {
//            System.out.println(usersApi.addTrackToPlaylist(1, "7tPDxnbL6pqGd8wesq9HLl"));
//        } catch (ApiException apiException) {
//            System.out.println(apiException.getResponseBody());
//        }


        /* remove track from Playlist */
//        try {
//            System.out.println(usersApi.removeTrackFromPlaylist(1, "7JFuQSjHY65h90ZdRn02Eu"));
//        } catch (ApiException apiException) {
//            System.out.println(apiException.getResponseBody());
//        }
//
        /* Get all Playlists */
//        try {
//            System.out.println(usersApi.getPlaylistsInfo());
//        } catch (ApiException apiException) {
//            System.out.println(apiException.getResponseBody());
//        }

        /* Delete Playlist */
//        try {
//            System.out.println(usersApi.deletePlaylist(1));
//        } catch (ApiException apiException) {
//            System.out.println(apiException.getResponseBody());
//        }

        /* Upgrade user to Premium in normal mode */
//        try {
//            System.out.println(usersApi.upgradeToPremium());
//        } catch (ApiException apiException) {
//            System.out.println(apiException.getResponseBody());
//        }

        /* Premium User Section */
        PremiumUsersApi premiumUsersApi = new PremiumUsersApi(defaultClient);

        /* Get list of friends */
//        try {
//            System.out.println(premiumUsersApi.getFriends());
//        } catch (ApiException apiException) {
//            System.out.println(apiException.getResponseBody());
//        }

        /* Add new friend */
//        try {
//            System.out.println(premiumUsersApi.addFriend("admin"));
//        } catch (ApiException apiException) {
//            System.out.println(apiException.getResponseBody());
//        }

        /* New User login */
        try {
            AuthLoginBody authLoginBody = new AuthLoginBody();
            authLoginBody.setUsername("admin");
            authLoginBody.setPassword("1234@Sa!");
            token = (authApi.login(authLoginBody).getToken());
        } catch (ApiException apiException) {
            System.out.println(apiException.getResponseBody());
        }

        defaultClient.setAccessToken(token);
        OAuth bearerAuth = (OAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setAccessToken(token);

        /* Upgrade to Premium 100% */
//        try {
//            System.out.println(usersApi.upgradeToPremiumTest());
//        } catch (ApiException apiException) {
//            System.out.println(apiException.getResponseBody());
//        }

        /* Get List of Friend Requests */
        try {
            System.out.println(premiumUsersApi.getFriendRequests());
        } catch (ApiException apiException) {
            System.out.println(apiException.getResponseBody());
        }

        /* Accept Someone else's friend request */
//        try {
//            System.out.println(premiumUsersApi.addFriend("mra"));
//        } catch (ApiException apiException) {
//            System.out.println(apiException.getResponseBody());
//        }

        /* Get friend's Playlists */
        try {
            System.out.println(premiumUsersApi.getFriendPlaylists("mra"));
        } catch (ApiException apiException) {
            System.out.println(apiException.getResponseBody());
        }
    }
}
