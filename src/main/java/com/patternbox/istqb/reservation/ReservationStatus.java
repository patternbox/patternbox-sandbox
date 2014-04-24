/**
 * ************************** Copyright notice ********************************
 *
 * Copyright (C)2014 by D. Ehms, http://www.patternbox.com All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer. 2. Redistributions in
 * binary form must reproduce the above copyright notice, this list of
 * conditions and the following disclaimer in the documentation and/or other
 * materials provided with the distribution. THIS SOFTWARE IS PROVIDED BY THE
 * AUTHOR AND CONTRIBUTORS ``AS IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE AUTHOR
 * OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR
 * OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *****************************************************************************
 */
package com.patternbox.istqb.reservation;

/**
 * GoF: State pattern implementation.<br>
 * Source: <a
 * href="http://www.javacodegeeks.com/2011/02/state-pattern-domain-driven-design.html">Using the
 * State pattern in a Domain Driven Design</a>
 * 
 * @author <a href='http://www.patternbox.com'>D. Ehms, Patternbox</a>
 */
public enum ReservationStatus implements ReservationStatusOps {
	//
	NEW(new ReservationNew()),
	//
	ACCEPTED(new ReservationAccepted()),
	//
	PAID(new ReservationPaid()),
	//
	CANCELLED(new ReservationCancelled());

	private final ReservationStatusOps operations;

	ReservationStatus(ReservationStatusOps operations) {
		this.operations = operations;
	}

	@Override
	public ReservationStatus accept(Reservation reservation) {
		return operations.accept(reservation);
	}

	@Override
	public ReservationStatus charge(Reservation reservation) {
		return operations.charge(reservation);
	}

	@Override
	public ReservationStatus cancel(Reservation reservation) {
		return operations.cancel(reservation);
	}
}
