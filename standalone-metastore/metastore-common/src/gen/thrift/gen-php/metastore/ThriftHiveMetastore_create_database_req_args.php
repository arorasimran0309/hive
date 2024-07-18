<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class ThriftHiveMetastore_create_database_req_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'createDatabaseRequest',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\CreateDatabaseRequest',
        ),
    );

    /**
     * @var \metastore\CreateDatabaseRequest
     */
    public $createDatabaseRequest = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['createDatabaseRequest'])) {
                $this->createDatabaseRequest = $vals['createDatabaseRequest'];
            }
        }
    }

    public function getName()
    {
        return 'ThriftHiveMetastore_create_database_req_args';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::STRUCT) {
                        $this->createDatabaseRequest = new \metastore\CreateDatabaseRequest();
                        $xfer += $this->createDatabaseRequest->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('ThriftHiveMetastore_create_database_req_args');
        if ($this->createDatabaseRequest !== null) {
            if (!is_object($this->createDatabaseRequest)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('createDatabaseRequest', TType::STRUCT, 1);
            $xfer += $this->createDatabaseRequest->write($output);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
