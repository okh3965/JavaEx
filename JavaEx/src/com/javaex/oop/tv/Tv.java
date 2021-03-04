package com.javaex.oop.tv;

public class Tv {
	//field
	private int channel;
	private int volume;
	private boolean power;
	
	
	//사용자지정 생성자
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	//기본생성자
	public Tv() {}
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}

	public void power(boolean on) {
		if(on) {
			this.power = true;
			System.out.println("전원 켜짐");
		}
		else {
			this.power = false;
			System.out.println("전원 꺼짐");
		}
		
	}
	
	public void channel(int channel) {
		this.channel = channel;
		
		if(channel > 255)this.channel = 255;
		else if(channel <1)this.channel = 1;
	}
	
	public void channel(boolean up) {
		if(up)this.channel += 1;
		else this.channel -= 1;
		
		if(this.channel == 256)this.channel = 1;
		else if(this.channel == 0)this.channel = 255;
		else;
	}
	
	public void volume(int volume) {
		this.volume = volume;
		
		if(volume > 100)this.volume = 100;
		else if(volume < 0)this.volume = 0;
	}
	
	public void volume(boolean up) {
		if(up)this.volume++;
		else this.volume--;
		
		if(this.volume == 101)this.volume = 100;
		else if(this.volume == -1)this.volume = 0;
	}
	
	public void status() {
		System.out.printf("채널 : %d, 볼륨 : %d%n", getChannel(), getVolume());
	}
	
}
