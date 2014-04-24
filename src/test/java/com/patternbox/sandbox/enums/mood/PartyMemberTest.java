/**************************** Copyright notice ********************************

Copyright (C)2014 by D. Ehms, http://www.patternbox.com
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:
1. Redistributions of source code must retain the above copyright
notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright
notice, this list of conditions and the following disclaimer in the
documentation and/or other materials provided with the distribution.
THIS SOFTWARE IS PROVIDED BY THE AUTHOR AND CONTRIBUTORS ``AS IS'' AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
ARE DISCLAIMED. IN NO EVENT SHALL THE AUTHOR OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
SUCH DAMAGE.
 ******************************************************************************/
package com.patternbox.sandbox.enums.mood;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for {@link com.patternbox.sandbox.enums.mood.PartyMember} mood transitions.<br>
 * Naming Convention: [UnitOfWork_StateUnderTest_ExpectedBehavior]
 * 
 * @author <a href='http://www.patternbox.com'>D. Ehms, Patternbox</a>
 */
public class PartyMemberTest {

	/**
	 * Test method for {@link com.patternbox.sandbox.enums.mood.PartyMember#talk()}.
	 */
	@Test
	public void talk_InNeutralMood_StillInNeutralMood() {
		PartyMember member = new PartyMember(Mood.NEUTRAL);
		assertFalse(member.moodIsGood());
		assertFalse(member.moodIsBad());
		member.talk();
		assertFalse(member.moodIsGood());
		assertFalse(member.moodIsBad());
	}

	/**
	 * Test method for {@link com.patternbox.sandbox.enums.mood.PartyMember#talk()}.
	 */
	@Test
	public void talk_InGoodMood_StillInGoodMood() {
		PartyMember member = new PartyMember(Mood.GOOD);
		assertTrue(member.moodIsGood());
		assertFalse(member.moodIsBad());
		member.talk();
		assertTrue(member.moodIsGood());
		assertFalse(member.moodIsBad());
	}

	/**
	 * Test method for {@link com.patternbox.sandbox.enums.mood.PartyMember#talk()}.
	 */
	@Test
	public void talk_InBadMood_StillInBadMood() {
		PartyMember member = new PartyMember(Mood.BAD);
		assertFalse(member.moodIsGood());
		assertTrue(member.moodIsBad());
		member.talk();
		assertFalse(member.moodIsGood());
		assertTrue(member.moodIsBad());
	}

	/**
	 * Test method for {@link com.patternbox.sandbox.enums.mood.PartyMember#flirt()}.
	 */
	@Test
	public void flirt_InNeutralMood_ChangesToGoodMood() {
		PartyMember member = new PartyMember(Mood.NEUTRAL);
		assertFalse(member.moodIsGood());
		assertFalse(member.moodIsBad());
		member.flirt();
		assertTrue(member.moodIsGood());
		assertFalse(member.moodIsBad());
	}

	/**
	 * Test method for {@link com.patternbox.sandbox.enums.mood.PartyMember#flirt()}.
	 */
	@Test
	public void flirt_InGoodMood_StillInGoodMood() {
		PartyMember member = new PartyMember(Mood.GOOD);
		assertTrue(member.moodIsGood());
		assertFalse(member.moodIsBad());
		member.flirt();
		assertTrue(member.moodIsGood());
		assertFalse(member.moodIsBad());
	}

	/**
	 * Test method for {@link com.patternbox.sandbox.enums.mood.PartyMember#flirt()}.
	 */
	@Test
	public void flirt_InNeutralMood_ChangesToNeutralMood() {
		PartyMember member = new PartyMember(Mood.BAD);
		assertFalse(member.moodIsGood());
		assertTrue(member.moodIsBad());
		member.flirt();
		assertFalse(member.moodIsGood());
		assertFalse(member.moodIsBad());
	}

	/**
	 * Test method for {@link com.patternbox.sandbox.enums.mood.PartyMember#annoy()}.
	 */
	@Test
	public void annoy_InNeutralMood_ChangesToBadMood() {
		PartyMember member = new PartyMember(Mood.NEUTRAL);
		assertFalse(member.moodIsGood());
		assertFalse(member.moodIsBad());
		member.annoy();
		assertFalse(member.moodIsGood());
		assertTrue(member.moodIsBad());
	}

	/**
	 * Test method for {@link com.patternbox.sandbox.enums.mood.PartyMember#annoy()}.
	 */
	@Test
	public void annoy_InGoodMood_ChangesToBadMood() {
		PartyMember member = new PartyMember(Mood.GOOD);
		assertTrue(member.moodIsGood());
		assertFalse(member.moodIsBad());
		member.annoy();
		assertFalse(member.moodIsGood());
		assertTrue(member.moodIsBad());
	}

	/**
	 * Test method for {@link com.patternbox.sandbox.enums.mood.PartyMember#annoy()}.
	 */
	@Test
	public void annoy_InBadMood_StillInBadMood() {
		PartyMember member = new PartyMember(Mood.BAD);
		assertFalse(member.moodIsGood());
		assertTrue(member.moodIsBad());
		member.annoy();
		assertFalse(member.moodIsGood());
		assertTrue(member.moodIsBad());
	}
}
