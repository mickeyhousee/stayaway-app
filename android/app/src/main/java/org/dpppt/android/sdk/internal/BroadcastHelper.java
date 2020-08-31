/*
 * Copyright (c) 2020 INESC TEC <https://www.inesctec.pt>
 *
 * This Source Code Form is subject to the terms of the European Union
 * Public License, v. 1.2. If a copy of the EUPL was not distributed with
 * this file, You can obtain one at https://opensource.org/licenses/EUPL-1.2.
 *
 * SPDX-License-Identifier: EUPL-1.2
 */

/*
 * Copyright (c) 2020 Ubique Innovation AG <https://www.ubique.ch>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */

package org.dpppt.android.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import org.dpppt.android.sdk.DP3T;

public class BroadcastHelper {

	public static void sendUpdateBroadcast(Context context) {
		Intent intent = new Intent(DP3T.ACTION_UPDATE);

		if (context != null) {
			  context.sendBroadcast(intent);
		}
	}

	public static void sendUpdateAndErrorBroadcast(Context context) {
		sendUpdateBroadcast(context);

		Intent intent = new Intent(DP3T.ACTION_UPDATE_ERRORS);

		if (context != null) {
			  context.sendBroadcast(intent);
		}
	}
}
