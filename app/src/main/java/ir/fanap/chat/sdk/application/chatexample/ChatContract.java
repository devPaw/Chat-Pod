package ir.fanap.chat.sdk.application.chatexample;

import android.arch.lifecycle.LiveData;

import com.fanap.podchat.model.Invitee;

import java.util.ArrayList;

public interface ChatContract {
    interface view {

        void onGetContacts(String content);

        void onGetUserInfoId(int UserId);
    }

    interface presenter {

        void connect(String serverAddress, String appId, String severName, String token, String ssoHost, String platformHost);

        void getThread(int count, int offset);

        void getUserInfo();

        void getHistory(int count, int offset);

        void getHistory(int count, int offset, String order, long subjectId);

        void getContact(int count, int offset);

        void createThread(int threadType, Invitee[] invitee, String threadTitle);

        void sendTextMessage(String textMessage, long threadId);

        void sendReplyMessage(String messageContent, long threadId, long messageId);

        LiveData<String> getLiveState();

        void muteThread(int threadId);

        void renameThread(long threadId, String title);

        void unMuteThread(int threadId);

        void editMessage(int messageId, String messageContent);

        void getThreadParticipant(int count, int offset, long threadId);

        void addContact(String firstName, String lastName, String cellphoneNumber, String email);

        void removeContact(long id);

        void forwardMessage(long threadId, ArrayList<Long> messageIds);

        void updateContact(long id, String firstName, String lastName, String cellphoneNumber, String email);
    }
}