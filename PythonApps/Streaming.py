import tweepy.streaming
from tweepy import OAuthHandler
from tweepy import Stream


class StdOutListener(StreamListener):
    def on_data(self, data):
        print(data.rstrip())
        return True

    def on_error(self, status):
        print(status)

if__name__ == "__main__":
    l = StdOutListener()
    auth = OAuthHandler(consumer_key, consumer_secret)
    auth.set_access_token(access_token, access_token_secret)

    stream = Stream(auth, l)
    stream.filter(track=['haiti'])