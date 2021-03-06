/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.agency.transform.v20200324;

import com.aliyuncs.agency.model.v20200324.TransferUserToResellerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TransferUserToResellerResponseUnmarshaller {

	public static TransferUserToResellerResponse unmarshall(TransferUserToResellerResponse transferUserToResellerResponse, UnmarshallerContext _ctx) {
		
		transferUserToResellerResponse.setRequestId(_ctx.stringValue("TransferUserToResellerResponse.RequestId"));
		transferUserToResellerResponse.setMsg(_ctx.stringValue("TransferUserToResellerResponse.Msg"));
		transferUserToResellerResponse.setCode(_ctx.stringValue("TransferUserToResellerResponse.Code"));
		transferUserToResellerResponse.setData(_ctx.booleanValue("TransferUserToResellerResponse.Data"));
	 
	 	return transferUserToResellerResponse;
	}
}