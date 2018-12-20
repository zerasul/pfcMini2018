package pfcmini2018.tasks;

import org.mule.api.annotations.param.Payload;

import pfcmini2018.common.Response;

public interface Task {

	public Response makeAction(@Payload Response response);
}
