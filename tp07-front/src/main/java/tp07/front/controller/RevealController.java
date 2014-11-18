package tp07.front.controller;

import java.io.IOException;

import javax.websocket.EncodeException;
import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import tp07.front.data.Slide;

@ServerEndpoint(value = "/control", encoders = { SlideEncoder.class }, decoders = { SlideDecoder.class })
public class RevealController {

	@OnMessage
	public void message(Slide slide, Session session) {
		for (Session s : session.getOpenSessions()) {
			if (s.isOpen()) {
				send(s, slide);
			}
		}
	}

	private void send(Session s, Slide slide) {
		try {
			s.getBasicRemote().sendObject(slide);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncodeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
